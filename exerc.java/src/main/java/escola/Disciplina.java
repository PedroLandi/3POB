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
public class Disciplina {
    private String nome;
    private int codigo;
    
    
    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;
    
    
    //professores que dão aquela disciplina
    public Disciplina(){
    professores = new ArrayList<Professor>();
    }

    
      public int quantProfessores(){
    
        return professores.size();   
    }
    
    public Professor getProfessor(int pos){
    
        return professores.get(pos);
    }
    
    public void adicionarProfessor(Professor professor){
    professores.add(professor);
    
    }
    
    public void removerProfessor(Professor professor){
        professores.remove(professor);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        
        if(codigo >= 0)
        {
        this.codigo = codigo;    
        }
        
        }
        
        
    }
    
    

