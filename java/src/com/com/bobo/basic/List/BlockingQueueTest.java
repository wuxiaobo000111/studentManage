package com.bobo.basic.List;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/**
 * Created by bobo on 2018/9/13/10:20.
 */
public class BlockingQueueTest {

    public static void main(String[] args) {
        BlockingQueue<com.bobo.basic.List.MyDelayed> blockingQueue = new DelayQueue<com.bobo.basic.List.MyDelayed>();
        Producer p = new Producer(blockingQueue);
        Consumer c1 = new Consumer(blockingQueue);
        Consumer c2 = new Consumer(blockingQueue);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }

    static class Producer implements Runnable {
        private final BlockingQueue queue;

        Producer(BlockingQueue q) {
            queue = q;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    queue.put(produce());
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        public Integer produce() {
            Random random = new Random();
            int a =  random.nextInt();
            System.out.println("producer produce = "+a);
            return a;
        }
    }

    static class Consumer implements Runnable {
        private final BlockingQueue queue;

        Consumer(BlockingQueue q) {
            queue = q;
        }
        @Override
        public void run() {
            try {
                while (true) {
                    consume(queue.take());
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        void consume(Object x) throws InterruptedException {
            System.out.println(Thread.currentThread().getName()+"============"+x.toString());
            Thread.sleep(100);
        }
    }

}
