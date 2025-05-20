import java.util.Scanner;
public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double francisco = 1.5;
        double sara = 1.1;
        int anos = 0;
        while (sara < francisco) {
            sara += 0.03;
            francisco += 0.02;
            anos ++;

        }
        System.out.println("São necessários  " + anos + " para Sara ficar mais alta que Francisco");
        sc.close();

    }
}
