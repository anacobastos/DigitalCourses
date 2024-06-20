package Builder;

import java.time.LocalDate;

public class Pessoa {

    String nome;
    String sobrenome;
    String email;
    String apelido;
    LocalDate dataDeNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Pessoa(String nome, String sobrenome, String email, String apelido, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.apelido = apelido;
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }

    public static class PessoaBuilder{

        String nome;
        String sobrenome;
        String email;
        String apelido;
        LocalDate dataDeNascimento;

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public PessoaBuilder dataDeNascimento(LocalDate dataDeNascimento) {
            this.dataDeNascimento = dataDeNascimento;
            return this;
        }

        public Pessoa build(){
            return new Pessoa(nome,sobrenome,email,apelido,dataDeNascimento);
        }
    }
}
