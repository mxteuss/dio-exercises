import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o lado A do triangulo: ");
        int a = sc.nextInt();
        System.out.println("Escreva o lado B do triangulo: ");
        int b = sc.nextInt();
        System.out.println("Escreva o lado C do triangulo: ");
        int c = sc.nextInt();

        if (a == b & b == c) {
            System.out.println("Esse triangulo é Equilátero");
        }
        else if ( a == b || b == c || a == c ) {
            System.out.println("Esse triangulo é  Isósceles");
        }
        else if (a != b && b != c && a != c) {
            System.out.println("Esse triangulo é Escaleno");
        }
        sc.close();

    }
    }

