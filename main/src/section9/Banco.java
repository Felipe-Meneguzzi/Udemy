package section9;

public class Banco {

    private String nome;
    private final int ID_CONTA;
    private double saldo;
    private double limite;
    private final double TAXA = 5;

    public Banco(int ID_CONTA, String nome, double saldo, double limite) {
        this.nome = nome;
        this.ID_CONTA = ID_CONTA;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Banco(int ID_CONTA, String nome, double saldo) {
        this.nome = nome;
        this.ID_CONTA = ID_CONTA;
        this.saldo = saldo;
        this.limite = 3000;
    }

    public Banco(int ID_CONTA, String nome) {
        this.nome = nome;
        this.ID_CONTA = ID_CONTA;
        this.saldo = 0;
        this.limite = 3000;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID_CONTA() {
        return this.ID_CONTA;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimite() {
        return this.limite;
    }

    public void aumentarLimite(double quant) {
        this.limite += quant;
    }

    public void diminuirLimite(double quant) {
        this.limite -= quant;
    }

    public void depositar(double quant) {
        this.saldo += quant;
    }

    public void sacar(double quant) {
        if (this.saldo - (quant + TAXA) >= (this.limite * -1)) {
            this.saldo -= (quant + TAXA);
        } else {
            System.out.println("\nERRO AO SACAR!\nO usuario não pode ficar com saldo menor que o limite");
        }
    }

    public String dadosToString(boolean mostrarLimite) {
        String dados = "ID da conta: " + ID_CONTA
                + "\nNome: " + this.nome
                + "\nSaldo: " + this.saldo;
        if (mostrarLimite) {
            dados += "\nLimite de saldo negativo: " + this.limite;
        }
        return dados;
    }

    @Override
    public String toString() {
        return "Type Banco {"
                + "\nID_CONTA: " + ID_CONTA
                + "\nNome: " + this.nome
                + "\nSaldo: " + this.saldo
                + "\nLimite: " + this.limite
                + "\n}";
    }

}
