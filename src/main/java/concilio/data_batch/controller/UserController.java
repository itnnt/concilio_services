package concilio.data_batch.controller;

import concilio.data_batch.model.card.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;

    @GetMapping
    public BatchStatus jobRun() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        Map<String, JobParameter> map = new HashMap<>();
        map.put("executed_time", new JobParameter(new Date()));
        JobParameters jobParameters = new JobParameters(map);
        JobExecution jobExe = jobLauncher.run(job, jobParameters);
        logger.info("########## Loading data");
        return jobExe.getStatus();
    }

    @RequestMapping(method = RequestMethod.GET, path = "getDefaultUsers")
    public List<User> getDefaultUsers() {
        User user1 = new User(1, "Tom", "Ala", "tom.ala@gmail.com", "Fullstack Dev", 2000D);
        User user2 = new User(2, "Dory", "Yeo", "dor.y@gmail.com", "Tester", 2000D);
        User user3 = new User(3, "Cliff", "Aron", "cliff.aron@gmail.com", "Marketting", 2000D);
        User user4 = new User(4, "David", "Jordan", "dav.jor@gmail.com", "Fullstack Dev", 2000D);
        User user5 = new User(5, "Ricado", "Diaz", "rica.dia@gmail.com", "Fullstack Dev", 2000D);
        User user6 = new User(6, "Lance", "Chung", "lan.ch@gmail.com", "Fullstack Dev", 2500D);
        User user7 = new User(7, "Kyle", "Crowley", "kyle.crowley@gmail.com", "Fullstack Dev", 4500D);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        return list;
    }
}
