package lab_1;

public class E5 {
    //不适用-操作符，求-x的值
    public static void main(String[] args) {
        System.out.println(negate(Integer.MAX_VALUE));
        System.out.println(negate(Integer.MIN_VALUE));
        System.out.println(negate(Integer.MIN_VALUE + 1));
    }
    //这里可以看到很有意思的事情是，其他的值是满足条件的，特例是Integer.MIN_VALUE的相反数是它自己
    static int negate(int x){
        return ~x+1;
    }
}
