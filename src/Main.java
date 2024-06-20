import builder.Animal;
import builder.Pessoa;
import factoryMethod.Produto;
import factoryMethod.ProdutoFactory;
import factoryMethod.TipoProdutoEnum;
import singleton.Agenda;
import singleton.AgendaSingletonEAGER;
import singleton.AgendaSingletonENUM;
import singleton.AgendaSingletonLAZY;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //builder();
        //factory();
        singleton();

    }

    public static void builder(){
        ///////////////// BUILDER
        Pessoa novaPessoa = new Pessoa.PessoaBuilder()
                .apelido("Carol")
                .nome("Ana Caroline")
                .sobrenome("Bastos")
                .email("anacaroline.bastos@outlook.com")
                .dataDeNascimento(LocalDate.of(1997,07,06))
                .build();
        System.out.println(novaPessoa);
        //////////////// BUILDER COM LAMBOK
        Animal boo = Animal.builder()
                .nome("Boobidi")
                .raça("Vira Lata")
                .personalidade("O melhor cachorro do mundo")
                .idade("2 anos e meio")
                .build();

        System.out.println(boo);
    }

    public static void factory(){
        //////////////// FACTORY
        Produto produto1 = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);
        Produto produto2 = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        System.out.println(produto1);
        System.out.println(produto2);
    }

    public static void singleton(){
        //////////////// SINGLETON
        System.out.println("%%%%%%%%%%%%%%% SEM SINGLETON %%%%%%%%%%");
        System.out.println(reservaDia("Sabado"));
        System.out.println(reservaDia("Sexta"));

        System.out.println("%%%%%%%%%%%%%%% SINGLETON EAGER %%%%%%%%%%");
        System.out.println(reservaDiasSingletonEager("Sabado"));
        System.out.println(reservaDiasSingletonEager("Sexta"));

        System.out.println("%%%%%%%%%%%%%%% SINGLETON LAZY %%%%%%%%%%");
        System.out.println(reservaDiasSingletonLazy("Sabado"));
        System.out.println(reservaDiasSingletonLazy("Sexta"));

        System.out.println("%%%%%%%%%%%%%%% SINGLETON ENUM %%%%%%%%%%");
        System.out.println(reservaDiasSingletonEnum("Sabado").hashCode());
        System.out.println(reservaDiasSingletonEnum("Sexta").hashCode());
    }
    private static Agenda reservaDia(String dia){
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
        return agenda;
    }
    private static AgendaSingletonEAGER reservaDiasSingletonEager(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
        return agenda;
    }
    private static AgendaSingletonLAZY reservaDiasSingletonLazy(String dia){
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
        return agenda;
    }

    private static AgendaSingletonENUM reservaDiasSingletonEnum(String dia){
        AgendaSingletonENUM agenda = AgendaSingletonENUM.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiasDisponiveis());
        return agenda;
    }
}