package progteste.copa_do_mundo;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro Henrique
 */
public class Selecao {
    
    private String nome; //nome da seleção
    private String nomeTec; //nome do técnico
    private char grupo; //grupo ao qual cada selecao pertence
    
    
    Selecao(String nome, String nomeTec, char grupo)
    {
        this.nome = nome;
        this.nomeTec = nomeTec;
        this.grupo = grupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeTec() {
        return nomeTec;
    }

    public void setNomeTec(String nomeTec) {
        this.nomeTec = nomeTec;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }
    
    
}



