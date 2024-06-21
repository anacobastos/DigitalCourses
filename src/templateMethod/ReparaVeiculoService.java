package templateMethod;

public abstract class ReparaVeiculoService {
    protected VeiculoParaReparo veiculoParaReparo;

    public ReparaVeiculoService(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    public void reparaVeiculo(){
        entradaOficina();
        analisarDanos();
        if(veiculoParaReparo()){
            repararVeiculo();
            notificarReparoParaSeguradora();
        }else {
            notificarPerdaTotalParaSeguradora();
        }
    }

    protected abstract boolean veiculoParaReparo();

    //se colocar protected fica opcional implementar nas classes filhas
    private void analisarDanos(){
        System.out.println("Analisando danos....");
    }

    private void repararVeiculo(){
        System.out.println("Reparando veiculo....");
    }

    private void notificarReparoParaSeguradora(){
        System.out.println("Notificando reparo para seguradora....");
    }
    private void notificarPerdaTotalParaSeguradora(){
        System.out.println("Notificando perda total para seguradora....");
    }

    private void entradaOficina(){
        System.out.println("Veiculo entrando oficina....");
    }
}
