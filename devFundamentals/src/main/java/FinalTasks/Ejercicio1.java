package FinalTasks;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {


    public static void main(String[] args) {
        Ejercicio1 ipAddressValidator;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.print("Enter the IP Address number you want to validate: ");
        String ipAddressNumber = scanner.nextLine();
        ipAddressValidator = new Ejercicio1();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The ip Address ").append("\"").append(ipAddressNumber).append("\"")
                .append(ipAddressValidator.validatePhone(ipAddressNumber) ? " is valid." : " is not valid.");
        System.out.println(stringBuilder);
        scanner.close();
    }

    public boolean validatePhone(String phoneToValidate) {
        Pattern pattern = Pattern.compile("^(?:(?:1?\\d\\d?|2[0-4]\\d|25[0-5]).){3}(?:1?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Matcher ipAddressMatcher = pattern.matcher(phoneToValidate);
        return ipAddressMatcher.matches();
    }
}
