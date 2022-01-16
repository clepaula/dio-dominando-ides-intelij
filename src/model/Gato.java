package model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cot;
    private Integer idade;

    public Gato() {
    }

    public Gato(String nome, String cot, Integer idade) {
        this.nome = nome;
        this.cot = cot;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCot() {
        return cot;
    }

    public void setCot(String cot) {
        this.cot = cot;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cot, gato.cot) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cot, idade);

    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cot='" + cot + '\'' +
                ", idade=" + idade +
                '}';
    }





}
