package concilio.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("student")
public class RESTStudentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RESTStudentController.class);

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job restStudentJob;

    @RequestMapping(method = RequestMethod.GET, path = "api")
    public BatchStatus runRESTStudentBatch() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        Map<String, JobParameter> map = new HashMap<>();
        JobParameters jobParameters = new JobParameters(map);
        final JobExecution run = jobLauncher.run(restStudentJob, jobParameters);
        return run.getStatus();
    }
}
