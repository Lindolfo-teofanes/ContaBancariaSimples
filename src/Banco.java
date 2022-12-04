import java.util.ArrayList;

public class Banco {
    ArrayList<Conta> clientes = new ArrayList<Conta>();

    void novoCliente(Integer conta, String agencia, String nome, Double saldo){
        Conta contaCliente = new Conta(conta, agencia, nome, saldo);

        clientes.add(contaCliente);

        System.out.println("Ola "+nome+", obrigado por criar uma conta em nosso banco, sua agencia é "+agencia+", conta "+conta+" e seu saldo "+saldo+" ja esta disponivel para saque.");

    }
}
