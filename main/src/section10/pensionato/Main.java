package section10.pensionato;

import java.util.Scanner;

public class Main {

    public static int quartos = 10;

    public static void main(String[] args) {

    }

    public static Quarto[] cadastro() {
        Quarto[] pousada = new Quarto[quartos];
        int hospedes = definirQuantHospedes();
        for (int i = 1; i <= hospedes; i++) {

        }
        return pousada;
    }

    public static void alocarHospede() {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.print("Qual quarto o hóspede ira? ");
            int index = sc.nextInt();
            if (index > quartos || index < 0) {
                System.out.println("Quarto nº" + index + " inexistente");
            } else {
                loop = false;
            }
        }
        sc.close();
    }

    public static int definirQuantHospedes() {
        Scanner sc = new Scanner(System.in);

        boolean loop = true;
        int hosp = 0;
        while (loop) {
            System.out.print("Quantos hóspedes? ");
            hosp = sc.nextInt();
            if (hosp > quartos) {
                System.out.println("Erro! Mais hóspedes que quartos!");
            } else if (hosp < 0) {
                System.out.println("Não pode ter hóspedes negativos!");
            } else {
                loop = false;
            }
        }

        sc.close();
        return hosp;
    }


}
