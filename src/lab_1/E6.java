package lab_1;

public class E6 {
    public static void main(String[] args) {
        System.out.println(isAsciiDigit(0x32));
    }
    static boolean isAsciiDigit(int x){
        int sign = 1<<31;
        int upperBound = ~(sign|0x39);
        int lowerBound = ~0x30;
        upperBound = (upperBound+x)>>>31;
        lowerBound = (lowerBound+1+x)>>>31;
        //return lowerBound;
        if(upperBound == 0 && lowerBound == 0)
            return true;
        return false;
    }
}
