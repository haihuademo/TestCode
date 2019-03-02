package com.demo;

/**
 * @author Haihuadev
 * @desc 控制程序流程练习
 * @create 2019-02-27 23:20
 **/
public class DemoControl {

    public static void main(String[] args) {

/**
 * (1) 写一个程序，打印出1到100间的整数。
 */
        for (int num=1;num<=100;num++){
            System.out.println(num);
        }
/**
 * (2) 修改练习(1)，在值为47时用一个break退出程序。亦可换成return试试。
 */
        for (int anum=1;anum<=100;anum++){
            switch (anum){
                case 47:
                System.out.println(anum);
                    break;

            }
        }
        //return方法
        for (int bnum=1;bnum<=100;bnum++){
           if (bnum == 47){
               System.out.println(bnum);
                    return;
           }

        }
/**
 *(3) 创建一个switch语句，为每一种case都显示一条消息。
 * 并将switch置入一个for循环里，令其尝试每一种case。
 * 在每个case后面都放置一个break，并对其进行测试。然后，删除break，看看会有什么情况出现。
 */



    }
}
