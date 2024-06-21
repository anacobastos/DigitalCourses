package adapter;

import java.math.BigDecimal;

public class JarContaAdapter {

    JarConta jarConta;

    public JarContaAdapter(JarConta jarConta){
        this.jarConta = jarConta;
    }

    public void saca(BigDecimal valor){
        if(jarConta.validaSaldo(valor)){
            System.out.println("Sacando...");
        }else{
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    public void deposita(BigDecimal valor){
        jarConta.deposita(valor);
    }


}
