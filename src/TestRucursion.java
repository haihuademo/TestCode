/**
 * @author Haihuadev
 * @desc 递归算法
 * @create 2019-02-27 18:39
 **/
public class TestRucursion {
    //递归：自己调用自己
    public static int a =0;
    public static  void test01(){
        a++;
        System.out.println("test01:"+a);
        if (a<=10){         //递归头
            test01();
        }else {             //递归体
            System.out.println("over");
        }
    }
    public  static void test02(){
        System.out.println("TestRucursion.tets02()");
    }

    //另外例子  factorial阶乘翻译   5*4*3*2*1
    public static long factorial(int n){
        if (n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        test01();
        test02();
        System.out.println(factorial(10));
    }
}
