 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package programateste.exerc.java;

import escola.Disciplina;

/**
 *
 * @author Pedro Henrique
 */
public class ExercJava {

    public static void main(String[] args) {
        
        //instanciação
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matemática");
        disciplina1.setCodigo(1);
        
        System.out.println(disciplina1.getNome());
        System.out.println(disciplina1.getCodigo());
        
        
        
     
    }
}
