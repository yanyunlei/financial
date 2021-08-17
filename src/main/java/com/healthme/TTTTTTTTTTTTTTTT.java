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
////            //lambda中只能只用final的变量
////            final int times = i;
////            new Thread(){
////                @Override
////                public void run() {
//////                    try {
////                        System.out.println("子线程" + Thread.currentThread().getName() + "正在赶路");
//////                        Thread.sleep(1000 * times);
////                        System.out.println("子线程" + Thread.currentThread().getName() + "到公司了");
////                        //调用latch的countDown方法使计数器-1
////                        latch.countDown();
////                        System.out.println("子线程" + Thread.currentThread().getName() + "开始工作");
//////                    } catch (InterruptedException e) {
//////                        e.printStackTrace();
//////                    }
////                }
////            }.start();
////        }
////
////        try {
////            System.out.println("门卫等待员工上班中...");
////            Thread.sleep(2000L);
////            //主线程阻塞等待计数器归零
////            latch.await();
////            System.out.println("员工都来了,门卫去休息了");
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
////                        System.out.println("子线程" + Thread.currentThread().getName() + "正在准备");
////                        Thread.sleep(1000 * times);
////                        System.out.println("子线程" + Thread.currentThread().getName() + "准备好了");
////                        cyclicBarrier.await();
////                        System.out.println("子线程" + Thread.currentThread().getName() + "开始跑了");
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
