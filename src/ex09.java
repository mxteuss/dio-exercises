import java.util.Scanner;
public class ex09 {
    //IMC
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");}
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");}
        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Acima do peso");}
        else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");}
        else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2(severa)");}
        else {
            System.out.println("Obesidade grau 3 (mórbida)");
            sc.close();
        }
    }
}
