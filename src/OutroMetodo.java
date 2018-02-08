/**
 * Created by Samsung on 07/02/2018.
 */
public class OutroMetodo{
    public static void main(String[] args)
    {
        Conta minhaConta = new Conta ();

        minhaConta.titular = "Larissa";
        minhaConta.saldo = 10000;

       if (minhaConta.saca(300))
       {
           System.out.println("Consegui sacar");
           System.out.println("Novo saldo = " + minhaConta.saldo);
       }
       else {
           System.out.println("Nãp consegui sacar");
             }
    }
}
