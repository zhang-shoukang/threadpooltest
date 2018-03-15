package com.curry;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/**
 * scheduleAtFixedRate  ，按照固定的rate执行，那么就是每五秒执行一次
 */
public class ScheduleThreadPool_ScheduleAtFixedRate {
    private static final long delta = 5 * 1000;
    private static int i=0;
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() );
        System.out.println(delta);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                        System.out.println("fix_rate__"+i++);
                }catch (Exception ex){}
            }
        }, 0, delta, TimeUnit.MILLISECONDS);
    }
}