package com.bobo.basic.List;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by bobo on 2018/9/14/11:33.
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Runnable thread1 = new A(countDownLatch);
        Runnable thread2 = new B(countDownLatch);
        Runnable thread3 = new C(countDownLatch);
        CyclicBarrier barrier1 = new CyclicBarrier(3, thread1);
        CyclicBarrier barrier2 = new CyclicBarrier(3, thread2);
        CyclicBarrier barrier3 = new CyclicBarrier(3, thread3);

        CyclicBarrierRunnable barrierRunnable1 =
                new CyclicBarrierRunnable(barrier1, barrier2,barrier3);

        CyclicBarrierRunnable barrierRunnable2 =
                new CyclicBarrierRunnable(barrier1, barrier2,barrier3);

        CyclicBarrierRunnable barrierRunnable3 =
                new CyclicBarrierRunnable(barrier1, barrier2,barrier3);

        new Thread(barrierRunnable1).start();
        new Thread(barrierRunnable2).start();
        new Thread(barrierRunnable3).start();

    }

    static class  A implements Runnable {
        private CountDownLatch countDownLatch = null;

        public A (CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }
        @Override
        public void run() {
            long count = countDownLatch.getCount();
            if (count == 3) {
                System.out.println("1");
                countDownLatch.countDown();
            } else {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class  B implements Runnable {
        private CountDownLatch countDownLatch = null;

        public B (CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }
        @Override
        public void run() {
            long count = countDownLatch.getCount();
            if (count == 2) {
                System.out.println("2");
                countDownLatch.countDown();
            } else {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class  C implements Runnable {
        private CountDownLatch countDownLatch = null;

        public C (CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }
        @Override
        public void run() {
            long count = countDownLatch.getCount();
            if (count == 1) {
                System.out.println("3");
                countDownLatch.countDown();
            } else {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
 class CyclicBarrierRunnable implements Runnable{

    CyclicBarrier barrier1 = null;
    CyclicBarrier barrier2 = null;
     CyclicBarrier barrier3 = null;

    public CyclicBarrierRunnable(
            CyclicBarrier barrier1,
            CyclicBarrier barrier2,CyclicBarrier barrier3) {

        this.barrier1 = barrier1;
        this.barrier2 = barrier2;
        this.barrier3 = barrier3;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                    " waiting at barrier 1");
            this.barrier1.await();

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                    " waiting at barrier 2");
            this.barrier2.await();

            System.out.println(Thread.currentThread().getName() +
                    " done!");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                    " waiting at barrier 3");
            this.barrier3.await();

            System.out.println(Thread.currentThread().getName() +
                    " done!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

