package random.verificadorCPF;

import java.util.Random;

class debug {
    public static void main(String[] args) {

    }
}

public class CPF {

    //CONSTANTES DE CPF

    public static final int QUANT_DIGITOS_TOTAL = 11;
    public static final int QUANT_DIGITOS_VERIFICADORES = 2;
    public static final int QUANT_DIGITOS_UNICOS = 9;

    /**
     * Remove a pontuação de um CPF, ou qualquer String. NÃO VALIDA!
     *
     * @param cpf CPF formatado ou não, pode ter letras, carácteres especiais, qualquer coisa
     * @return CPF sem pontuação
     */
    public static String removePontuacao(String cpf) {
        return cpf.replaceAll("[^0-9]", "");
    }

    /**
     * Formata um cpf para o padrão xxx.xxx.xxx-xx
     *
     * @param cpf CPF com 11 números, não precisa ser válido, pode ter outros caracteres no meio, ele só pega os numeros
     * @return CPF padrão String = "xxx.xxx.xxx-xx"
     */
    public static String formataCPF(String cpf) {
        cpf = removePontuacao(cpf);
        if (cpf.length() == QUANT_DIGITOS_TOTAL) {
            return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        } else {
            throw new IllegalArgumentException("CPF não aceito. Deve conter " + QUANT_DIGITOS_TOTAL + " dígitos.");
        }
    }

    public static int[] getArrayDigitosVerificadores(String cpf) {
        cpf = removePontuacao(cpf);
        int[] digitos = new int[QUANT_DIGITOS_VERIFICADORES];

        for (int i = 0; i < QUANT_DIGITOS_VERIFICADORES; i++) {
            digitos[i] = cpf.charAt(QUANT_DIGITOS_UNICOS + i) - '0';
        }

        return digitos;
    }

    public static int[] getArrayCPF(String cpf) {
        cpf = removePontuacao(cpf);
        int[] digitos = new int[cpf.length()];

        for (int i = 0; i < cpf.length(); i++) {
            digitos[i] = cpf.charAt(i) - '0';
        }

        return digitos;
    }

    /**
     * Gera um CPF Valido que passa no teste do método validaCPF()
     *
     * @param formatado Deve ser true caso queira o valor no padrão "xxx.xxx.xxx-xx" e false caso queira "xxxxxxxxxxx"
     * @return CPF Valido padrão "xxx.xxx.xxx-xx" ou "xxxxxxxxxxx"
     */
    public static String geraCPFValido(boolean formatado) {
        StringBuilder cpf = new StringBuilder();
        int[] digitosUnicos = new int[QUANT_DIGITOS_TOTAL];
        Random random = new Random();

        for (int i = 0; i < QUANT_DIGITOS_UNICOS; i++) {
            int r = random.nextInt(10);
            digitosUnicos[i] = r;
            cpf.append(r);
        }

        int validador1 = geraDigitoValidador(0, digitosUnicos);
        cpf.append(validador1);
        digitosUnicos[QUANT_DIGITOS_UNICOS] = validador1;
        int validador2 = geraDigitoValidador(1, digitosUnicos);
        cpf.append(validador2);

        if (formatado) {
            return formataCPF(cpf.toString());
        } else {
            return cpf.toString();
        }
    }

    /**
     * Faz o calculo do digito validador respectivo ao index
     *
     * @param index 0 ou 1, 0 gera o primeiro Digito Validador, 1 o segundo, equivalente a: xxx.xxx.xxx-01
     * @param digitosCPF Vetor dos digitos unicos do CPF, os 9 primeiros
     * @return Digito Validador daquele index
     */
    public static int geraDigitoValidador(int index, int[] digitosCPF) {
        int soma = 0;

        for (int i = 0, peso = 10 + index; i < QUANT_DIGITOS_UNICOS + index; i++, peso--) {
            soma += digitosCPF[i] * peso;
        }

        soma *= 10;
        int resto = soma % 11;

        if (resto == 10) {
            resto = 0;
        }

        return resto;
    }

    public static boolean validaCPF(String cpf) {
        cpf = removePontuacao(cpf);

        //VERIFICA SE TEM O NUMERO CORRETO DE DIGITOS
        if (cpf.length() != QUANT_DIGITOS_TOTAL) {
            return false;
        }
        //VERIFICA SE NÃO SÃO DIGITOS IGUAIS, POR EXEMPLO "333.333.333-33"
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int[] digitosCPF = getArrayCPF(cpf);
        int[] digitosVerificadoresCPF = getArrayDigitosVerificadores(cpf);
        int[] digitosComparacao = new int[QUANT_DIGITOS_VERIFICADORES];

        digitosComparacao[0] = geraDigitoValidador(0, digitosCPF);
        digitosComparacao[1] = geraDigitoValidador(1, digitosCPF);

        return digitosVerificadoresCPF[0] == digitosComparacao[0] && digitosVerificadoresCPF[1] == digitosComparacao[1];

    }

}
