package prototype;

import java.util.HashMap;
import java.util.Map;

public class BotaoRegistry {


    private static Map<String,Botao> REGISTRY = new HashMap<>();
    static{
        Botao botaoVermelho = new Botao();
        botaoVermelho.setCor("Vermelho");
        botaoVermelho.setAltura("100");
        botaoVermelho.setLargura("200");
        botaoVermelho.setTipoBordaEnum(TipoBordaEnum.PONTILHADA);

        Botao botaoAzul = new Botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura("100");
        botaoAzul.setLargura("200");
        botaoAzul.setTipoBordaEnum(TipoBordaEnum.FINA);

        Botao botaoAmarelo = new Botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura("100");
        botaoAmarelo.setLargura("200");
        botaoAmarelo.setTipoBordaEnum(TipoBordaEnum.GROSSA);

        REGISTRY.put("BOTAO_VERMELHO",botaoVermelho);
        REGISTRY.put("BOTAO_AMARELO",botaoAmarelo);
        REGISTRY.put("BOTAO_AZUL",botaoAzul);
    }

    public static Botao getBotao(String chave){
        return BotaoFactory.getInstance(REGISTRY.get(chave));
    }

    public static void addBotao(String chave, Botao botao){
        REGISTRY.put(chave,botao);
    }

}
