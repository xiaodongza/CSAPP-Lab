package lab_1;

public class E3 {
    //判断某个数是否为有符号数的最大值
    public static void main(String[] args) {
        System.out.println(isTmax(Integer.MAX_VALUE));
    }

    public static boolean isTmax(int x){
        int y = 1 << 31;
        if((x ^ y) == -1){
            return true;
        }
        return false;
    }

}
