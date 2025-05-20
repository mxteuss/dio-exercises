import java.util.Scanner;
public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da hora por aula: ");
        double vhAula = sc.nextDouble();
        System.out.println("Informe o número de aulas lecionadas no mês: ");
        int nAula = sc.nextInt();
        System.out.println("Informe o percentual de desconto do INSS: ");
        double per = sc.nextDouble();

        double salarioBruto = vhAula * nAula;
        double desconto = salarioBruto *  (per / 100) ;
        double salarioLiquido = salarioBruto - desconto;
        System.out.println("Salário liquido: " + salarioLiquido);
        sc.close();

    }
}
