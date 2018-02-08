/**
 * Created by Samsung on 07/02/2018.
 */
public class TestaAlgunsMetodos{
    public static void main(String[] args)
    {
        Conta minhaConta = new Conta ();

        minhaConta.titular = "Jonatas";
        minhaConta.saldo = 1000000;

        minhaConta.saca(200);

        minhaConta.deposita(500);
        System.out.println("Novo saldo = " +minhaConta.saldo);
    }
}
