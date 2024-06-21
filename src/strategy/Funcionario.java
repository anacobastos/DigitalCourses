package strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcionario {

    private String nome;

    private BigDecimal salario;

    private TipoContratacaoEnum tipoContratacao;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario= R$" + salario.setScale(2, RoundingMode.HALF_UP) +
                ", tipoContratacao=" + tipoContratacao +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public TipoContratacaoEnum getTipoContratacao() {
        return tipoContratacao;
    }

    public void setTipoContratacao(TipoContratacaoEnum tipoContratacao) {
        this.tipoContratacao = tipoContratacao;
    }
}
