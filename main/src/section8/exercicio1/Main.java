package section8.exercicio1;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(3, 4);
        Retangulo retangulo2 = retangulo1;

        System.out.println("Largura: " + retangulo1.getHeight());
        System.out.println("Altura: " + retangulo1.getWidth());
        System.out.println("Area: " + retangulo1.getArea());
        System.out.println("Perimetro: " + retangulo1.getPerimeter());
        System.out.println("Diagonal: " + retangulo1.getDiagonal());

        retangulo1.setHeight(6);
        retangulo2.setWidth(8);
        System.out.println(retangulo2.getHeight());
        System.out.println(retangulo1.getWidth());
    }
}
