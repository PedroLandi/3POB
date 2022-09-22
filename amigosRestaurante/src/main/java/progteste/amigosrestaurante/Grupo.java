/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progteste.amigosrestaurante;

import java.util.ArrayList;

/**
 *
 * @author Pedro Henrique
 */
public class Grupo {
    
    private ArrayList<Amigo> amigos;
    
    public void adicionarAmigo(Amigo amigo){
       amigos.add(amigo);
   }
    
      public Amigo getAluno(int pos){
      return amigos.get(pos);
   }
      
        public int quantAmigos(){
       
       return amigos.size();
   }
   
        public Grupo(){
        amigos = new ArrayList<Amigo>();
}
     

}


