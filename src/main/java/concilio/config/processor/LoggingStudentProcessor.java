package concilio.config.processor;

import concilio.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * This custom {@code ItemProcessor} simply writes the information of the
 * processed student to the log and returns the processed object.
 *
 */
public class LoggingStudentProcessor implements ItemProcessor<Student, Student> {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingStudentProcessor.class);

    @Override
    public Student process(Student item) throws Exception {
        LOGGER.info("Processing student information: {}", item);
        return item;
    }
}
