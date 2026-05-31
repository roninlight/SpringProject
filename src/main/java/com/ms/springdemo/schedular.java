package com.ms.springdemo;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
public class schedular {

    @Scheduled(cron = "0 */5 * * * *")
    public void ReportBatchProcessing(){
        System.out.println("schedular that runs every 5 mins of " +
                "seconds=0, minutes=every 5, hour=any, day=any, month=any, weekday=any.");

    }
}
