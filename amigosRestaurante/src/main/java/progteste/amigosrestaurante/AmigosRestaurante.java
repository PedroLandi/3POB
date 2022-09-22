/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package progteste.amigosrestaurante;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro Henrique
 */
public class AmigosRestaurante {

    public static void main(String[] args) {

            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o nome e o valor: ");
            Amigo amigo1 = new Amigo(ler.nextLine(), ler.nextDouble());
            
            ler.nextLine(); // esvazia o buffer do teclado
            
            System.out.println("Digite o nome e o valor: ");
            Amigo amigo2 = new Amigo(ler.nextLine(), ler.nextDouble());
            
            ler.nextLine(); // esvazia o buffer do teclado
            
            System.out.println("Digite o nome e o valor: ");
            Amigo amigo3 = new Amigo(ler.nextLine(), ler.nextDouble());
            
            ler.nextLine(); // esvazia o buffer do teclado
            
            System.out.println("Digite o nome e o valor: ");
            Amigo amigo4 = new Amigo(ler.nextLine(), ler.nextDouble());
            
            ler.nextLine(); // esvazia o buffer do teclado
            
            System.out.println("Digite o nome e o valor: ");
            Amigo amigo5 = new Amigo(ler.nextLine(), ler.nextDouble());
            
            
            //adicionando amigos na lista...
         
            Grupo listaAmigos = new Grupo();
           
            listaAmigos.adicionarAmigo(amigo1);
            listaAmigos.adicionarAmigo(amigo2);
            listaAmigos.adicionarAmigo(amigo3);
            listaAmigos.adicionarAmigo(amigo4);
            listaAmigos.adicionarAmigo(amigo5);
            
            
            System.out.println("    Pessoas:   ");
            for(int i=0;i<listaAmigos.quantAmigos();i++)    
            {
            System.out.println(listaAmigos.getAluno(i).getNome());
            }
            
            double resultado = 0;
            for(int j=0;j<listaAmigos.quantAmigos();j++)
            {
             resultado += listaAmigos.getAluno(j).Calcula(listaAmigos.getAluno(j).getValor());
            }
            
            System.out.println("\nTotal a pagar: R$" + resultado);

    }
}
