package com.curry;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * scheduleWithFixedDelay  ，固定的delay之后在执行下一次，如果执行run中的任务需要5s，那么就是执行完任务之后等待5s在执行下一次。
 */
public class ScheduleThreadPool_ScheduleWithFixedDelay {
    private static  int i=0;
    private static final long delta = 1000*5;
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println("fix_delay"+i++);

                }catch (Exception ex){}
            }
        }, 0, delta, TimeUnit.MILLISECONDS);


    }
}