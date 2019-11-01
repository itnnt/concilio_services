package concilio.config.reader;

import concilio.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * This class demonstrates how we can read the input of our batch job from an
 * external REST API.
 *
 * @author Petri Kainulainen
 */
public class RESTStudentReader implements ItemReader<Student> {

    private static final Logger LOGGER = LoggerFactory.getLogger(RESTStudentReader.class);

    private final String apiUrl;
    private final RestTemplate restTemplate;

    private int nextStudentIndex;
    private List<Student> studentData;

    public RESTStudentReader(String apiUrl, RestTemplate restTemplate) {
        this.apiUrl = apiUrl;
        this.restTemplate = restTemplate;
        this.nextStudentIndex = 0;
    }

    @Override
    public Student read() throws Exception {
        LOGGER.info("Reading the information of the next student");

        if (studentDataIsNotInitialized()) {
            this.studentData = fetchStudentDataFromAPI();
        }

        Student nextStudent = null;

        if (this.nextStudentIndex < this.studentData.size()) {
            nextStudent = this.studentData.get(this.nextStudentIndex);
            this.nextStudentIndex++;
        }

        LOGGER.info("Found student: {}", nextStudent);

        return nextStudent;
    }

    private boolean studentDataIsNotInitialized() {
        return this.studentData == null;
    }

    private List<Student> fetchStudentDataFromAPI() {
        LOGGER.debug("Fetching student data from an external API by using the url: {}", apiUrl);

        ResponseEntity<Student[]> response = restTemplate.getForEntity(apiUrl, Student[].class);
        Student[] studentData = response.getBody();
        LOGGER.debug("Found {} students", studentData.length);

        return Arrays.asList(studentData);
    }
}
