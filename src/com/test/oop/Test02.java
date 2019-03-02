package com.test.oop;

/**
 * @author Haihuadev
 * @desc 内存机制，内存分析课程     关键词sxtstu.java
 * @create 2019-02-28 12:00
 **/
public class Test02 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name= "Haihua";
        student.age=18;

        Computer c = new Computer();
        c.brand="MacBook";
        c.cupSpeed=100;


        student.computer = c;

        System.out.println(student.computer.brand);

    }
}
