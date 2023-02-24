package mainPrincipal.com;
import java.io.*;
import java.util.Scanner;

public class PesquisarArquivosDados {

	private Scanner lert;
	boolean status = false;
	int entrada;

	public void dadosArquivo() {
		
		lert = new Scanner(System.in);
		System.out.println("digite o nome do arquivo");
		/******************************************/
		String nome = lert.next();
     	File arquivo = new File(nome);		
		/***************************************/
		if (arquivo.exists()) {
			System.out.println("O arquivo existe!\n"
				+ "Tamanho ----- " + arquivo.length() + "\n"+
					"Caminho ----- " + arquivo.getPath()+ "\n");
		} else {
			System.out.println("arquivo nao existe");	
		}
		  System.out.println("todos dados existente foram exibidos\n");
	      System.out.println("Escolha uma das opçoes a baixo para continuar\n"
	      		+ "1. Voltar ao menu\n"
	      		+ "2. sai do sistema\n"
	      		+ "3. pesquisar dados de outro arquivo");
	      int entrada = lert.nextInt();
	      boolean status = false;
		
	}
}

