import java.util.Scanner;

// Código em Java para calcular a área de um triângulo pela Fórmula de Heron.

public class formula_de_heron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Estrutura da Fórmula de Heron: S = √P*(P-a)*(P-b)*(P-c);

        int a; // A, B e C são os lados do triângulo.
        int b;
        int c;
        int p; // P é o semiperímetro do triângulo = (a + b + c)/2.
        double s; // S é a área do triâgulo.

        System.out.println("Informe o lado A do triângulo: ");
        a = scanner.nextInt();
        System.out.println("Informe o lado B do triângulo: ");
        b = scanner.nextInt();
        System.out.println("Informe o lado C do triângulo: ");
        c = scanner.nextInt();

        p = (a + b + c)/2;

        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Área do Triângulo: " + s);

    }
}
