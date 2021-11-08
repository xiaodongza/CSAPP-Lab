package lab_1;

public class E4 {
    //判断某个数是否所有奇数次幂均为1
    public static void main(String[] args) {
        System.out.println(addOddBits(Integer.MAX_VALUE));
    }

    static boolean addOddBits(int x){
        int a = 2;
        while(a <= x && a > 0){
            if((a & x) == 0) return false;
            a <<= 2;
        }
        return true;
    }
}
