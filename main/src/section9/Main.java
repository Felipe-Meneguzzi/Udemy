package section9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Banco cliente1 = cadastrar();
        System.out.println("\n\n" + cliente1.dadosToString(false));

        cliente1.depositar(8000);
        cliente1.sacar(7000);
    }

    public static Banco cadastrar() {
        Scanner scanner = new Scanner(System.in);
        Banco cliente;
        String nome;
        double deposito;
        int id;
        double limite;
        boolean depositoInicial, limitePadrao;

        System.out.print("Id da conta(int): ");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do cliente(String): ");
        nome = scanner.nextLine();

        System.out.print("Deposito Inicial(true ou false)? ");
        depositoInicial = scanner.nextBoolean();
        if (depositoInicial) {
            System.out.print("Quanto(double)? ");
            deposito = scanner.nextDouble();

            System.out.print("Usar limite padrão?(true ou false)? ");
            limitePadrao = scanner.nextBoolean();
            if (!limitePadrao) {
                System.out.println("Qual o limite personalizado(double)? ");
                limite = scanner.nextDouble();
                cliente = new Banco(id, nome, deposito, limite);
            } else {
                cliente = new Banco(id, nome, deposito);
            }
        } else {
            cliente = new Banco(id, nome);
        }

        scanner.close();
        return cliente;
    }

}
