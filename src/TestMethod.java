/**
 * @author Haihuadev
 * @desc 方法Method
 * @create 2019-02-27 14:36
 **/



public class TestMethod {

    //设计方法的原则：方法的本意是功能块，就是实现某个功能的语句块的集合，我们设计方法的时候
        //最好保持方法的原子性，就是一个方法只完成1个功能，这样有利于我们后期的拓展

    public static  void test01(int g,int h,int z){  //test01()   //形式参数
        //输出1到1000之间能被5整除到数
        for (int d=1;d<=g;d++){ //原来的1000定义为g
            if (d % h==0){  //原来的整除g5改为h
                System.out.print(d +"\t");
            }
            if (d % z==0){  //原来的15改为z
                System.out.println();
            }
        }
    }


    //定义
    public static int add(int a,int b){
        int sum = a + b;
        return sum;
    }

    //调用
    public static void main(String[] args) {
        test01(1000,2,8);//int d = 1000  调用


        int s = add(3,5);
        System.out.println(s);
    }
}
