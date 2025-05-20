import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = sc.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double n4 = sc.nextDouble();

        double media = n1 + n2 + n3 + n4/ 4;
        System.out.println(media > 7 ? "Aprovado" : "Reprovado");
        sc.close();
    }
}
