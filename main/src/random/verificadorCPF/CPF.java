package random.verificadorCPF;

import java.util.Scanner;

public class CPF {

    /*
    DECLARAÇÃO DOS PARÂMETROS PADRÕES DO CPF, CASO ALTERE ESSE NÚMERO, APENAS MUDE AQUI, O CÓDIGO DEVE SE MANTER
     */

    public static final int QUANT_DIGITOS_TOTAL = 11;
    public static final int QUANT_DIGITOS_VERIFICADORES = 2;

    public static final int QUANT_DIGITOS = QUANT_DIGITOS_TOTAL - QUANT_DIGITOS_VERIFICADORES;


    public static String formataCPFComPontuacao(String cpf) {
        return formataCPFSemPontuacao(cpf).replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    public static String formataCPFSemPontuacao(String cpf) {
        return cpf.replaceAll("[^0-9]", "");
    }

    public static int[] getArrayPrimeirosDigitosCPF(String cpf) {
        cpf = formataCPFSemPontuacao(cpf);
        int[] digitos = new int[QUANT_DIGITOS];

        for (int i = 0; i < QUANT_DIGITOS; i++) {
            digitos[i] = cpf.charAt(i) - '0';
        }

        return digitos;
    }

    public static int[] getArrayDigitosVerificadores(String cpf) {
        cpf = formataCPFSemPontuacao(cpf);
        int[] digitos = new int[QUANT_DIGITOS_VERIFICADORES];

        for (int i = 0; i < QUANT_DIGITOS_VERIFICADORES; i++) {
            digitos[i] = cpf.charAt(QUANT_DIGITOS + i) - '0';
        }

        return digitos;
    }

    public static int[] getArrayCPF(String cpf) {
        cpf = formataCPFSemPontuacao(cpf);
        int[] digitos = new int[QUANT_DIGITOS_TOTAL];

        for (int i = 0; i < QUANT_DIGITOS_TOTAL; i++) {
            digitos[i] = cpf.charAt(i) - '0';
        }

        return digitos;
    }

    public static boolean validaCPF(String cpf) {
        cpf = formataCPFSemPontuacao(cpf);
        if (true) {
            return true;
        } else {
            return false;
        }
    }

}
