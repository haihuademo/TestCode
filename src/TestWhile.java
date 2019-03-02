/**
 * @author Haihuadev
 * @create 2019-02-27 13:10
 * @desc While循环
 **/
public class TestWhile {
    public static void main(String[] args) {
        int a =1;   //初始化
        while (a<=100){ //条件判断
            System.out.println(a);  //循环体
            a++;    //迭代
        }
        System.out.println("循环结束");
    //1+2+3+...+100
        int sum =0;
        int b =1;
        while (b<=100){
            sum += b;
            b++;
        }
        System.out.println(sum);
    }
}
