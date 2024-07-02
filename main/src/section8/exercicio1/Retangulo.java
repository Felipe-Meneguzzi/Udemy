package section8.exercicio1;

public class Retangulo {
    private double width;
    private double height;

    public Retangulo(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        double area = this.height * this.width;
        return area;
    }

    public double getPerimeter() {
        double perimetro = (this.height * 2) + (this.width * 2);
        return perimetro;
    }

    public double getDiagonal() {
        double diagonal = Math.sqrt((width * width) + (height * height));
        return diagonal;
    }

}
