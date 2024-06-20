import Builder.Animal;
import Builder.Pessoa;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa novaPessoa = new Pessoa.PessoaBuilder()
                .apelido("Carol")
                .nome("Ana Caroline")
                .sobrenome("Bastos")
                .email("anacaroline.bastos@outlook.com")
                .dataDeNascimento(LocalDate.of(1997,07,06))
                .build();

        System.out.println(novaPessoa);

        Animal boo = Animal.builder()
                .nome("Boobidi")
                .raça("Vira Lata")
                .personalidade("O melhor cachorro do mundo")
                .idade("2 anos e meio")
                .build();

        System.out.println(boo);
    }
}