package org.example;
import org.example.Cliente;

public class ListaEncadeada {
    private Cliente head;
    private Cliente tail;

    public void adicionarCliente(Cliente novoCliente) {
        if (head == null) {
            head = tail = novoCliente;
        } else {
            tail.next = novoCliente;
            novoCliente.prev = tail;
            tail = novoCliente;
        }
    }

    public void removerCliente(int codigo) {
        Cliente atual = head;
        while (atual != null) {
            if (atual.codigo == codigo) {
                if (atual.prev != null) {
                    atual.prev.next = atual.next;
                } else {
                    head = atual.next;
                }
                if (atual.next != null) {
                    atual.next.prev = atual.prev;
                } else {
                    tail = atual.prev;
                }
                System.out.println("Cliente removido: " + atual);
                return;
            }
            atual = atual.next;
        }
        System.out.println("Cliente com código " + codigo + " não encontrado.");
    }

    public void alterarCliente(int codigo, String novoNome, String novaDataNascimento, String novoTelefone) {
        Cliente atual = head;
        while (atual != null) {
            if (atual.codigo == codigo) {
                atual.nome = novoNome;
                atual.dataNascimento = novaDataNascimento;
                atual.telefone = novoTelefone;
                System.out.println("Cliente alterado: " + atual);
                return;
            }
            atual = atual.next;
        }
        System.out.println("Cliente com código " + codigo + " não encontrado.");
    }

    public Cliente buscarCliente(int codigo) {
        Cliente atual = head;
        while (atual != null) {
            if (atual.codigo == codigo) {
                return atual;
            }
            atual = atual.next;
        }
        return null;
    }

    public void exibirTodosClientes() {
        Cliente atual = head;
        if (atual == null) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        while (atual != null) {
            System.out.println(atual);
            atual = atual.next;
        }
    }
}