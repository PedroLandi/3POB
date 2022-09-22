/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progteste.amigosrestaurante;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro Henrique
 */

public class Amigo {

    private String nome;
    private double valor;
    private double tax = 0.15;
    private double tip = 0.05;

    Amigo(String nome, double valor)
    {
        this.nome = nome;
        this.valor = valor; 
    }
   
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
      public double Calcula(double valor)
    {
        return valor * (1+tax+tip);
    }
    

}
