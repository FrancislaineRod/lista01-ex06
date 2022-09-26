import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        double raio,area;
        System.out.print("Digite o valor do raio: ");
        raio = console.nextDouble();

        area = Math.PI*Math.pow(raio,2);
        System.out.println("O valor da área do círculo é " + area);

        console.close();
    }
}
