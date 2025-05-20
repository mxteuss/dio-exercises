import java.util.Scanner;
public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto tempo foi gasto na viagem? (Em horas) ");
        double tempo = sc.nextDouble();
        System.out.println("Qual a velocidade média durante a viagem? (Em km/h) ");
        double velocidade = sc.nextDouble();

        double distancia = tempo * velocidade;
        System.out.println("Distância percorrida: " + distancia + "km" );
        double consumo = distancia / 12;
        System.out.println("Consumo: " + consumo + "L");

        sc.close();
    }

}
