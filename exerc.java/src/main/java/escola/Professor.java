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
public class Professor {
    private String nome;
    private int matricula;
    
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;

    
    public Professor(){
        disciplinas = new ArrayList<Disciplina>();
    }
    
    public int quantDisciplinas(){
    
        return disciplinas.size();   
    }
    
    public Disciplina getDisciplina(int pos){
    
        return disciplinas.get(pos);
    }
    
    public void adicionarDisciplina(Disciplina disciplina){
    disciplinas.add(disciplina);
    
    }
    
    public void removerDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
   
   
}
