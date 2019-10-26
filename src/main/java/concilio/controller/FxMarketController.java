package concilio.controller;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("fx_market")
public class FxMarketController {
    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job jobFxMarket;

    @Autowired
    Job fxMarketPricesETLJob;

    @GetMapping
    public BatchStatus runFxMarketBatch() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        Map<String, JobParameter> map = new HashMap<>();
        map.put("time", new JobParameter(new Date()));
        JobParameters params = new JobParameters(map);
        JobExecution run = jobLauncher.run(jobFxMarket, params);
        return run.getStatus();
    }

    @GetMapping(path="/v2")
    public BatchStatus runFxMarketPricesETLJob() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        Map<String, JobParameter> map = new HashMap<>();
        map.put("time", new JobParameter(new Date()));
        JobParameters params = new JobParameters(map);
        JobExecution run = jobLauncher.run(fxMarketPricesETLJob, params);
        return run.getStatus();
    }
}
