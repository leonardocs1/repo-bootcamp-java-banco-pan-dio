import java.util.Scanner;

/* 
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade Par: " + qtdPares);
        System.out.println("Quantidade Impares: " + qtdImpares);

        scan.close();
    }
}
