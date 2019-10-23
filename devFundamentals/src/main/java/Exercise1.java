public class Exercise1 {
    public static void main(String[] args){
        System.out.println(largestNumberForDigits(3));
    }

    public static int largestNumberForDigits(int number) {
        return (int)Math.pow(10,number) - 1;
    }
}
