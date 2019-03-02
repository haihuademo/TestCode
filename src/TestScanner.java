import java.util.Scanner;

/**
 * @author Haihuadev
 * @desc 测试Scanner类的使用，如何接收键盘的输入    scanner翻译为扫描仪
 * @create 2019-02-27 19:41
 **/
public class TestScanner {

    public  static void test01(){
        Scanner s = new Scanner(System.in);
        String str = s.next();  //程序运行到next会堵塞，等待键盘到输入！

        System.out.println("刚才输入到数字为" +str);
    }
    /**
     * 可运用编程类似计算器 到作用  交互性程序
     */
    public  static void test02(){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个加数：");
        int a = s.nextInt();
        System.out.println("请输入一个被加数：");
        int b = s.nextInt();
        int sum =a+b;
        System.out.println("计算结果为，和为：" +sum);
    }


    public static void main(String[] args) {

        test02();   //调用test02
    }
}
