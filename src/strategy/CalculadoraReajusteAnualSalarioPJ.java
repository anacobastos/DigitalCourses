package strategy;

import java.math.BigDecimal;

public class CalculadoraReajusteAnualSalarioPJ implements CalculadoraReajusteAnualSalario{

    @Override
    public void reajustaSalario(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
    }
}
