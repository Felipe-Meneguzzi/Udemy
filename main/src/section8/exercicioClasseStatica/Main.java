package section8.exercicioClasseStatica;

public class Main {
    public static void main(String[] args) {
        double precoDolar = 3.1;

        System.out.println(CalculadoraDolar.converteParaRealComIOF(precoDolar, 200));
        System.out.println(CalculadoraDolar.converteParaDolarComIOF(precoDolar, 657.20));
    }
}
