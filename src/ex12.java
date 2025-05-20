import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Insira o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.println("Você deseja pagar de qual forma? Insira o valor \n " +
                "1 - Dinheiro ou Pix " +
                "2 - À vista no cartão de crédito " +
                "3 - Parcelado em duas vezes no cartão " +
                "4 - Parcelado em três vezes no cartão ");
        int pagamento = sc.nextInt();
        if (pagamento == 1) {
            System.out.println("Produto: " + nome + "\n Valor: "+ valor +  " Desconto: 15%" + (valor - (valor * 0.15))  +  "\n Pagamento realizado com sucesso! ");
        }
        else if (pagamento == 2) {System.out.println("Produto: " + nome + "\n Valor: " + valor + " Desconto: 10%" + (valor - (valor * 0.1)) + "\n Pagamento realizado com sucesso! " );}

        else if (pagamento == 3) {System.out.println("Produto: " + nome + "\n Valor: " + valor + " \n Pagamento realizado com sucesso! ");}
        else if (pagamento == 4) {System.out.println("Produto: " + nome + "\n Valor: " + valor + "Taxa: 10% " + valor * 0.1 + " \n Pagamento realizado com sucesso! ");}
        else {
            System.out.println("Insira um valor válido!");
            sc.close();
        }
    }
}
