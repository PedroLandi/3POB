
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro Henrique
 */
public class Menu {
    
    private int pos;

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    ListaProdutos lista = new ListaProdutos();
    
    private int option;

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    
    public void ExibeMenu()
    {
        Scanner ler = new Scanner(System.in);
    
        System.out.println("1- Incluir produto\n" +
                           "2- Alterar produto\n" +
                           "3- Excluir produto\n" +
                           "4- Listar todos produtos\n" +
                           "5- Listar um produto\n"+ 
                           "6- Sair");
 
        System.out.println("\n______Digite sua opção: ______\n");
        option = ler.nextInt();

        while(option != 6)
        {
            switch (option) {
            //incluir 1 produto...
                case 1:
                    lista.inserirProduto(lista);
                    System.out.println("Produto inserido com sucesso!");
                    break;
                case 2:
  
                    lista.alterarItem(lista, pos);
                    
                    break;
                case 3:
                    
                    //verificar se posicao existe...
                    if(lista.quantProdutos() != 0)
                    {
                        System.out.println("Digite a posição do item a ser removido: ");
                        pos = ler.nextInt();
                        pos = pos-1;
                        
                        if(pos > lista.quantProdutos() || pos < 0)
                        {
                         System.out.printf("Erro! Insira um número de 1 a %d", lista.quantProdutos());
                        }
                        else
                        {
                            lista.excluirProduto(pos, lista);
                        }
                        }
                        else
                        {
                            System.out.println("Lista vazia!");

                        }
                    
                    break;
                case 4:
                    
                    //se existirem produtos eu posso exibir...
                    if(lista.quantProdutos() != 0)
                    {
                        lista.exibeProdutos(lista);
                    }
                    else
                    {
                        System.out.println("Lista vazia!");
                    }

                    break;
                case 5:
                    
                    if(lista.quantProdutos() != 0)
                    {

                    System.out.println("Indique a posição do produto: ");
                    pos = ler.nextInt();
                    
                    
                    if(pos <= lista.quantProdutos() && pos >= 0)
                    {
                        lista.exibirProduto(pos-1, lista);
                    }
                    else
                    {
                        System.out.printf("Erro! Insira um número de 1 a %d", lista.quantProdutos());
                    }

                    }
                    else
                    {
                        System.out.println("A lista está vazia!");        
                    }
                    
                    break;
                default: System.out.println("DIGITE UM NÚMERO VÁLIDO!"); 
                    break;
            }

                    System.out.println
                   ("1- Incluir produto\n" +
                    "2- Alterar produto\n" +
                    "3- Excluir produto\n" +
                    "4- Listar todos produtos\n" +
                    "5- Listar um produto\n"+ 
                    "6- Sair");
                    
                    System.out.println("\n______Digite sua opção: ______\n");
                    option = ler.nextInt();
        }
    }
    
    
 
}
