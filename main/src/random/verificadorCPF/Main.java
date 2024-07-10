package random.verificadorCPF;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cpf;

        while (true) {
            System.out.print("Digite o cpf: ");
            cpf = sc.nextLine();
            if (CPF.validaCPF(cpf)) {
                System.out.println("CPF Valido");
                sc.close();
                break;
            } else {
                System.out.println("CPF Invalido");
            }
        }

        System.out.println("CPF formatado sem pontuação: " + CPF.removePontuacao(cpf));
        System.out.println("CPF formatado com pontuação: " + CPF.formataCPF(cpf));
        System.out.println("CPF completo em um Array: " + Arrays.toString(CPF.getArrayCPF(cpf)));
        System.out.println("Digitos Verificadores do CPF em um Array: " + Arrays.toString(CPF.getArrayDigitosVerificadores(cpf)));
        System.out.println("\nCPF gerado: " + CPF.geraCPFValido(true));

    }

}
