# Spring Batch Project 

  #### Project flow and overview
  
  1. used dependencies (spring-batch, spring-web, spring-data-jpa, mysql connector, lombok)
  2. implemented a job that will get the data from a file
  3. pasted that file at the particular location in the project
  4. job will pick all the data from the customers.csv file
  5. execute and insert the data in the table of customers at database
  6. job will again run after every 10 seconds.
  7. if records are new it'll insert new record
  8. if records has some changes then it'll update the record


> created a spring boot project by using spring data jpa and spring batch, implemented spring batch for process data of 1000 customer from customer.csv file to customer table


### author: Chander Parkash
##### contact: chanderparkash179@gmail.com
