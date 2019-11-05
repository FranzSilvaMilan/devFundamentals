public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(theCenturyItIsIn(2001));
    }

    public static int theCenturyItIsIn(int year) {
        return 1 + (year - 1) / 100;
    }
}
