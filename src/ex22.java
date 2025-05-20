import java.util.Scanner;
public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = sc.nextInt();

        int quociente = a / b;
        int resto = a % b;
        System.out.println("Resto: " + resto +
        "\n Quociente: " + quociente);
        sc.close();

    }
}
