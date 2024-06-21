package templateMethod;

public class ReparaVeiculoLuxoService extends ReparaVeiculoService {

    public ReparaVeiculoLuxoService(VeiculoParaReparo veiculoParaReparo) {
        super(veiculoParaReparo);
    }

    @Override
    protected boolean veiculoParaReparo(){
        return veiculoParaReparo.getPorcentagemDanos()<=50;
    }
}
