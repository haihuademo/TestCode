/**
 * @author Haihuadev
 * @desc break和continue
 * @create 2019-02-27 14:20
 **/
public class TestBreakContinue {

    //break
        public static void main(String args[]) {
            int [] numbers = {10, 20, 30, 40, 50};

            for(int x : numbers ) {
                // x 等于 30 时跳出循环
                if( x == 30 ) {
                    break;
                }
                System.out.print( x );
                System.out.print("\n");
            }
        }
        //continue
//    public class Test {
//        public static void main(String args[]) {
//            int [] numbers = {10, 20, 30, 40, 50};
//
//            for(int x : numbers ) {
//                if( x == 30 ) {
//                    continue;
//                }
//                System.out.print( x );
//                System.out.print("\n");
//            }
//        }
    }


