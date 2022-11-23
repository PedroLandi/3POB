package progteste.copa_do_mundo;


import com.sun.xml.internal.ws.util.StringUtils;
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
      public class GrupoSelecao {
      private ArrayList<Confronto> confrontos;
      
    String time1;
    String time2;
      
      public GrupoSelecao(){
          
    confrontos = new ArrayList<Confronto>();
      }   
      
       public Confronto getConfronto(int pos){
       return confrontos.get(pos);
   }   
         
      public void adicionarConfronto(Confronto confronto)
   {
       confrontos.add(confronto);
   }  
       
       
       public int quantConfrontos(){
       return confrontos.size();
   }    
         public int encontrarConfronto(String nomeSelecao, GrupoSelecao lista)
         {
             int cont = 0;
      

        for(int i=0;i<lista.quantConfrontos();i++)
        {          
            if(lista.getConfronto(i).getSelecao1().equals(nomeSelecao) || lista.getConfronto(i).getSelecao2().equals(nomeSelecao))
            {
                cont++;
                
                System.out.printf("\n(Confronto %d)\n\n", cont);
                
                System.out.printf("%s (%s) %s\n", lista.getConfronto(i).getSelecao1(), lista.getConfronto(i).getPlacar() , lista.getConfronto(i).getSelecao2());
       
                System.out.printf("Data: %s\n", lista.getConfronto(i).getData());

                System.out.printf("Hora: %s\n", lista.getConfronto(i).getHora());
   
                System.out.printf("Local: %s\n", lista.getConfronto(i).getLocal());
     
                System.out.printf("Placar: %s\n", lista.getConfronto(i).getPlacar());
     
            }    
        }
        
        if(cont == 0)
        {
            return 0;
        }
        return 1;
    }
         
          public void exibirCalendario(GrupoSelecao lista) 
         {
             
              System.out.printf("\n(Exibindo calendário completo)\n\n");
           
        for(int i=0;i<lista.quantConfrontos();i++)
        {          
                System.out.printf("\n(Confronto %d)\n\n", i+1);
                
                System.out.printf("%s (%s) %s\n", lista.getConfronto(i).getSelecao1(),lista.getConfronto(i).getPlacar(), lista.getConfronto(i).getSelecao2());
       
                System.out.printf("Data: %s\n", lista.getConfronto(i).getData());

                System.out.printf("Hora: %s\n", lista.getConfronto(i).getHora());
   
                System.out.printf("Local: %s\n", lista.getConfronto(i).getLocal());
     
                System.out.printf("Placar: %s\n", lista.getConfronto(i).getPlacar());
        }
    }
          
          public int exibirResultado(String time1, String time2, GrupoSelecao lista) 
         {
             int controle = 0;
          
        for(int i=0;i<lista.quantConfrontos();i++)
        {          
            if(lista.getConfronto(i).getSelecao1().equals(time1) && (lista.getConfronto(i).getSelecao2().equals(time2)) || 
               lista.getConfronto(i).getSelecao2().equals(time1) && lista.getConfronto(i).getSelecao1().equals(time2))
            {
                controle = 1;
                
                System.out.printf("\n(Exibindo resultado %s x %s)\n\n", time1, time2);
                
                System.out.printf("%s venceu %s por %s\n", lista.getConfronto(i).getSelecao1(), 
                     lista.getConfronto(i).getSelecao2(), lista.getConfronto(i).getPlacar());
                
                System.out.printf("Confronto: %s x %s\n", lista.getConfronto(i).getSelecao1(), lista.getConfronto(i).getSelecao2());
       
                System.out.printf("Data: %s\n", lista.getConfronto(i).getData());

                System.out.printf("Hora: %s\n", lista.getConfronto(i).getHora());
   
                System.out.printf("Local: %s\n", lista.getConfronto(i).getLocal());
     
                System.out.printf("Placar: %s\n", lista.getConfronto(i).getPlacar());
            }    
        }
        if (controle == 0){
                return 0;
            }
        
        return 1;
    }
          
          
          public void exibirCalendarioGrupo(GrupoSelecao lista, Character grupo) 
    {
     
        int cont = 0;
        int continuar = 1;
        
        for(int i=0;i<lista.quantConfrontos();i++)
        {
            if(continuar == 0)
            {
                break; 
            }

            if(lista.getConfronto(i).getGrupo() == grupo)
            {   
                continuar = 0;
                System.out.printf("Exibindo o calendário do grupo %c\n\n", grupo);
                
                for(int j=i; lista.getConfronto(j).getGrupo() == grupo;j++)                
                {
                        System.out.printf("\n(Confronto %d)\n\n", cont = cont+1);

                        System.out.printf("%s (%s) %s\n", lista.getConfronto(j).getSelecao1(), lista.getConfronto(j).getPlacar() , lista.getConfronto(j).getSelecao2());

                        System.out.printf("Data: %s\n", lista.getConfronto(j).getData());

                        System.out.printf("Hora: %s\n", lista.getConfronto(j).getHora());

                        System.out.printf("Local: %s\n", lista.getConfronto(j).getLocal());
                        
                        //evitando comparação com um lugar vazio na memória...
                        if(j == 47)
                        {
                            break;
                        }                
                }
            }
            else 
            {
                i = i+5; //andando até o próximo grupo
            }           
        }      
    }
           
    public void menu()
   {
       
    GrupoSelecao listaConfrontos  = new GrupoSelecao();
       
    Selecao selecao1 = new Selecao("Catar", "Alfredo", 'A');
    Selecao selecao2 = new Selecao("Equador", "Alfredo", 'A');
    Selecao selecao3 = new Selecao("Senegal", "Alfredo", 'A');
    Selecao selecao4 = new Selecao("Holanda", "Alfredo", 'A');
    
    Selecao selecao5 = new Selecao("Inglaterra", "Bernardo", 'B');
    Selecao selecao6 = new Selecao("Irã", "Bernardo", 'B');
    Selecao selecao7 = new Selecao("Estados Unidos", "Bernardo", 'B');
    Selecao selecao8 = new Selecao("País de Gales", "Bernardo", 'B');
    
    Selecao selecao9 = new Selecao("Argentina", "Carlos", 'C');
    Selecao selecao10 = new Selecao("Arábia Saudita", "Carlos", 'C');
    Selecao selecao11 = new Selecao("México", "Carlos", 'C');
    Selecao selecao12 = new Selecao("Polônia", "Carlos", 'C');
    
    Selecao selecao13 = new Selecao("França", "Diana", 'D');
    Selecao selecao14 = new Selecao("Austrália", "Diana", 'D');
    Selecao selecao15 = new Selecao("Dinamarca", "Diana", 'D');
    Selecao selecao16 = new Selecao("Tunísia", "Diana", 'D');
    
    Selecao selecao17 = new Selecao("Espanha", "Elídio", 'E');
    Selecao selecao18 = new Selecao("Costa Rica", "Elídio", 'E');
    Selecao selecao19 = new Selecao("Alemanha", "Elídio", 'E');
    Selecao selecao20 = new Selecao("Japão", "Elídio", 'E');
     
    Selecao selecao21 = new Selecao("Bélgica", "Frederico", 'F');
    Selecao selecao22 = new Selecao("Canadá", "Frederico", 'F');
    Selecao selecao23 = new Selecao("Marrocos", "Frederico", 'F');
    Selecao selecao24 = new Selecao("Croácia", "Frederico", 'F');
     
    Selecao selecao25 = new Selecao("Brasil", "Gabriel", 'G');
    Selecao selecao26 = new Selecao("Sérvia", "Gabriel", 'G');
    Selecao selecao27 = new Selecao("Suíça", "Gabriel", 'G');
    Selecao selecao28 = new Selecao("Camarões", "Gabriel", 'G');
     
    Selecao selecao29 = new Selecao("Portugal", "Hélio", 'H');
    Selecao selecao30 = new Selecao("Gana", "Hélio", 'H');
    Selecao selecao31 = new Selecao("Uruguai", "Hélio", 'H');
    Selecao selecao32 = new Selecao("Coréia do Sul", "Hélio", 'H');
    
        


//preenchendo os confrontos com placares fictícios......
    
/*
20/11 ? 13h00 ? Catar x Equador ? Estádio Al Bayt
21/11 ? 13h00 ? Senegal x Holanda ? Estádio Al Thumama
25/11 ? 10h00 ? Catar x Senegal ? Estádio Al Thumama
25/11 ? 13h00 ? Holanda x Equador ? Estádio Internacional Khalifa
29/11 ? 12h00 ? Holanda x Catar ? Esayttádio Al Bayt
29/11 ? 12h00 ? Equador x Senegal ? Estádio Internacional Khalifa
*/
         
/*  Selecao selecao1 = new Selecao("Catar", "Alfredo", 'A');
    Selecao selecao2 = new Selecao("Equador", "Alfredo", 'A');
    Selecao selecao3 = new Selecao("Senegal", "Alfredo", 'A');
    Selecao selecao4 = new Selecao("Holanda", "Alfredo", 'A');*/

//placares fictícios...
       Confronto confronto1 = new Confronto("20/11", "13h00", "Estádio Al Bayt", selecao1.getNome(), selecao2.getNome(), "2x0", selecao1.getGrupo());
       Confronto confronto2 = new Confronto("21/11", "13h00", "Estádio Al Thumama", selecao4.getNome(), selecao3.getNome(), "2x0", selecao1.getGrupo()); 
       Confronto confronto3 = new Confronto("25/11", "10h00", "Estádio Al Thumama", selecao1.getNome(), selecao3.getNome(), "3x1", selecao1.getGrupo());
       Confronto confronto4 = new Confronto("25/11", "13h00", "Estádio Internacional Khalifa", selecao4.getNome(), selecao2.getNome(), "2x2", selecao1.getGrupo());
       Confronto confronto5 = new Confronto("29/11", "12h00", "Esayttádio Al Bayt", selecao4.getNome(), selecao1.getNome(), "5x2", selecao1.getGrupo()); 
       Confronto confronto6 = new Confronto("29/11", "12h00", "Estádio Internacional Khalifa", selecao2.getNome(), selecao3.getNome(), "3x1", selecao1.getGrupo()); 
       
       /*
21/11 ? 10h00 ? Inglaterra x Irã ? Estádio Internacional Khalifa
21/11 ? 16h00 ? Estados Unidos x Gales ? Estádio Ahmad bin Ali
25/11 ? 07h00 ? Gales x Irã ? Estádio Ahmed bin Ali
25/11 ? 16h00 ? Inglaterra x Estados Unidos ? Estádio Al Bayt
29/11 ? 16h00 ? Gales x Inglaterra ? Estádio Ahmad bin Ali
29/11 ? 16h00 ? Irã x Estados Unidos ? Estádio Al Thumama
       
       
    Selecao selecao5 = new Selecao("Inglaterra", "Bernardo", 'B');
    Selecao selecao6 = new Selecao("Irã", "Bernardo", 'B');
    Selecao selecao7 = new Selecao("Estados Unidos", "Bernardo", 'B');
    Selecao selecao8 = new Selecao("País de Gales", "Bernardo", 'B');
       */
       
       Confronto confronto7 = new Confronto("21/11", "10h00", "Estádio Internacional Khalifa", selecao5.getNome(), selecao6.getNome(), "6x2", selecao5.getGrupo()); 
       Confronto confronto8 = new Confronto("21/11", "16h00", "Estádio Ahmad bin Ali", selecao7.getNome(), selecao8.getNome(), "3x2", selecao5.getGrupo());
       Confronto confronto9 = new Confronto("25/11", "07h00", "Estádio Ahmad bin Ali", selecao8.getNome(), selecao6.getNome(), "2x0", selecao5.getGrupo());
       Confronto confronto10 = new Confronto("25/11", "16h00", "Estádio Al Bayt", selecao5.getNome(), selecao7.getNome(), "2x0", selecao5.getGrupo()); 
       Confronto confronto11 = new Confronto("29/11", "16h00", "Estádio Ahmad bin Ali", selecao8.getNome(), selecao5.getNome(), "3x1", selecao5.getGrupo());
       Confronto confronto12 = new Confronto("29/11", "16h00", "Estádio Al Thumama", selecao6.getNome(), selecao7.getNome(), "2x2", selecao5.getGrupo());
             /*
       
22/11 ? 07h00 ? Argentina x Arábia Saudita ? Estádio Nacional de Lusail
22/11 ? 13h00 ? México x Polônia ? Estádio 974
26/11 ? 10h00 ? Polônia x Arábia Saudita ? Estádio Cidade da Educação
26/11 ? 16h00 ? Argentina x México ? Estádio Nacional de Lusail
30/11 ? 16h00 ? Arábia Saudita x México ? Estádio Nacional de Lusail
30/11 ? 16h00 ? Polônia x Argentina ? Estádio 974
       
       
    Selecao selecao9 = new Selecao("Argentina", "Carlos", 'C');
    Selecao selecao10 = new Selecao("Arábia Saudita", "Carlos", 'C');
    Selecao selecao11 = new Selecao("México", "Carlos", 'C');
    Selecao selecao12 = new Selecao("Polônia", "Carlos", 'C');
    
       
             */
   
       Confronto confronto13 = new Confronto("22/11", "07h00", "Estádio Nacional de Lusail", selecao9.getNome(), selecao10.getNome(), "5x2", selecao9.getGrupo()); 
       Confronto confronto14 = new Confronto("22/11", "13h00", "Estádio 974", selecao11.getNome(), selecao12.getNome(), "3x1", selecao9.getGrupo()); 
       Confronto confronto15 = new Confronto("26/11", "10h00", "Estádio Cidade da Educação", selecao12.getNome(), selecao10.getNome(), "2x0", selecao9.getGrupo());
       Confronto confronto16 = new Confronto("26/11", "16h00", "Estádio Nacional de Lusail", selecao9.getNome(), selecao11.getNome(), "2x0", selecao9.getGrupo()); 
       Confronto confronto17 = new Confronto("30/11", "16h00", "Estádio Nacional de Lusail", selecao10.getNome(), selecao11.getNome(), "3x2", selecao9.getGrupo());
       Confronto confronto18 = new Confronto("30/11", "16h00", "Estádio 974", selecao12.getNome(), selecao9.getNome(), "3x2", selecao9.getGrupo());
       
        /*
       Grupo D
22/11 ? 10h00 ? Dinamarca x Tunísia ? Estádio Cidade da Educação
22/11 ? 16h00 ? França x Austrália ? Estádio Al Janoub
26/11 ? 07h00 ? Tunísia x Austrália ? Estádio Al Janoub
26/11 ? 13h00 ? França x Dinamarca ? Estádio 974
30/11 ? 12h00 ? Tunísia x França ? Estádio Cidade da Educação
30/11 ? 12h00 ? Austrália x Dinamarca ? Estádio Al Janoub

    Selecao selecao13 = new Selecao("França", "Diana", 'D');
    Selecao selecao14 = new Selecao("Austrália", "Diana", 'D');
    Selecao selecao15 = new Selecao("Dinamarca", "Diana", 'D');
    Selecao selecao16 = new Selecao("Tunísia", "Diana", 'D');
       
             */
       
       Confronto confronto19 = new Confronto("22/11", "10h00", "Estádio Cidade da Educação", selecao15.getNome(), selecao16.getNome(), "5x2", selecao13.getGrupo()); 
       Confronto confronto20 = new Confronto("22/11", "16h00", "Estádio Al Janoub", selecao13.getNome(), selecao14.getNome(), "3x1",  selecao13.getGrupo()); 
       Confronto confronto21 = new Confronto("26/11", "07h00", "Estádio Al Janoub", selecao16.getNome(), selecao14.getNome(), "2x0",  selecao13.getGrupo());
       Confronto confronto22 = new Confronto("26/11", "13h00", "Estádio 974", selecao13.getNome(), selecao15.getNome(), "2x0",  selecao13.getGrupo()); 
       Confronto confronto23 = new Confronto("30/11", "12h00", "Estádio Cidade da Educação", selecao13.getNome(), selecao16.getNome(), "3x2", selecao13.getGrupo());
       Confronto confronto24 = new Confronto("30/11", "12h00", "Estádio Al Janoub", selecao14.getNome(), selecao15.getNome(), "3x2",  selecao13.getGrupo());
       
       
              /*
       Grupo E
23/11 ? 10h00 ? Alemanha x Japão ? Estádio Internacional Khalifa
23/11 ? 13h00 ? Espanha x Costa Rica ou Nova Zelândia ? Estádio Al Thumama
27/11 ? 07h00 ? Japão x Costa Rica ou Nova Zelândia ? Estádio Ahmad bin Ali
27/11 ? 16h00 ? Espanha x Alemanha ? Estádio Al Bayt
01/12 ? 16h00 ? Japão x Espanha ? Estádio Internacional Khalifa
01/12 ? 16h00 ? Costa Rica ou Nova Zelândia x Alemanha ? Estádio Al Bayt
       
    Selecao selecao17 = new Selecao("Espanha", "Elídio", 'E');
    Selecao selecao18 = new Selecao("Costa Rica", "Elídio", 'E');
    Selecao selecao19 = new Selecao("Alemanha", "Elídio", 'E');
    Selecao selecao20 = new Selecao("Japão", "Elídio", 'E');
               */
       Confronto confronto25 = new Confronto("23/11", "10h00", "Estádio Internacional Khalifa",  selecao19.getNome(), selecao20.getNome(), "5x2",  selecao17.getGrupo()); 
       Confronto confronto26 = new Confronto("23/11", "13h00", "Estádio Al Thumama", selecao17.getNome(), selecao18.getNome(), "3x1", selecao17.getGrupo()); 
       Confronto confronto27 = new Confronto("27/11", "07h00", "Estádio Ahmad bin Ali", selecao20.getNome(), selecao18.getNome(), "2x0", selecao17.getGrupo());
       Confronto confronto28 = new Confronto("27/11", "16h00", "Estádio Al Bayt", selecao17.getNome(),  selecao19.getNome(), "2x0", selecao17.getGrupo()); 
       Confronto confronto29 = new Confronto("01/12", "16h00", "Estádio Internacional Khalifa",  selecao20.getNome(), selecao17.getNome(), "3x2", selecao17.getGrupo());
       Confronto confronto30 = new Confronto("01/12", "16h00", "Estádio Al Bayt",  selecao18.getNome(),  selecao19.getNome(), "3x2", selecao17.getGrupo());
       /*
       Grupo F
23/11 ? 07h00 ? Marrocos x Croácia ? Estádio Al Bayt
23/11 ? 16h00 ? Bélgica x Canadá ? Estádio Ahmad bin Ali
27/11 ? 10h00 ? Bélgica x Marrocos ? Estádio Al Thumama
27/11 ? 13h00 ? Croácia x Canadá ? Estádio Internacional Khalifa
01/12 ? 12h00 ? Croácia x Bélgica ? Estádio Ahmad bin Ali
01/12 ? 12h00 ? Canadá x Marrocos ? Estádio Al Thumama
       
    Selecao selecao21 = new Selecao("Bélgica", "Frederico", 'F');
    Selecao selecao22 = new Selecao("Canadá", "Frederico", 'F');
    Selecao selecao23 = new Selecao("Marrocos", "Frederico", 'F');
    Selecao selecao24 = new Selecao("Croácia", "Frederico", 'F');
       */
       
       Confronto confronto31 = new Confronto("23/11", "07h00", "Estádio Al Bayt", selecao23.getNome(), selecao24.getNome(), "5x2", selecao21.getGrupo()); 
       Confronto confronto32 = new Confronto("23/11", "16h00", "Estádio Ahmad bin Ali", selecao21.getNome(), selecao22.getNome(), "3x1", selecao21.getGrupo()); 
       Confronto confronto33 = new Confronto("27/11", "10h00", "Estádio Al Thumama", selecao21.getNome(), selecao23.getNome(), "2x0", selecao21.getGrupo());
       Confronto confronto34 = new Confronto("27/11", "13h00", "Estádio Internacional Khalifa", selecao24.getNome(), selecao22.getNome(), "2x0", selecao21.getGrupo()); 
       Confronto confronto35 = new Confronto("01/12", "12h00", "Estádio Ahmad bin Ali", selecao24.getNome(), selecao21.getNome(), "3x2", selecao21.getGrupo());
       Confronto confronto36 = new Confronto("01/12", "12h00", "Estádio Al Thumama", selecao22.getNome(), selecao23.getNome(), "3x2", selecao21.getGrupo());
      
       /*
       Grupo G
24/11 ? 07h00 ? Suíça x Camarões ? Estádio Al Janoub
24/11 ? 16h00 ? Brasil  x Sérvia ? Estádio Nacional de Lusail
28/11 ? 07h00 ? Camarões x Sérvia ? Estádio Al Janoub
28/11 ? 13h00 ? Brasil x Suíça ? Estádio 974
02/12 ? 16h00 ? Camarões x Brasil ? Estádio Nacional de Lusail
02/12 ? 16h00 ? Sérvia x Suíça ? Estádio 974
  
    Selecao selecao25 = new Selecao("Brasil", "Gabriel", 'G');
    Selecao selecao26 = new Selecao("Sérvia", "Gabriel", 'G');
    Selecao selecao27 = new Selecao("Suíca", "Gabriel", 'G');
    Selecao selecao28 = new Selecao("Camarões", "Gabriel", 'G');
       */
       
       Confronto confronto37 = new Confronto("24/11", "07h00", "Estádio Al Janoub", selecao27.getNome(), selecao28.getNome(), "5x2", selecao25.getGrupo()); 
       Confronto confronto38 = new Confronto("24/11", "16h00", "Estádio Nacional de Lusail", selecao25.getNome(), selecao26.getNome(), "3x1", selecao25.getGrupo()); 
       Confronto confronto39 = new Confronto("28/11", "07h00", "Estádio Al Janoub", selecao28.getNome(), selecao26.getNome(), "2x0", selecao25.getGrupo());
       Confronto confronto40 = new Confronto("28/11", "13h00", "Estádio 974", selecao25.getNome(), selecao27.getNome(), "2x0", selecao25.getGrupo()); 
       Confronto confronto41 = new Confronto("02/12", "16h00", "Estádio Nacional de Lusail", selecao25.getNome(), selecao28.getNome(), "3x2", selecao25.getGrupo());
       Confronto confronto42 = new Confronto("02/12", "16h00", "Estádio 974", selecao26.getNome(), selecao27.getNome(), "3x2", selecao25.getGrupo());
      
       /*
       Grupo H
24/11 ? 10h00 ? Uruguai x Coreia do Sul ? Estádio Cidade da Educação
24/11 ? 13h00 ? Portugal x Gana ? Estádio 974
28/11 ? 10h00 ? Coreia do Sul x Gana ? Estádio Cidade da Educação
28/11 ? 16h00 ? Portugal x Uruguai ? Estádio Nacional de Lusail
02/12 ? 12h00 ? Coreia do Sul x Portugal ? Estádio Cidade da Educação
02/12 ? 12h00 ? Gana x Uruguai ? Estádio Al Janoub
       
    Selecao selecao29 = new Selecao("Portugal", "Hélio", 'H');
    Selecao selecao30 = new Selecao("Gana", "Hélio", 'H');
    Selecao selecao31 = new Selecao("Uruguai", "Hélio", 'H');
    Selecao selecao32 = new Selecao("Coréia do Sul", "Hélio", 'H');
       */
       Confronto confronto43 = new Confronto("24/11", "10h00", "Estádio Cidade da Educação", selecao31.getNome(), selecao32.getNome(), "5x2", selecao29.getGrupo()); 
       Confronto confronto44 = new Confronto("24/11", "13h00", "Estádio 974", selecao29.getNome(), selecao30.getNome(), "3x1", selecao29.getGrupo()); 
       Confronto confronto45 = new Confronto("28/11", "10h00", "Estádio Cidade da Educação", selecao32.getNome(), selecao30.getNome(), "2x0", selecao29.getGrupo());
       Confronto confronto46 = new Confronto("28/11", "16h00", "Estádio Nacional de Lusail", selecao29.getNome(), selecao31.getNome(), "2x0", selecao29.getGrupo()); 
       Confronto confronto47 = new Confronto("02/12", "12h00", "Estádio Cidade da Educação", selecao32.getNome(), selecao29.getNome(), "3x2", selecao29.getGrupo());
       Confronto confronto48 = new Confronto("02/12", "12h00", "Estádio Al Janoub", selecao30.getNome(), selecao31.getNome(), "3x2", selecao29.getGrupo());
      


listaConfrontos.adicionarConfronto(confronto1);
listaConfrontos.adicionarConfronto(confronto2);
listaConfrontos.adicionarConfronto(confronto3);
listaConfrontos.adicionarConfronto(confronto4);
listaConfrontos.adicionarConfronto(confronto5);
listaConfrontos.adicionarConfronto(confronto6);
listaConfrontos.adicionarConfronto(confronto7);
listaConfrontos.adicionarConfronto(confronto8);
listaConfrontos.adicionarConfronto(confronto9);
listaConfrontos.adicionarConfronto(confronto10);
listaConfrontos.adicionarConfronto(confronto11);
listaConfrontos.adicionarConfronto(confronto12);
listaConfrontos.adicionarConfronto(confronto13);
listaConfrontos.adicionarConfronto(confronto14);
listaConfrontos.adicionarConfronto(confronto15);
listaConfrontos.adicionarConfronto(confronto16);
listaConfrontos.adicionarConfronto(confronto17);
listaConfrontos.adicionarConfronto(confronto18);
listaConfrontos.adicionarConfronto(confronto19);
listaConfrontos.adicionarConfronto(confronto20);
listaConfrontos.adicionarConfronto(confronto21);
listaConfrontos.adicionarConfronto(confronto22);
listaConfrontos.adicionarConfronto(confronto23);
listaConfrontos.adicionarConfronto(confronto24);
listaConfrontos.adicionarConfronto(confronto25);
listaConfrontos.adicionarConfronto(confronto26);
listaConfrontos.adicionarConfronto(confronto27);
listaConfrontos.adicionarConfronto(confronto28);
listaConfrontos.adicionarConfronto(confronto29);
listaConfrontos.adicionarConfronto(confronto30);
listaConfrontos.adicionarConfronto(confronto31);
listaConfrontos.adicionarConfronto(confronto32);
listaConfrontos.adicionarConfronto(confronto33);
listaConfrontos.adicionarConfronto(confronto34);
listaConfrontos.adicionarConfronto(confronto35);
listaConfrontos.adicionarConfronto(confronto36);
listaConfrontos.adicionarConfronto(confronto37);
listaConfrontos.adicionarConfronto(confronto38);
listaConfrontos.adicionarConfronto(confronto39);
listaConfrontos.adicionarConfronto(confronto40);
listaConfrontos.adicionarConfronto(confronto41);
listaConfrontos.adicionarConfronto(confronto42);
listaConfrontos.adicionarConfronto(confronto43);
listaConfrontos.adicionarConfronto(confronto44);
listaConfrontos.adicionarConfronto(confronto45);
listaConfrontos.adicionarConfronto(confronto46);
listaConfrontos.adicionarConfronto(confronto47);
listaConfrontos.adicionarConfronto(confronto48);

          Scanner ler = new Scanner(System.in);

          
           System.out.println("\n\n1 - Mostrar o calendário de jogos completo \n" +
                           "2 - Mostrar o calendário de jogos de uma seleção\n" +
                           "3 - Mostrar os jogos de um grupo com os resultados\n" +
                           "4 - Informar o resultado de um jogo\n"+
                           "5 - Sair.\n");
          
          System.out.println("\n______Digite sua opção: ______\n");
          int option = ler.nextInt();
        

        while(option != 5)
        { 
        switch (option) {
            case 1:
                listaConfrontos.exibirCalendario(listaConfrontos);
                break;
            case 2:
                Scanner in = new Scanner(System.in);
                System.out.println("Digite o nome da seleção (ex: Argentina, Brasil, Costa Rica...)");
                String selecao = in.nextLine();
                selecao = StringUtils.capitalize(selecao);
                if(listaConfrontos.encontrarConfronto(selecao, listaConfrontos) == 0)
                {
                    System.out.printf("Seleção '%s' não foi encontrada", selecao);
                }
                
                ;
                break;
            case 3:       
                   Scanner entr = new Scanner(System.in);
                System.out.println("Digite o grupo desejado (ex: A, B...)");
                char letra = entr.nextLine().charAt(0);
                char grupo =  Character.toUpperCase(letra);
                
                while(grupo>'H')
                {
                   System.out.println("Esse grupo não existe!");
                   System.out.println("Digite o grupo desejado (ex: A, B...)");
                   letra = entr.nextLine().charAt(0);    
                   grupo =  Character.toUpperCase(letra);
                }    
                   listaConfrontos.exibirCalendarioGrupo(listaConfrontos, grupo);       
                break;
                
            case 4:
                Scanner ent = new Scanner(System.in);
                
                System.out.println("Digite o nome da primeira seleção (ex: Argentina, Brasil, Costa Rica...)");
                time1 = ent.nextLine();
                time1 = StringUtils.capitalize(time1);
                System.out.println("Digite o nome da segunda seleção (ex: Argentina, Brasil, Costa Rica...)");
                time2 = ent.nextLine();
                time2 = StringUtils.capitalize(time2);
               
                if(listaConfrontos.exibirResultado(time1, time2, listaConfrontos) == 0)
                {
                    System.out.println("\n\n****Os dados inseridos não correspodem a um jogo existente****");
                }
                    ;
               break;
                
            default:   System.out.println("Digite uma opção válida!");
                break;
        }
            System.out.println("\n\n1 - Mostrar o calendário de jogos completo \n" +
                           "2 - Mostrar o calendário de jogos de uma seleção\n" +
                           "3 - Mostrar os jogos de um grupo com os resultados\n" +
                           "4 - Informar o resultado de um jogo\n"+
                           "5 - Sair.\n\n");
            
          System.out.println("\n______Digite sua opção: ______\n");
          option = ler.nextInt();
            
     }
    
   }
    
}