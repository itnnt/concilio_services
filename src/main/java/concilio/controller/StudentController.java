package concilio.controller;

import concilio.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> findStudents() {
        LOGGER.info("Finding all students");

        List<Student> students = createStudents();
        LOGGER.info("Found {} students", students.size());

        return students;
    }

    private List<Student> createStudents() {
        Student tony = new Student();
        tony.setEmailAddress("tony.tester@gmail.com");
        tony.setName("Tony Tester");
        tony.setPurchasedPackage("master");

        Student nick = new Student();
        nick.setEmailAddress("nick.newbie@gmail.com");
        nick.setName("Nick Newbie");
        nick.setPurchasedPackage("starter");

        Student ian = new Student();
        ian.setEmailAddress("ian.intermediate@gmail.com");
        ian.setName("Ian Intermediate");
        ian.setPurchasedPackage("intermediate");

        return Arrays.asList(tony, nick, ian);
    }
}
