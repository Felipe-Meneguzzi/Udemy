package section8.exercicioClasseStatica;

public class CalculadoraDolar {
    private static final double IOF = 6;

    public static double getIof(){
        return IOF;
    }

    public static double custoDolarComIOF(double precoDolar, double quantDolar){
        double impostoIOF = (IOF / 100) * quantDolar;
        return 1;
    }

}
