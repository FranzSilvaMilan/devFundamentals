import java.util.Arrays;

public class Exercise4MinMaxAverageArray {
    public static void main(String[] args) {
        System.out.println(getMinMaxAverageFromArray(new int[]{1, 2, 3, 4, 5, 6, 6, 5, 6, 7, 6}));
    }

    public static String getMinMaxAverageFromArray(int[] numbers) {
        Arrays.sort(numbers);
        int tam = numbers.length;
        StringBuilder result = new StringBuilder();
        result.append("Min Value: ").append(numbers[0]).append("\n")
                .append("Max Value: ").append(numbers[tam - 1]).append("\n")
                .append("Average: ").append(Arrays.stream(numbers).sum()/tam);
        return result.toString();
    }
}
