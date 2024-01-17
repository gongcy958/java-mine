package com.yy.juc;

import java.util.concurrent.Semaphore;

/**
 * @author gongcy
 * @date 2023/6/16 4:50 下午
 * @Description
 */
public class SemaphoreDemo {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);
        for (int i=0; i < 5; i++){
            new Thread(new TaskWorker(semaphore,"矿仔+"+i)).start();
        }

    }

    static class TaskWorker extends Thread{

        Semaphore semaphore;

        public TaskWorker(Semaphore semaphore,String tname){
            this.semaphore = semaphore;
            this.setName(tname);
        }

        public void run() {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName()+":acquire() at : "+System.currentTimeMillis());
                Thread.sleep(3000);
                semaphore.release();
                System.out.println(Thread.currentThread().getName()+":release() at : "+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
