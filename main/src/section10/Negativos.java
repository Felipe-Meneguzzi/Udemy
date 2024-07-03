package section10;

import java.util.Scanner;

public class Negativos {

    public static void main(String[] args) {
        int[] numeros = preencherArray();
        imprimirNegativos(numeros);
    }

    public static int[] preencherArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números serão digitados? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + "º número: ");
            sc.nextInt();
        }
        sc.close();
        return numeros;
    }

    public static void imprimirNegativos(int[] num) {
        for(int numero : num){
            if(numero < 0){
                System.out.println(numero);
            }
        }
    }

}
