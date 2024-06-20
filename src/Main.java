import builder.Animal;
import builder.Pessoa;
import factoryMethod.Produto;
import factoryMethod.ProdutoFactory;
import factoryMethod.TipoProdutoEnum;
import prototype.Botao;
import prototype.BotaoRegistry;
import prototype.TipoBordaEnum;
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
        //singleton();
        prototype();
    }
    public static void prototype(){
        Botao botao1 = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botao1);
        Botao botao2 = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        botao2.setCor("LARANJA");
        System.out.println(botao2);
        System.out.println(botao1);

        System.out.println(BotaoRegistry.getBotao("BOTAO_AMARELO"));
        System.out.println(BotaoRegistry.getBotao("BOTAO_AZUL"));

        Botao botaoPreto = new Botao();
        botaoPreto.setCor("Preto");
        botaoPreto.setAltura("100");
        botaoPreto.setLargura("200");
        botaoPreto.setTipoBordaEnum(TipoBordaEnum.DUPLA);

        BotaoRegistry.addBotao("BOTAO_PRETO",botaoPreto);
        System.out.println(BotaoRegistry.getBotao("BOTAO_PRETO"));
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