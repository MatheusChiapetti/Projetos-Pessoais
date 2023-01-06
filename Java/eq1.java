import java.util.Scanner;

// Código em Java para calcular equações de 1° grau.

public class eq1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Estrutura da equação de 1° grau: a*x + b = 0;

        int a;
        int b;

        System.out.println("Informe o valor de a: ");
        a = read.nextInt();
        System.out.println("Informe o valor de b: ");
        b = read.nextInt();

        if (a != 0) {

            double eq;

            eq = (-1 * b) / a;

            System.out.println("Resultado da Equação é " + eq);

        } else {

            // O valor de a deve ser diferente de 0 para não ocasionar o erro de divisão por zero.

            System.out.println("Valor de a inválido. Informe um valor diferente de 0.");

        }
    }
}
