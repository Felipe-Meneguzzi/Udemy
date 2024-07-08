package random.verificadorCPF;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String cpf = "03&¨{8.aa947.4Aa5Dd0*-/96";

        System.out.println("CPF formatado sem pontuação: " + CPF.formataCPFSemPontuacao(cpf));
        System.out.println("CPF formatado com pontuação: " + CPF.formataCPFComPontuacao(cpf));
        System.out.println("Primeiros digitos do CPF em um Array: " + Arrays.toString(CPF.getArrayPrimeirosDigitosCPF(cpf)));
        System.out.println("CPF completo em um Array: " + Arrays.toString(CPF.getArrayCPF(cpf)));
        System.out.println("Digitos Verificadores do CPF em um Array: " + Arrays.toString(CPF.getArrayDigitosVerificadores(cpf)));

    }

}
