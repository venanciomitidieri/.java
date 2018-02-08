/**
 * Created by Samsung on 07/02/2018.
 */
public class Conta
{
    String titular;
    int numero;
    double saldo;
    double salario;


    boolean saca(double quantidade)  {
     if (this.saldo < quantidade) {
        return false;
    }
     else {
        this.saldo = this.saldo - quantidade;
        return true;
    }
    }

    void deposita(double quantidade)
    {
        this.saldo += quantidade;
    }
}


