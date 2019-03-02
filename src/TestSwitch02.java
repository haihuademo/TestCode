/**
 * JDK7的Switch新特性
 * @author huanghaihua
 **/
public class TestSwitch02 {
    public static void main(String[] args) {
        String a = "海华";

        switch (a){ //表达式结果可以是字符串
            case "华":
                System.out.println("输入的是华");
                break;
            case "海":
                System.out.println("输入的是");
                break;
            case "海华":
                System.out.println("我是海华");
                break;
            default:
                System.out.println("666");
                break;

        }
    }
}
