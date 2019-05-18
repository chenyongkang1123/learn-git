package com.testbeanscope;

/**
 * Created by Administrator on 2019/5/18.
 */

public class Thread extends java.lang.Thread{

    @Override
    public void run() {
        super.run();
        System.out.println(java.lang.Thread.currentThread().getName());
    }

    public  static  void  main(String[]args){
        new Thread().run();
        System.out.println(java.lang.Thread.currentThread().getName());
        Thread thread = new Thread();
        thread.start();
        Thread thread1 = new Thread();
        thread1.start();
        System.out.println(thread.equals(thread1));
    }

}
