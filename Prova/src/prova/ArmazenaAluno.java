/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author Rafael Martins
 */
public class ArmazenaAluno {

    int primeiro = 0;
    int ultimo = 0;
    int max;
    private Aluno[] Lista_Aluno;

    //Construtor
    public ArmazenaAluno(int max) {
        this.Lista_Aluno = new Aluno[max];
        this.max = max;
    }

    //Adicionar um produto
    public void Inserir(Aluno a1) {

        if (this.ultimo == this.max) {
            AumentaLista();
        }
        this.Lista_Aluno[this.ultimo] = a1;
        this.ultimo = this.ultimo + 1;
        System.out.println("Aluno inserido com sucesso!");
    }

    //imprimir a lista
    public void Imprimir() {
        if (this.ultimo == 0) {
            System.out.println("A lista está vazia!");
        } else {
            for (int i = 0; i < this.ultimo; i++) {
                System.out.println(this.Lista_Aluno[i].toString());
            }
        }

    }

    //Retira um produto da lista
    public void Retira(int matricula) {
        int index = 0;
        for (int i = 0; i < this.ultimo; i++) {

            if (matricula == Lista_Aluno[i].matricula) {
                index = i;
                break;
            }
        }
        this.Lista_Aluno[index] = null;
        for (int i = index; i < this.max - 1; i++) {
            this.Lista_Aluno[i] = this.Lista_Aluno[i + 1];
        }
        this.ultimo = this.ultimo - 1;
        System.out.println("O produto a seguir foi deletado: ");
    }

    // Retorna o restante de quantidade de posições vazias (sem alunos)
    public int PosicaoVazia() {
        return this.max - this.ultimo;
    }

    // Função de inserção
    public void AumentaLista() {
        Aluno[] ListaTemp = this.Lista_Aluno;
        this.max = ListaTemp.length + 5;
        this.Lista_Aluno = new Aluno[this.max];
        for (int i = 0; i < ListaTemp.length; i++) {

            this.Lista_Aluno[i] = ListaTemp[i];
        }
    }

    //Inserir ultimo
    public void InserirUltimo(Aluno a1) {

        this.Lista_Aluno[this.max] = a1;
        System.out.println("Aluno inserido com sucesso!");
    }

    public void insertFirst(Aluno newAluno) {
        if ((this.ultimo + 1) == this.max) {
            this.AumentaLista();
        }

        for (int i = this.ultimo; this.ultimo >= 0; i--) {
            this.Lista_Aluno[i + 1] = this.Lista_Aluno[i];
        }

        this.Lista_Aluno[0] = newAluno;
    }
}


