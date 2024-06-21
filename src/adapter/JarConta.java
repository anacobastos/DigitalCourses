package adapter;

import java.math.BigDecimal;

public class JarConta {

    public boolean validaSaldo(BigDecimal valorPretendido){
        System.out.println("Validando saldo...");
        return true;
    }

    public void saca(BigDecimal valor){
        System.out.println("Sacando...");
    }

    public void deposita(BigDecimal valor){
        System.out.println("Depositando...");
    }


}
