import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Celsius? ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = celsius * (9.0 / 5.0) + 32;
        
        System.out.printf("%.2f C = %.2f F\n", celsius, fahrenheit);
        
        scanner.close();
    }
}