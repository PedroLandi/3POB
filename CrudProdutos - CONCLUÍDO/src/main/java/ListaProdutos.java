
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
      private ArrayList<String> produto;
      Scanner ler = new Scanner(System.in);
      private int item;
      private String str;
      private int cont = 0;


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
       
       public void setString(String str){
       this.str = str;
   }
       
       public Produto getProduto(int pos){
       return produtos.get(pos);
   }

         
         public boolean verificarStrings(String str) 
        {
            return str.matches("[a-zA-Z]+");
        }
         
       public String avaliarStrings(String str)
       {
      if (verificarStrings(str))
    {
        return str;
    }
    else
    {
        System.out.println("ERRO! - Inválido");
        System.out.println("Insira novamente: ");
        str = ler.nextLine();
        while(!verificarStrings(str))
        {
        System.out.println("ERRO! - Inválido");
        System.out.println("Insira novamente: ");
        str = ler.nextLine();
        }        
    }        
           return str;    
}
        
         public double converter_double(int cod){ //codigo 1 = Preço e codigo 2 = peso
     while(true){
         
         String linha = new String();
         
         if(cod == 1)
         {
               System.out.println("\nPreço do Produto: ");
               linha = ler.nextLine(); // ler a linha (termina no enter
         }
         else 
         {
             System.out.println("\nPeso do Produto: ");
             linha = ler.nextLine(); 
         }         
         
    try{
        double resposta = Double.parseDouble(linha); // (tenta converter pra double os dados inseridos)
        return resposta;
    }
    catch(NumberFormatException e){
        System.out.printf("Você não digitou um número válido!\n");
    }
  }
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
                String str;

                //fazendo o scan dos dados...
 
                System.out.println("\nNome do Produto: ");
                produtos.setNome(avaliarStrings(ler.nextLine()));
                
                System.out.println("\nCódigo de Barras: ");
                produtos.setCodBarras(avaliarStrings(ler.nextLine()));

                //codigo unico que é só daquele produto e daquela LOJA...
                System.out.println("\nSku: ");
                produtos.setSku(avaliarStrings(ler.nextLine()));

                System.out.println("\nDescrição: ");
                produtos.setDescricao(avaliarStrings(ler.nextLine()));
                
                System.out.println("\nCategoria: ");
                produtos.setCategoria(avaliarStrings(ler.nextLine()));

                System.out.println("\nFabricante: ");
                produtos.setFabricante(avaliarStrings(ler.nextLine()));
                
                //como somente o ID é num inteiro, 
                //a validação é feita diretamente na função...
                produtos.setId(cont+1);
                //validando se as variáveis preço e peso são do tipo double...  
                //obs cod 1 == preço e cod 2 == peso
                produtos.setPreco(converter_double(1));
                produtos.setPeso(converter_double(2));
                //incluindo produto
                listaProdutos.incluirProduto(produtos);
                cont++; //incrementando no ID...
                
                System.out.println("\n\nProduto inserido com sucesso!\n\n\n");
                
        }
        
        //excluir um produto
 
        public void excluirProduto(int pos, ListaProdutos lista)
        {
            produtos.remove(pos);
            System.out.println("\nProduto excluído com sucesso!\n");
        }
        
        
        public void alterarItem(ListaProdutos lista, int pos)
        {
            String str;
            //fazendo o scan dos dados...

           
            
            if(lista.quantProdutos() == 0)
            {
                System.out.println("Lista vazia!\n");
            }
            else
            {
                
            System.out.printf("Digite a posição do produto (1 a %d): ", lista.quantProdutos());
            pos = ler.nextInt();
            
            
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
                               "7- Preço\n"+ 
                               "8- Peso"  
            );
            System.out.println("Número do item a ser alterado: ");
            item = ler.nextInt();
            
            ler.nextLine(); //esvaziar buffer...
            
            
            if(item > 0 && item <10)
            {
                 
                pos = pos-1;
                
                switch (item) {
                        case 1:
                        System.out.println("\n(novo) - Nome do Produto: ");
                        lista.getProduto(pos).setNome(avaliarStrings(ler.nextLine()));  
                        break;

                        case 2:
                        System.out.println("\n(novo) - Código de Barras: ");
                         lista.getProduto(pos).setCodBarras(avaliarStrings(ler.nextLine()));  
                
                        break;
                        case 3:
                        System.out.println("\n(novo) - Sku: ");
                         lista.getProduto(pos).setSku(avaliarStrings(ler.nextLine()));  
                  
                        break;
                        
                        case 4:
                        System.out.println("\n(novo) - Descrição: ");
                         lista.getProduto(pos).setDescricao(avaliarStrings(ler.nextLine()));  
                  
                        break;

                        case 5:
                        System.out.println("\n(novo) - Categoria: ");
                        lista.getProduto(pos).setCategoria(avaliarStrings(ler.nextLine()));  
                       
                        break;
 
                        case 6:
                        System.out.println("\n(novo) - Fabricante: ");
                        lista.getProduto(pos).setFabricante(avaliarStrings(ler.nextLine()));  
                        
                        break;
   
                        case 7:
                        System.out.printf("\n(novo) - ");
                        lista.getProduto(pos).setPreco(converter_double(1));
                        break;

                        case 8:
                        System.out.printf("\n(novo) - ");
                        lista.getProduto(pos).setPeso(converter_double(2));
                        
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

