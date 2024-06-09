package org.example;

public class Cliente {
    int codigo;
    String nome;
    String dataNascimento;
    String telefone;
    Cliente prev;
    Cliente next;

    Cliente(int codigo, String nome, String dataNascimento, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}