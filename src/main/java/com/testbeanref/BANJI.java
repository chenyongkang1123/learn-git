package com.testbeanref;

import javax.sound.midi.SysexMessage;

/**
 * Created by Administrator on 2019/5/19.
 */
public class BANJI {
    private String name;
    private Student student;



    public BANJI(Student student) {
        System.out.println("这是BANJI带student的构造方法");
        this.student = student;
    }
    public void learn(){
        student.learnspring();
    }
}
