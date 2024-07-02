package section8.exercicio2;

public class Main {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario("Felipe", 5000, 6);

        System.out.println("Nome: " + funcionario1.getName());
        System.out.println("Salario Bruto: " + funcionario1.getGrossSalary());
        System.out.println("Imposto (%): " + funcionario1.getTax());
        System.out.println("Salario Liquido: " + funcionario1.getNetSalary());

        double aumento = 10;
        System.out.println("Aumentando o salario bruto em: " + aumento +"%");
        funcionario1.increaseSalary(aumento);

        System.out.println("Salario Bruto: " + funcionario1.getGrossSalary());
        System.out.println("Salario Liquido: " + funcionario1.getNetSalary());
    }
}
