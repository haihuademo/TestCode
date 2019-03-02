package com.test.oop;

/**
 * @author Haihuadev
 * @desc 内存机制，内存分析课程     关键词sxtstu.java    此代码复制student.class
 * @create 2019-02-28 11:59
 **/
public class Test01 {

    public static void main(String[] args) {
        //通过类加载器Class Loader加载Student类。加载后，在方法去中就有了Student类的信息
        Student student = new Student();
        student.name="Haihua";
        student.study();
        student.sayHello("老师");
    }
}
