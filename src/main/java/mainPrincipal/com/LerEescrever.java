package mainPrincipal.com;

import java.io.*;
import java.util.Scanner;


public class LerEescrever {
	LerEescrever(){}
	private boolean status = false;
	public int entradaler;
	public int entrada;
	String txt[] = new String[1000];
	Scanner lert = new Scanner(System.in);
	
	
	
	public void lerArquivo() {
	  try {
		System.out.println("Digite o caminho do arquido que deseja abrir para realizar a leitura");
		String nome = lert.next();
		
		FileReader stream = new FileReader(nome);	
		BufferedReader reader = new BufferedReader(stream);
		
	    //Lê uma linha do arquivo
		int cont = 0;
	    String linha = reader.readLine();
	    
	    
	    while (linha != null){
	    		while(cont <= 15) {
	      System.out.print(linha + " ");
	      //Lê a próxima linha do arquivo
	      linha = reader.readLine();  
	      cont++;	
	      if(linha == null){
	    		cont = 100;
	    	}    	     
	    }	
	    	System.out.println("\n");
	    	
	  } 
	    reader.close();
	      //Fecha o arquivo
	      stream.close();
	  }
	  catch (IOException e) {// 
		  status = true;
		  }
	  System.out.println("todos dados existente foram exibidos\n");
	      System.out.println("Escolha uma das opçoes a baixo para continuar\n"
	      		+ "1. Voltar ao menu\n"
	      		+ "2. sai do sistema\n"
	      		+ "3. ler outro arquivo");
	      entradaler = lert.nextInt();
	/*******************************/  
	  if(status == true) {
		  System.out.println("Arquivo nao encontrado");
		  System.out.println("Escolha uma das opçoes a baixo para continuar\n"
		      		+ "1. Voltar ao menu\n"
		      		+ "2. sai do sistema");
		  entradaler = lert.nextInt();
	  }
	  
	}
	public void escreverNoArquivo() {

		System.out.println("Digite o caminho do arquido que deseja abrir para realizar a escrita");
		String nome = lert.next();
			
			try {
				FileReader stream = new FileReader(nome);
				status = true;
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Nao existe arquivo com esse nome");
				System.out.println("escolha uma das opcao a baixo:\n"
						+ "1. Voltar ao Menu \n"
						+ "2. sair do sistema\n");
				entrada = lert.nextInt();
				status = false;
			}	
						
		if(status == true) {
		try {
		FileWriter stream = new FileWriter(nome);
		PrintWriter print = new PrintWriter(stream);
	    System.out.println("arquivo aberto com sucesso!!");
	    
	    
	    
	    System.out.println("Escreva a baixo no arquivo");
	   int linha = 1;
	    for(int i = 0; i < linha; i++) {
	    	//txt[i] = lert.next();
	    	//String ent = txt[i];
	    	String ent = lert.next();
	        print.println(ent);
	        
	       
			if(ent.equals("fechar")) {
	        	linha = 0;
	        	System.out.println("teste entrou no if");
	        }
	        linha ++;
	    }
	    
	    print.close();
	    stream.close();
	    
	  
		}catch (IOException e) {// 
		    e.printStackTrace();
		    
		  }
		System.out.println("\n conteudo salvo com sucesso!!\n");
	 
		System.out.println("escolha uma das opcao a baixo:\n"
				+ "1. Voltar ao Menu \n"
				+ "2. sair do sistema\n"
				+ "3. Adicionar mais informaçoes em um arquivo");
		entrada = lert.nextInt();
		}
	  

	}
}

