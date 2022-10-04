
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
public class ListaProdutos {
   
      private ArrayList<Produto> produtos;
      Scanner ler = new Scanner(System.in);
      private int item;


   //método construtor...
   public ListaProdutos(){

    produtos = new ArrayList<Produto>();
}
      
       public void incluirProduto(Produto produto){
       produtos.add(produto);
   }
       

       public int quantProdutos(){
       
       return produtos.size();
   }
       
        public Produto setProduto(int pos){
    
       return produtos.get(pos);
   }

        
        public Produto getProduto(int pos){
    
       return produtos.get(pos);
   }
        
        public void exibeProdutos(ListaProdutos lista)
        {
            
            System.out.println("\n****Exibindo todos produtos****\n");

            for(int i = 0; i<lista.quantProdutos(); i++)
        {

                System.out.printf("\n(Produto %d)\n\n", i+1);
            
                System.out.printf("Nome do Produto: %s\n", lista.getProduto(i).getNome());
       
                System.out.printf("Código de Barras: %s\n", lista.getProduto(i).getCodBarras());

                //codigo unico que é só daquele produto e daquela LOJA...
                System.out.printf("Sku: %s\n", lista.getProduto(i).getSku());
   
                System.out.printf("Descrição: %s\n", lista.getProduto(i).getDescricao());
     
                System.out.printf("Categoria: %s\n", lista.getProduto(i).getCategoria());
         
                System.out.printf("Fabricante: %s\n", lista.getProduto(i).getFabricante());
             
                System.out.printf("Id: %d\n", lista.getProduto(i).getId());
      
                System.out.printf("Preço do Produto: R$%.2f\n", lista.getProduto(i).getPreco());
   
                System.out.printf("Peso do Produto: %.1f\n", lista.getProduto(i).getPeso());
        }
 
        
        }
        
        public void exibirProduto(int pos, ListaProdutos lista)
        {

                System.out.printf("\n\n(Produto %d)\n\n", pos+1);
            
                System.out.printf("Nome do Produto: %s\n", lista.getProduto(pos).getNome());
       
                System.out.printf("Código de Barras: %s\n", lista.getProduto(pos).getCodBarras());

                //codigo unico que é só daquele produto e daquela LOJA...
                System.out.printf("Sku: %s\n", lista.getProduto(pos).getSku());
   
                System.out.printf("Descrição: %s\n", lista.getProduto(pos).getDescricao());
     
                System.out.printf("Categoria: %s\n", lista.getProduto(pos).getCategoria());
         
                System.out.printf("Fabricante: %s\n", lista.getProduto(pos).getFabricante());
             
                System.out.printf("Id: %d\n", lista.getProduto(pos).getId());
      
                System.out.printf("Preço do Produto: R$%.2f\n", lista.getProduto(pos).getPreco());
   
                System.out.printf("Peso do Produto: %.1f\n", lista.getProduto(pos).getPeso());

        }
        
        
        public void inserirProduto(ListaProdutos listaProdutos)
        {
            
                Produto produtos = new Produto();
                //fazendo o scan dos dados...
                
                System.out.println("\nNome do Produto: ");
                produtos.setNome(ler.nextLine());

                System.out.println("\nCódigo de Barras: ");
                produtos.setCodBarras(ler.nextLine());

                //codigo unico que é só daquele produto e daquela LOJA...
                
                System.out.println("\nSku: ");
                produtos.setSku(ler.nextLine());

                System.out.println("\nDescrição: ");
                produtos.setDescricao(ler.nextLine());
                
                System.out.println("\nCategoria: ");
                produtos.setCategoria(ler.nextLine());

                System.out.println("\nFabricante: ");
                produtos.setFabricante(ler.nextLine());
      
                System.out.println("\nID: ");
                produtos.setId(ler.nextInt());
                 
                System.out.println("\nPreço do Produto: ");
                produtos.setPreco(ler.nextDouble());

                System.out.println("\nPeso do produto: ");
                produtos.setPeso(ler.nextDouble());

                //limpar buffer do teclado
                ler.nextLine();

                listaProdutos.incluirProduto(produtos);
  
        }
        
        //excluir um produto
 
        public void excluirProduto(int pos, ListaProdutos lista)
        {
            produtos.remove(pos);
            System.out.println("\nProduto excluído com sucesso!\n");
        }
        
        
        public void alterarItem(ListaProdutos lista, int pos)
        {
            
            System.out.println("Digite a posição do produto: ");
            pos = ler.nextInt();
            
            
            if(lista.quantProdutos() == 0)
            {
                System.out.println("Lista vazia!\n");
            }
            else
            {
            
            if(pos <= lista.quantProdutos() && pos > 0)
            {
            System.out.println("PRODUTO "+ pos);
                
            System.out.println("Digite um item a ser alterado: ");
        
            System.out.println("1- Nome\n" +
                               "2- Código de Barras\n" +
                               "3- Sku\n" +
                               "4- Descrição\n" +
                               "5- Categoria\n"+ 
                               "6- Fabricante\n" +
                               "7- Id\n" +
                               "8- Preço\n"+ 
                               "9- Peso"  
            );
            System.out.println("Número do item a ser alterado: ");
            item = ler.nextInt();
            
            
            if(item > 0 && item <10)
            {
                pos = pos-1;
                
                switch (item) {
                        case 1:
                        System.out.println("\n(novo) - Nome do Produto: ");
                        lista.setProduto(pos).setNome(ler.nextLine());
                        
                        ler.nextLine();
                        break;
                        
                        case 2:
                        System.out.println("\n(novo) - Código de Barras: ");
                        lista.setProduto(pos).setCodBarras(ler.nextLine());
                        ler.nextLine();
                        break;
                        case 3:
                        System.out.println("\n(novo) - Sku: ");
                        lista.setProduto(pos).setSku(ler.nextLine());
                        ler.nextLine();
                        break;
                        
                        case 4:
                        System.out.println("\n(novo) - Descrição: ");
                        lista.setProduto(pos).setDescricao(ler.nextLine());
                        ler.nextLine();
                        break;

                        case 5:
                        System.out.println("\n(novo) - Categoria: ");
                        lista.setProduto(pos).setCategoria(ler.nextLine());
                        ler.nextLine();
                        break;
 
                        case 6:
                        System.out.println("\n(novo) - Fabricante: ");
                        lista.setProduto(pos).setFabricante(ler.nextLine());
                        ler.nextLine();
                        break;
                        
                        case 7:
                        System.out.println("\n(novo) - Id: ");
                        lista.setProduto(pos).setId(ler.nextInt());
                        ler.nextLine();
                        break;
                        
                        case 8:
                        System.out.println("\n(novo) - Preço: ");
                        lista.setProduto(pos).setPreco(ler.nextDouble());
                        ler.nextLine();
                        break;

                        case 9:
                        System.out.println("\n(novo) - Peso: ");
                        lista.setProduto(pos).setPeso(ler.nextDouble());
                        ler.nextLine();
                        break;
  
                       default:
                        break;
                            }  
            }
            else
            {
                System.out.println("ERRO! O número não pertence a lista!\n");
            }

            }
            
            else
            {
 
              System.out.printf("Erro! não há produto com esse número", lista.quantProdutos());
            
            }
            
            }
        }
}

   
        


