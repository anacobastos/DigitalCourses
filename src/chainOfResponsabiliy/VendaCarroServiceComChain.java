package chainOfResponsabiliy;

import java.math.BigDecimal;

public class VendaCarroServiceComChain {

    public BigDecimal calculaValorVenda(Carro carro){
        DescontoCarro desconto = new DescontoCarroFIAT(
                new DescontoCarroFORD(
                        new DescontoCarroValorMaiorQueCemMil(
                                new SemDireitoADesconto(null)
                        )));
        return desconto.aplicaDesconto(carro);
    }
}
