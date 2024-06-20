package singleton;

import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLAZY {

    public static AgendaSingletonLAZY INSTANCE = null;
    private Map<String,Boolean> diasDisponiveis = new HashMap<>();

    public AgendaSingletonLAZY(){
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

    public static AgendaSingletonLAZY getInstance(){
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new AgendaSingletonLAZY();
        }
        return INSTANCE;
    }
    public void ocupa(String dia){
        diasDisponiveis.replace(dia,false);
    }
}
