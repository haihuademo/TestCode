/**
 * @author Haihuadev
 * @desc For循环
 * @create 2019-02-27 13:26
 **/
public class TestFor {
    public static void main(String[] args) {
        //1数到100
        for (int a=1;a<=100;a++){
            System.out.println(a);
        }
        //1到100到和
        int sum =0;
        for (int b=1;b<100;b++){
            sum += b;
        }
        System.out.println(sum);

        //使用for循环计算1到100以内到奇数和偶数到和
        int oddsum =0;//奇数
        int evensum =0;//偶数
        for (int c=1;c<=100;c++){
            if (c % 2 == 0){
                evensum += c;
            }else {
                oddsum += c;
            }
        }
        System.out.println("偶数为"+evensum);
        System.out.println("奇数为"+oddsum);
        System.out.println();
        //输出1到1000之间能被5整除到数
        for (int d=1;d<=1000;d++){
            if (d % 5==0){
                System.out.print(d +"\t");
            }
            if (d % 15==0){
                System.out.println();
            }
        }
        //打印九九乘法表
        for (int e=1;e<=9;e++){
            for (int f=1;f<=e;f++){
                System.out.print(e + "*" + f + "=" +(e*f) +"\t");
            }
            System.out.println();
        }
    }
}
