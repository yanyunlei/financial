//package com.healthme;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.locks.Condition;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class Teeeet {
//    static ReentrantLock reentrantLock = new ReentrantLock();
//    static Condition condition1 = reentrantLock.newCondition();
//    static int pppppppppppp=1;
//    static Map<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();
//    static Map<String, Integer> hashMap = new HashMap<>();
//    final static CountDownLatch countDownLatch = new CountDownLatch(10000);
//    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 10; i++){
//            Thread thread = new Thread(new MyThread(i));
//            thread.start();
//        }
//
////        System.out.println("===================================");
////        countDownLatch.await();
////        System.out.println(concurrentHashMap.size());
////        System.out.println(hashMap.size());
//
//
//    }
//
//
//
//    public static class MyThread implements Runnable {
//        int i;
//        public MyThread(int i){
//            this.i  =i;
//        }
//        @Override
//        public void run() {
////            concurrentHashMap.put(String.valueOf(i),1);
////            hashMap.put(String.valueOf(i), 1);
////            countDownLatch.countDown();
//            try {
//                write();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        public void write() throws InterruptedException {
//            synchronized(this){
//                for (int o=0;o<5;o++){
//                    System.out.println("-------------"+i+"----"+o);
//                    Thread.sleep(10L);
//                }
//
//            }
//
//        }
//    }
//
//}
