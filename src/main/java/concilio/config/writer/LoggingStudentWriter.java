package concilio.config.writer;

import concilio.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * This custom {@code ItemWriter} writes the information of the student to
 * the log.
 *
 */
public class LoggingStudentWriter implements ItemWriter<Student> {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingStudentWriter.class);

    @Override
    public void write(List<? extends Student> items) throws Exception {
        LOGGER.info("Received the information of {} students", items.size());

        items.forEach(i -> LOGGER.debug("Received the information of a student: {}", i));
    }
}
