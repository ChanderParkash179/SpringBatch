package com.spring.batch.Service;

import lombok.AllArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Chander Parkash
 * June 07 2023
 */
@Service
@AllArgsConstructor
@EnableScheduling
public class CustomerService {

    JobLauncher jobLauncher;
    private Job job;


    @Scheduled(cron = "*/10 * * * * *")
    public String importCsvToDb(){
        String response = null;
        JobParameters jobParameters = new JobParametersBuilder()
                .addLong("startAt", System.currentTimeMillis()).toJobParameters();

        try {
            jobLauncher.run(job, jobParameters);
            response = "Data Imported to Customer Table from customers.csv file";
        } catch (Exception e) {
            response = null;
            e.printStackTrace();
        }
        return response;
    }
}