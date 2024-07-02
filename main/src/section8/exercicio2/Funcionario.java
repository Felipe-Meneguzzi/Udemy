package section8.exercicio2;

public class Funcionario {
    private String name;
    private double grossSalary;
    private double tax;

    public Funcionario(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getNetSalary() {
        double imposto = (this.tax / 100) * this.grossSalary;
        double salarioLiquido = this.grossSalary - imposto;

        return salarioLiquido;
    }

    public void increaseSalary(double porcentagem) {
        double aumento = (porcentagem / 100) * this.grossSalary;
        this.grossSalary += aumento;
    }
}
