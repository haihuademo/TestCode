/**
 * 测试Switch语句
 * 可运用抛骰子
 */

//switch 语句中的变量类型可以是： byte、short、int 或者 char。
// 从 Java SE 7 开始，switch 支持字符串 String 类型了，
// 同时 case 标签必须为字符串常量或字面量。
public class TestSwitch {
    public static void main(String[] args) {
        double d = Math.random();//random 是[0,1)
        int e = 1+(int)(d*6);//相当于[0,6)
        System.out.println(e);

        switch (e){//默认int
            case 6://等于6
                System.out.println("H");
                break;
            case 5:
                System.out.println("L");
                break;
            case 4:
                System.out.println("B");
                break;
            default:
                System.out.println("nothing");
                break;

        }
//        如果 case 语句块中没有 break 语句时，JVM 并不会顺序输出每一个 case 对应的返回值，
//        而是继续匹配，匹配不成功则返回默认 case。
//        http://www.runoob.com/java/java-switch-case.html
    }
}
