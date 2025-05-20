import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate hoje = LocalDate.now();
        System.out.println("Em que ano você nasceu? " );
        int anoA = sc.nextInt();
        System.out.println("Qual mês você nasceu? ");
        int mesA = sc.nextInt();
        System.out.println("Qual dia você nasceu? ");
        int diaA = sc.nextInt();
        LocalDate nascimento = LocalDate.of(anoA, mesA, diaA);

        // Calculando a idade com precisão
        java.time.Period idade = java.time.Period.between(nascimento, hoje);

        System.out.println("Idade: " + idade.getYears() + " ano(s), " +
                idade.getMonths() + " mes(es), e " +
                idade.getDays() + " dia(s)");
            // O enunciado não pede para informar o mes e dia, porém no exemplo mostra. Então eu coloquei
        sc.close();

    }
}
