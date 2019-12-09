package PhoneValidator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractorPhone {
    private String regexOperatorCodes = "^\\(?(\\d{2,4})\\)?[\\s\\.\\-]?(\\d{1,4})[\\s\\.\\-]?(\\d{3}[\\s\\.\\-]?\\d{4})$";
    Pattern phoneExtractorRegex;
    HashMap<String, HashSet<String>> codesPhones;
    private String fileTxt;

    public ExtractorPhone() {
        phoneExtractorRegex = Pattern.compile(regexOperatorCodes);
        codesPhones = new HashMap<>();
    }
    public static void main(String[] args) throws IOException {
       ExtractorPhone extractorPhone = new ExtractorPhone();
       extractorPhone.extractor();
        System.out.println(extractorPhone.codesPhones);
    }

    public void extractor() throws IOException {
        fileTxt = Files.readString(Path.of("Phone.txt"));
        /** group 1 : Operator Codes
         * group 2 : City Codes
         *group 3 : Phone Numbers
         */
        codesPhones.put("Operator Codes: ", getOperatorCodes(1));
        codesPhones.put("City Codes: ", getOperatorCodes(2));
        codesPhones.put("Phone Numbers: ", getOperatorCodes(3));
    }

    private HashSet<String> getOperatorCodes(int groupNumber) {
        Matcher matcher = phoneExtractorRegex.matcher(fileTxt);
        HashSet<String> operatorCodes = new HashSet<>();
        while (matcher.find()) {
            operatorCodes.add(matcher.group(groupNumber));
        }
        return operatorCodes;
    }
}
