public class Exercise2 {
    public static void main(String[] args){
        System.out.println(theCenturyItIsIn(201));
    }

    public static int  theCenturyItIsIn(int year) {
        return year%100 == 0 ? year/100 : year/100 + 1;
    }
}
