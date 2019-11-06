import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise5CountRepeatingWordsInAString {
    public static void main(String[] args) {
        System.out.println(getOccurrencesRepeatingWordsInAString("This is is a new text text that have repeating repeating repeating words"));
    }

    public static String getOccurrencesRepeatingWordsInAString(String words) {
        List<String> list = Arrays.asList(words.split(" "));
        Set<String> uniqueWords = new HashSet<>(list);
        StringBuilder result = new StringBuilder();
        for (String word : uniqueWords) {
            int frequencyWord = Collections.frequency(list, word);
            if (frequencyWord > 1) {
                result.append(word).append(": ").append(frequencyWord).append("\n");
            }
        }
        return result.toString();
    }
}
