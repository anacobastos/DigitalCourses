package strategy;

import java.math.BigDecimal;

public class CalculadoraReajusteAnualSalarioCLT implements CalculadoraReajusteAnualSalario{

    @Override
    public void reajustaSalario(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.multiply(new BigDecimal(1.1)));
    }
}
