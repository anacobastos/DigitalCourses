package chainOfResponsabiliy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Carro {

    private Marca marca;

    private String modelo;

    private BigDecimal preco;

    public Carro(){}

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getPreco() {
        return preco.setScale(2, RoundingMode.HALF_DOWN);
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
