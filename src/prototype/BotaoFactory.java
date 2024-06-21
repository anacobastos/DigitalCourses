package prototype;

public class BotaoFactory {

    public static Botao getInstance(Botao prototipo){
        Botao clone = new Botao();
        clone.setCor(prototipo.getCor());
        clone.setAltura(prototipo.getAltura());
        clone.setLargura(prototipo.getLargura());
        clone.setTipoBordaEnum(prototipo.getTipoBordaEnum());

        return clone;
    }
}
