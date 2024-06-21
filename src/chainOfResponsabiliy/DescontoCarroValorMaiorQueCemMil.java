package chainOfResponsabiliy;

import java.math.BigDecimal;

public class DescontoCarroValorMaiorQueCemMil extends  DescontoCarro{

    public DescontoCarroValorMaiorQueCemMil(DescontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if(Marca.CHEVROLET.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(10000));
        }

        return proximoDesconto.aplicaDesconto(carro);
    }
}
