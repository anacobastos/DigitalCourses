import adapter.*;
import chainOfResponsabiliy.*;
import proxy.*;
import builder.*;
import factoryMethod.*;
import prototype.*;
import singleton.*;
import strategy.*;

import java.math.BigDecimal;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //builder();
        //factory();
        //singleton();
        //prototype();
        //proxy();
        //adapter();
        //strategy();
        chainOfResponsability();

    }
    public static void chainOfResponsability(){
        System.out.println("%%%%%%%%%%%%%%%%% CHAIN OF RESPONSABILITY %%%%%%%%%%%%%%%%");
        //VendaCarroService vendaCarroService = new VendaCarroService();
        VendaCarroServiceComChain vendaCarroService = new VendaCarroServiceComChain();
        Carro carro1 = new Carro();
        carro1.setMarca(Marca.FORD);
        carro1.setModelo("Fusion");
        carro1.setPreco(new BigDecimal(60000));
        BigDecimal valorVenda1 = vendaCarroService.calculaValorVenda(carro1);
        System.out.println("Valor de venda "+carro1.getModelo()+" : R$"+carro1.getPreco());
        System.out.println("Valor de venda "+carro1.getModelo()+" com desconto: R$"+ valorVenda1);

        Carro carro2 = new Carro();
        carro2.setMarca(Marca.FIAT);
        carro2.setModelo("Uno");
        carro2.setPreco(new BigDecimal(40000));
        BigDecimal valorVenda2 = vendaCarroService.calculaValorVenda(carro2);
        System.out.println("Valor de venda "+carro2.getModelo()+" : R$"+carro2.getPreco());
        System.out.println("Valor de venda "+carro2.getModelo()+" com desconto: R$"+ valorVenda2);

        Carro carro3 = new Carro();
        carro3.setMarca(Marca.CHEVROLET);
        carro3.setModelo("Camaro");
        carro3.setPreco(new BigDecimal(100000));
        BigDecimal valorVenda3 = vendaCarroService.calculaValorVenda(carro3);
        System.out.println("Valor de venda "+ carro3.getModelo()+" : R$"+ carro3.getPreco());
        System.out.println("Valor de venda "+ carro3.getModelo()+" com desconto: R$"+ valorVenda3);


        Carro carro4 = new Carro();
        carro4.setMarca(Marca.GOL);
        carro4.setModelo("Gol bolinha");
        carro4.setPreco(new BigDecimal(50000));
        BigDecimal valorVenda4 = vendaCarroService.calculaValorVenda(carro4);
        System.out.println("Valor de venda "+ carro4.getModelo()+" : R$"+ carro4.getPreco());
        System.out.println("Valor de venda "+ carro4.getModelo()+" com desconto: R$"+ valorVenda4);
    }

    public static void strategy(){
        System.out.println("%%%%%%%%%%%%%%%%%%%%% STRATEGY %%%%%%%%%%%%%");

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Joao");
        funcionario1.setSalario(new BigDecimal(1000));
        funcionario1.setTipoContratacao(TipoContratacaoEnum.CLT);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Pedro");
        funcionario2.setSalario(new BigDecimal(1000));
        funcionario2.setTipoContratacao(TipoContratacaoEnum.PJ);

        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Carlos");
        funcionario3.setSalario(new BigDecimal(1000));
        funcionario3.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);

        ReajusteAnualSalario reajuste = new ReajusteAnualSalario();

        reajuste.calculaReajusteAnual(funcionario1, new CalculadoraReajusteAnualSalarioCLT());
        reajuste.calculaReajusteAnual(funcionario2, new CalculadoraReajusteAnualSalarioPJ());
        reajuste.calculaReajusteAnual(funcionario3, new CalculadoraReajusteAnualSalarioEstagio());

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);

    }

    public static void adapter(){
        System.out.println("%%%%%%%%%%%%%%%%% ADAPTER %%%%%%%%%%%%%%");
        JarConta jarConta = new JarConta();
        JarContaAdapter jarContaAdapter = new JarContaAdapter(jarConta);
        ClienteOperacoes clienteOperacoes = new ClienteOperacoes(jarContaAdapter);

        clienteOperacoes.deposita(new BigDecimal(500));
        clienteOperacoes.saca(new BigDecimal(500));
    }

    public static void proxy(){
        System.out.println("%%%%%%%%%%%%%%% PROXY %%%%%%%%%%%%%%%%");
        PessoaRepositoryProxy repositoryProxy = new PessoaRepositoryProxy();
        PessoaService pessoaService = new PessoaService(repositoryProxy);
        Pessoa novaPessoa = new Pessoa.PessoaBuilder()
                .apelido("Carol")
                .nome("Ana Caroline")
                .sobrenome("Bastos")
                .email("anacaroline.bastos@outlook.com")
                .dataDeNascimento(LocalDate.of(1997,07,06))
                .build();

        repositoryProxy.save(novaPessoa);

        Pessoa pessoaRetornada = repositoryProxy.findById(1L);
        System.out.println(pessoaRetornada);
        Pessoa pessoaRetornada2 = repositoryProxy.findById(1L);
        System.out.println(pessoaRetornada2);
    }

    public static void prototype(){
        System.out.println("%%%%%%%%%%%%%%%%% PROTOTYPE %%%%%%%%%%%%%%%%");
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

        System.out.println("%%%%%%%%%%%%%%%%% BUILDER %%%%%%%%%%%%%%%%");
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

        System.out.println("%%%%%%%%%%%%%%%%% FACTORY %%%%%%%%%%%%%%%%");
        Produto produto1 = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);
        Produto produto2 = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        System.out.println(produto1);
        System.out.println(produto2);
    }

    public static void singleton(){

        System.out.println("%%%%%%%%%%%%%%%%% SINGLETON %%%%%%%%%%%%%%%%");
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