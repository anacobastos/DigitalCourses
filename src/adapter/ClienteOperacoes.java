package adapter;

import java.math.BigDecimal;

public class ClienteOperacoes {
    JarContaAdapter conta;

    public ClienteOperacoes(JarContaAdapter conta){
        this.conta = conta;
    }

    public void saca(BigDecimal valor){
        conta.saca(valor);
    }

    public void deposita(BigDecimal valor){
        conta.deposita(valor);
    }
}
