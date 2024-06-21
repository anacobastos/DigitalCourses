package strategy;

import java.math.BigDecimal;

public class CalculadoraReajusteAnualSalarioEstagio implements CalculadoraReajusteAnualSalario{

    @Override
    public void reajustaSalario(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.multiply(new BigDecimal(1.02)));
    }
}
