/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progteste.copa_do_mundo;

/**
 *
 * @author Pedro Henrique
 */
public class Confronto {
    
    private String data;
    private String hora;
    private String local;
    private String selecao1;
    private String selecao2;
    private String placar;
    private char grupo;
    
    public Confronto(){}
    

   Confronto(String data, String hora, String local, String selecao1, String selecao2, String placar, char grupo)
    {
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.selecao1 = selecao1;
        this.selecao2 = selecao2;
        this.placar = placar;
        this.grupo = grupo;
    }
   

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getSelecao1() {
        return selecao1;
    }

    public void setSelecao1(String selecao1) {
        this.selecao1 = selecao1;
    }

    public String getSelecao2() {
        return selecao2;
    }

    public void setSelecao2(String selecao2) {
        this.selecao2 = selecao2;
    }

    public String getPlacar() {
        return placar;
    }

    public void setPlacar(String placar) {
        this.placar = placar;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }
    
    
    
    
    
    
       
      
}
       
       
     

