import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a temperatura em Fahrenheit: ");
        int f = sc.nextInt();
        int c =  5 * ( f - 32) / 9;
        System.out.println("Fahrenheit: " + f );
        System.out.println("Celsius: " + c);
        sc.close();

    }
}
