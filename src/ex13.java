import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade:  ");
        double idade = sc.nextDouble();

        System.out.println(nome);
        System.out.println(idade >= 18 ? "Maior de idade" : "Menor de idade") ;
        sc.close();
    }
}
