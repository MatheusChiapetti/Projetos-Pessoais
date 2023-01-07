import java.util.Scanner;

// Código em Java para calcular equações do 2° grau utilizando a Fórmula de Bhaskara.

public class eq2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Estrutura da equação do 2° grau: a*x² + b*x + c = 0;

        // Estrutura da Fórmula de Bhaskara: x = (-b +- √b² - 4*a*c)/2

        int a;
        int b;
        int c;

        double delta;
        double x1;
        double x2;

        System.out.println("Informe o valor de a: ");
        a = scanner.nextInt();
        System.out.println("Informe o valor de b: ");
        b = scanner.nextInt();
        System.out.println("Informe o valor de c: ");
        c = scanner.nextInt();

        delta = Math.pow(b, 2) - 4*a*c;

        x1 = ((b*(-1) + Math.sqrt(delta))/(2*a));

        x2 = ((b*(-1) - Math.sqrt(delta))/(2*a));

        System.out.println("Raízes da equação: x1 = " + x1 + " e x2 = " + x2);

    }
}
