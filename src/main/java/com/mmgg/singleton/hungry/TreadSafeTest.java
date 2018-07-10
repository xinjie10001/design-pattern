package com.mmgg.singleton.hungry;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class TreadSafeTest {


    public static void main(String[] args) {

        int count = 100;
        CountDownLatch countDownLatch = new CountDownLatch(count);

        final Set<Hungry> syncSet = Collections.synchronizedSet(new HashSet<Hungry>());

        for (int i = 0;i<count;i++){
            new Thread(){
                @Override
                public void run(){
                    syncSet.add(Hungry.getInstance());
                }
            }.start();
            countDownLatch.countDown();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
