//package com.healthme;
//
//import com.healthme.common.DeviceModel;
//import com.healthme.ecg.EventFileParser;
//import com.healthme.model.ECGClassification;
//import com.healthme.model.MedicalRecord;
//import org.aspectj.weaver.ast.Not;
//
//import java.awt.*;
//import java.io.*;
//import java.nio.ByteBuffer;
//import java.nio.channels.FileChannel;
//import java.util.*;
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.CyclicBarrier;
//import java.util.concurrent.atomic.AtomicInteger;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class TTTTTTTTTTTTTTTT {
//    static Object object = new Object();
//    public static void main(String[] args) {
//        System.out.println(1==1 | 0==1);
//
////        new Thread(){
////            @Override
////            public void run() {
////                test1();
////            }
////        }.start();
////        new Thread(){
////            @Override
////            public void run() {
////                test2();
////            }
////        }.start();
//
//    }
//
//    public static void test1(){
//        synchronized (object){
//            System.out.println("test1");
//            test2();
//            int i =2;
//            while (i>0){
//                System.out.println("test1");
//                try {
//                    Thread.sleep(1000L);
//                    i--;
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    public static void test2(){
//        synchronized (object){
//            int i =2;
//            while (i>0){
//                System.out.println("test2");
//                try {
//                    Thread.sleep(1000L);
//                    i--;
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//
//
//
//
//
////    public static void main(String[] args) {
////
////        int limit = 1;
////        final CountDownLatch latch = new CountDownLatch(limit);
////
////
////
////
////        for (int i = 0; i < limit; i++) {
////            //lambda???????????????final?????????
////            final int times = i;
////            new Thread(){
////                @Override
////                public void run() {
//////                    try {
////                        System.out.println("?????????" + Thread.currentThread().getName() + "????????????");
//////                        Thread.sleep(1000 * times);
////                        System.out.println("?????????" + Thread.currentThread().getName() + "????????????");
////                        //??????latch???countDown??????????????????-1
////                        latch.countDown();
////                        System.out.println("?????????" + Thread.currentThread().getName() + "????????????");
//////                    } catch (InterruptedException e) {
//////                        e.printStackTrace();
//////                    }
////                }
////            }.start();
////        }
////
////        try {
////            System.out.println("???????????????????????????...");
////            Thread.sleep(2000L);
////            //????????????????????????????????????
////            latch.await();
////            System.out.println("???????????????,??????????????????");
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
////    }
//
//
//
////    public static void main(String[] args) {
////
////        CountDownLatch countDownLatch = new CountDownLatch(10);
////        countDownLatch.countDown();
////        countDownLatch.await();
////
////
////        final CyclicBarrier cyclicBarrier = new CyclicBarrier(10, new Runnable(){
////            @Override
////            public void run() {
////                System.out.println("------------------------------------success");
////            }
////        });
////
////        for (int i = 0; i < 10; i++) {
////            final int times = i;
////            new Thread(){
////                @Override
////                public void run() {
////                    try {
////                        System.out.println("?????????" + Thread.currentThread().getName() + "????????????");
////                        Thread.sleep(1000 * times);
////                        System.out.println("?????????" + Thread.currentThread().getName() + "????????????");
////                        cyclicBarrier.await();
////                        System.out.println("?????????" + Thread.currentThread().getName() + "????????????");
////                    } catch (Exception e) {
////                        e.printStackTrace();
////                    }
////                }
////            }.start();
////        }
////
////
////    }
//
//}
