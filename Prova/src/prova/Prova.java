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
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Rafael", 123, "Computação");
        Aluno a2 = new Aluno("Rafael2", 1234, "Computação2");
        Aluno a3 = new Aluno("Rafael3", 1235, "Computação3");
        Aluno a4 = new Aluno("Rafael4", 1236, "Computação4");
        Aluno a5 = new Aluno("Rafael5", 1237, "Computação5");
        Aluno a6 = new Aluno("Rafael6", 1238, "Computação6");
        Aluno a7 = new Aluno("Rafael7", 1239, "Computação7");
        
        ArmazenaAluno array = new ArmazenaAluno(5);
        array.Inserir(a1);
        array.Inserir(a2);
        array.Inserir(a3);
        array.Retira(1235);
        array.Inserir(a4);
        array.Inserir(a5);
        array.Inserir(a6);
        array.Inserir(a7);
        System.out.println(array.PosicaoVazia());
        array.Imprimir();
    }
}
