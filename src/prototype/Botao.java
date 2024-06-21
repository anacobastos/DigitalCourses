package prototype;

public class Botao {

    private String cor;
    private String largura;
    private String altura;
    private TipoBordaEnum tipoBordaEnum;

    @Override
    public String toString() {
        return "Botao{" +
                "cor='" + cor + '\'' +
                ", largura='" + largura + '\'' +
                ", altura='" + altura + '\'' +
                ", tipoBordaEnum=" + tipoBordaEnum +
                '}';
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public TipoBordaEnum getTipoBordaEnum() {
        return tipoBordaEnum;
    }

    public void setTipoBordaEnum(TipoBordaEnum tipoBordaEnum) {
        this.tipoBordaEnum = tipoBordaEnum;
    }
}
