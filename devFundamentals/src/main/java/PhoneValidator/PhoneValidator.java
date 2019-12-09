package PhoneValidator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {

    public static void main(String[] args) {
        PhoneValidator phoneValidator;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Enter the phone number you want to validate: ");
        String number = scanner.nextLine();
        phoneValidator = new PhoneValidator();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Your phone number ").append("\"").append(number).append("\"")
                .append(phoneValidator.validatePhone(number) ? " is valid." : " is not valid.");
        System.out.println(stringBuilder);
        scanner.close();
    }

    public boolean validatePhone(String phoneToValidate) {
        Pattern pattern = Pattern.compile("^\\(?\\d{2,4}\\)?[\\s\\.\\-]?\\d{2,4}[\\s\\.\\-]?\\d{3}[\\s\\.\\-]?\\d{4}$");
        Matcher validatePhone = pattern.matcher(phoneToValidate);
        return validatePhone.matches();
    }



}
