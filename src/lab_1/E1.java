package lab_1;

public class E1 {
    //用~和&实现异或
    public static void main(String[] args) {
        int ans = bitXor(1,2);
        System.out.println(ans);
    }

    static int bitXor(int x, int y){
        return ~(~x&~y) & ~(x&y);
    }
}
