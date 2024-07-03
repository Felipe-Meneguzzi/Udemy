package section8.exercicioClasseStatica;

public class CalculadoraDolar {
    private static final double IOF = 6;

    public static double getIof() {
        return IOF;
    }

    public static double converteParaRealComIOF(double precoDolar, double quantDolar) {
        double impostoIOF = (IOF / 100) * quantDolar;
        quantDolar += impostoIOF;
        return quantDolar * precoDolar;
    }

    public static double converteParaDolarComIOF(double precoDolar, double quantReal) {
        double op = quantReal / precoDolar;
        return op / (1 + (IOF / 100));
    }

}
