/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

import java.util.ArrayList;

/**
 *
 * @author Pedro Henrique
 */
public class Turma {
   private String turno;
   private int codigo;
    
   private ArrayList<Aluno> alunos;
   private ArrayList<Disciplina> disciplinas;
   private ArrayList<Professor> professores;
   
   
   //método construtor...
   public Turma(){
    
    alunos = new ArrayList<Aluno>();
}
  
   
   //método para adicionar alunos na lista
   public void adicionarAluno(Aluno aluno){
       alunos.add(aluno);
   }
   
   public int quantAlunos(){
       
       return alunos.size();
   }
   
   public Aluno getAluno(int pos){
    
       return alunos.get(pos);
   }
   
   public void removerAluno(Aluno aluno){
       
       alunos.remove(aluno);
   }
  
     public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    void adicionarAluno(){
   
    }
    
  
    
}
