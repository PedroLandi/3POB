import java.io.FileWriter;
import java.io.IOException;
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

    
    public void ExibeMenu() throws IOException
    {
        Scanner ler = new Scanner(System.in);
    
        System.out.println("\n\n1- Incluir produto\n" +
                           "2- Alterar produto\n" +
                           "3- Excluir produto\n" +
                           "4- Listar todos produtos\n" +
                           "5- Listar um produto\n"+ 
                           "6- Listar produtos no arquivo\n"+
                           "7- Sair\n\n");
 
        System.out.println("\n______Digite sua opção: ______\n");
        option = ler.nextInt();

        while(option != 7)
        {
            switch (option) {
            //incluir 1 produto...
                case 1:
                    lista.inserirProduto(lista);
                    System.out.println("Produto inserido com sucesso!");
                    break;
                case 2:
  
                    lista.alterarItem(lista, pos);
                    System.out.println("Produto alterado com sucesso!");
                    
                    break;
                case 3:
                    
                    //verificar se posicao existe...
                    if(lista.quantProdutos() != 0)
                    {
                        System.out.println("Digite a posição do item a ser removido: (ex: 1)");
                        pos = ler.nextInt();
                        pos = pos-1;
                        
                        if(pos > lista.quantProdutos() || pos < 0)
                        {
                         System.out.printf("Erro! Insira um número de 1 a %d", lista.quantProdutos());
                        }
                        else
                        {
                            lista.excluirProduto(pos, lista);
                            System.out.println("O produto foi removido!");
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

                        System.out.println("Indique a posição do produto: (ex: 1)");
                        pos = ler.nextInt();


                        if(pos <= lista.quantProdutos() && pos >= 0)
                        {
                            lista.exibirProduto(pos-1, lista);
                        }
                        else
                        {
                            System.out.printf("\n\nErro! Insira um número de 1 a %d\n", lista.quantProdutos());
                        }

                        }
                        else
                        {
                            System.out.println("A lista está vazia!");        
                        }

                        break;
                    
                    case 6:

                            if(lista.quantProdutos() == 0)
                            {
                                System.out.println("\nLista vazia!\n");
                            }
                            String caminho = "C:/temp/textoExemplo.txt";
                            FileWriter escritor = new FileWriter(caminho);
                            
                            {
                            escritor.append("\n****Exibindo todos produtos****\n");

            for(int i = 0; i<lista.quantProdutos(); i++)
        {
            escritor.append("\n\n\nProduto -- "+ (i+1));
            escritor.append("\n\n\nNome do Produto: " + lista.getProduto(i).getNome());
            escritor.append("\nCódigo de Barras: "+ lista.getProduto(i).getCodBarras());
            escritor.append("\nSku: " + lista.getProduto(i).getSku());
            escritor.append("\nDescrição: " + lista.getProduto(i).getDescricao());
            escritor.append("\nCategoria: " + lista.getProduto(i).getCategoria());
            escritor.append("\nFabricante: " + lista.getProduto(i).getFabricante());
            escritor.append("\nId: " + lista.getProduto(i).getId());
            escritor.append("\nPreço do Produto: R$" + lista.getProduto(i).getPreco());
            escritor.append("\nPeso do Produto: " + lista.getProduto(i).getPeso());
        }
}             
          escritor.close();
          break;
                default: System.out.println("DIGITE UM NÚMERO VÁLIDO!"); 
                    break;
            }
                    System.out.println("\n\n1- Incluir produto\n" +
                           "2- Alterar produto\n" +
                           "3- Excluir produto\n" +
                           "4- Listar todos produtos\n" +
                           "5- Listar um produto\n"+ 
                           "6- Listar produtos no arquivo\n"+
                           "7- Sair\n\n");

                    System.out.println("\n______Digite sua opção: ______\n");
                    option = ler.nextInt();
        }
    }
}
