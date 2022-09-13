/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programateste.exerc.java;

import escola.Aluno;
import escola.Turma;

/**
 *
 * @author Pedro Henrique
 */

public class AssociarUm {
    public static void main(String[] args) {
        
        
        //criando turma 1
        Turma turma1 = new Turma();
        turma1.setTurno("Noite");
        turma1.setCodigo(100);
        
        //criando turma 2
        
        Turma turma2 = new Turma();
        turma2.setTurno("Manhã");
        turma2.setCodigo(200);
        
        //adicionando alunos a turma

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro");
        aluno1.setMatricula(10);
        aluno1.setTurma(turma1);
        turma1.adicionarAluno(aluno1); //método adicionar aluno...
       
        
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Thiago");
        aluno2.setMatricula(11);
        aluno2.setTurma(turma1);
        turma1.adicionarAluno(aluno2);
        
        Aluno aluno3 = new Aluno();
        aluno3.setNome("Roberto");
        aluno3.setMatricula(12);
        aluno3.setTurma(turma2);
        turma2.adicionarAluno(aluno3);
        
        
        Aluno aluno4 = new Aluno();
        aluno4.setNome("Alexandre");
        aluno4.setMatricula(12);
        aluno4.setTurma(turma2);
        turma2.adicionarAluno(aluno4);
       
       
        
        System.out.println("Listando alunos Turma 1:");
       
        for(int i=0; i <= turma1.quantAlunos(); i++)
        {
            System.out.print("Nome: ");
            System.out.println(turma1.getAluno(i).getNome());
            System.out.print("Matrícula do Aluno: ");
            System.out.println(turma1.getAluno(i).getMatricula());
            System.out.println("Turno do Aluno: ");
            System.out.println(turma1.getAluno(i).getTurma().getTurno());
            System.out.println("\n\n\n");
        }
        
        
        System.out.println("Listando alunos Turma 2:");
                
        for(int i=0; i <= turma2.quantAlunos(); i++)
        {
            System.out.print("Nome: ");
            System.out.println(turma2.getAluno(i).getNome());
            System.out.print("Matrícula do Aluno: ");
            System.out.println(turma2.getAluno(i).getMatricula());
            System.out.println("Turno do Aluno: ");
            System.out.println(turma2.getAluno(i).getTurma().getTurno());
            System.out.println("\n\n\n");
        }
        
    }
    
}
