package mainPrincipal.com;

import java.io.*;
import java.util.Scanner;


public class LerEescrever {
	LerEescrever(){}
	
	
	Scanner lert = new Scanner(System.in);
	
	
	
	public void lerArquivo() {
	  try {
		System.out.println("Digite o caminho do arquido que deseja abrir para realizar a leitura");
		String nome = lert.next();
		FileReader stream = new FileReader(nome);	
		BufferedReader reader = new BufferedReader(stream);
	    //Lê uma linha do arquivo
	    String linha = reader.readLine();
	    while (linha != null){
	      System.out.println(linha);
	      //Lê a próxima linha do arquivo
	      linha = reader.readLine();
	      reader.close();
	      //Fecha o arquivo
	      stream.close();
	 }
	  }
	  catch (IOException e) {// 
		    e.printStackTrace();
		    System.out.println("arquivo não existe");
		  }
	}
	public void escreverNoArquivo() {
		try {

		System.out.println("Digite o caminho do arquido que deseja abrir para realizar a escrita");
		String nome = lert.next();
		FileWriter stream = new FileWriter(nome);
		PrintWriter print = new PrintWriter(stream);
	    System.out.println("arquivo aberto com sucesso!!");
	    System.out.println("Escreva a baixo no arquivo");
	    String txt = lert.next();
	    //Escreve no arquivo
	    print.print(txt);
	    print.close();
	    stream.close();
	  
		}catch (IOException e) {// 
		    e.printStackTrace();
		    System.out.println("arquiv não existe");
		  }
	}
}

