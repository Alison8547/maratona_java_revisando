package br.com.maratonajava.concorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPollTest1 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");


    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(formatter));

        beep();
    }

    public static void beep() {
        Runnable runnable = () -> {
            System.out.println(LocalTime.now().format(formatter) + " beep");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        /* scheduled.schedule(runnable, 5, TimeUnit.SECONDS);
         ScheduledFuture<?> schedule = executor.scheduleAtFixedRate(runnable, 1, 2, TimeUnit.SECONDS);

         */
        ScheduledFuture<?> schedule = executor.scheduleWithFixedDelay(runnable, 1, 2, TimeUnit.SECONDS);

        executor.schedule((Runnable) () -> {
            System.out.println("Cancelando o Schedule");
            schedule.cancel(false);
            executor.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}
