package com.spring.batch.Controller;

import com.spring.batch.Service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chander Parkash
 * June 07 2023
 */

@RestController
@RequestMapping("spring/batch/job")
@AllArgsConstructor
public class JobController {

    private final CustomerService customerService;

    @PostMapping("/importCustomers")
    public ResponseEntity<?> importCsvToDBJob() {
        try{
            return new ResponseEntity<>(this.customerService.importCsvToDb(),HttpStatus.CREATED);
        }catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
