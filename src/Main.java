import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("..:: BANCO DA DIO ::..");
        System.out.println("NOVO CLIENTE");
        System.out.println("Por favor, digite o numero da conta !");
        Integer conta = e.nextInt();
        System.out.println("Por favor, digite o numero da Agencia !");
        String agencia = e.next();
        System.out.println("Por favor, digite o nome do cliente !");
        String nome = e.next();
        System.out.println("Por favor, insira um saldo !");
        Double saldo = e.nextDouble();
        Banco bb = new Banco();

        bb.novoCliente(conta,agencia,nome,saldo);

        e.close();
    }
}
