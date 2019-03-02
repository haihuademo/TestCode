package com.test.oop;

import sun.security.x509.CertificatePolicyMap;

/**
 * @author Haihuadev
 * @desc    面向对像编程的本质：
 *              以类的方式组织代码，以对象的方式组织（封装）数据
 *
 * @create 2019-02-27 21:19
 **/

public class Student {
    //静态的数据
    String name;
    int id;
    int age;
    String gender;
    Computer computer;  //每个学生都有电脑

    //动态的行为
    public void study(){
        System.out.println(name+"在学习");
    }

    public void sayHello(String sname){
        System.out.println("向"+ sname + "问好！");
    }

    public static void main(String[] args) {
        //通过类加载器Class Loader加载Student类。加载后，在方法去中就有了Student类的信息
        Student student = new Student();
        student.name="Haihua";
        student.study();
        student.sayHello("老师");
    }

}
