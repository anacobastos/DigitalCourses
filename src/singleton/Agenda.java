package singleton;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String,Boolean> diasDisponiveis = new HashMap<>();

    public Agenda(){
        diasDisponiveis.put("Segunda",true);
        diasDisponiveis.put("Terca",true);
        diasDisponiveis.put("Quarta",true);
        diasDisponiveis.put("Quinta",true);
        diasDisponiveis.put("Sexta",true);
        diasDisponiveis.put("Sabado",true);
        diasDisponiveis.put("Domingo",true);
    }

    public Map<String,Boolean> getDiasDisponiveis(){
        return diasDisponiveis;
    }


    public void ocupa(String dia){
        diasDisponiveis.replace(dia,false);
    }
}
