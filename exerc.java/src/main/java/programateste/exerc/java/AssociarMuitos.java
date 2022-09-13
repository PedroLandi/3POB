/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programateste.exerc.java;

import escola.Disciplina;
import escola.Professor;

/**
 *
 * @author Pedro Henrique
 */
public class AssociarMuitos {
    
    public static void main(String[] args) {
        
        //criando disciplinas
        
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setCodigo(1);
        disciplina1.setNome("Matemática");
     
        
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setCodigo(2);
        disciplina2.setNome("Ciências");
        
        //criando professores

        Professor professor1 = new Professor();
        professor1.setNome("Leandro");
        professor1.setMatricula(2000);
     
        Professor professor2 = new Professor();
        professor2.setNome("Thiago");
        professor2.setMatricula(3000);
     
        //adicionando professores nas disciplinas e vice-versa...
        
        disciplina1.adicionarProfessor(professor1);
        professor1.adicionarDisciplina(disciplina1);
  
        disciplina1.adicionarProfessor(professor2);
        professor2.adicionarDisciplina(disciplina1);
        
        disciplina2.adicionarProfessor(professor2);
        professor2.adicionarDisciplina(disciplina2);
    
        System.out.printf("     Disciplinas do %s\n", professor1.getNome());
        
        for(int j=0; j < professor1.quantDisciplinas(); j++)
        {
            System.out.println(professor1.getDisciplina(j).getNome());
        }
        
         System.out.printf("\n     Disciplinas do %s\n", professor2.getNome());
        
        for(int i=0; i < professor2.quantDisciplinas(); i++)
        {
            System.out.println(professor2.getDisciplina(i).getNome());
        }
        
        //quant de professores de matemática
        
        System.out.printf("\n     Professores de %s\n", disciplina1.getNome());
        
        for(int i=0; i < disciplina1.quantProfessores(); i++)
        {
            System.out.println(disciplina1.getProfessor(i).getNome());
        }
        
        
        
      
        
    }
    
    
    
    
    
}

