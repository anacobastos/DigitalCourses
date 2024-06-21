package templateMethod;

public class ReparaVeiculoComumService extends ReparaVeiculoService {

    public ReparaVeiculoComumService(VeiculoParaReparo veiculoParaReparo) {
        super(veiculoParaReparo);
    }

    @Override
    protected boolean veiculoParaReparo(){
        return veiculoParaReparo.getPorcentagemDanos()<=70;
    }
}
