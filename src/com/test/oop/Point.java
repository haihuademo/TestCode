package com.test.oop;

/**
 * @author Haihuadev
 * @desc 构造方法
 * @create 2019-03-02 12:44
 **/
public class Point {
    /**
     * 构造器方法名必须和类名保持一致
     */
    double x,y,z;
    //通过构造方法初始化对象的属性
    public Point(double _x,double _y,double _z){
        x = _x;
        y = _y;
        z = _z;
    }

    public static void main(String[] args) {
        Point p = new Point(3,4,2);
        System.out.println(p.z);
    }

}
