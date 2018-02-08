/**
 * Created by Samsung on 07/02/2018.
 */
public class Programa{
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta ();

        minhaConta.titular = "Venâncio";
        minhaConta.saldo = 5000;

        System.out.println("Saldo atual = " + minhaConta.saldo);
    }
}
