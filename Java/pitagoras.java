import java.util.Scanner;

// Código em Java para calcular o Teorema de Pitágoras.

public class pitagoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Estrutura do Teorema de Pitágoras: a² = b² + c².

        double a;
        int b;
        int c;

        System.out.println("Informe o valor de b: ");
        b = scanner.nextInt();
        System.out.println("Informe o valor de c: ");
        c = scanner.nextInt();

        a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));   
        
        System.out.println("Resultado: " + a);
    }

}