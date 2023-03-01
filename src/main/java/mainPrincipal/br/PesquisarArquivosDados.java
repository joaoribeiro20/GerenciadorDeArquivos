package mainPrincipal.br;
import java.io.*;
import java.util.Scanner;

public class PesquisarArquivosDados {

	private Scanner lert;
	
	boolean status = false;
	int pesquisar;

	public void exibirA() {
	lert = new Scanner(System.in);
	System.out.println("digite o nome do diretorio que deseja exbir os arquivos existente");
	String nome = lert.next();
 	File diretorio = new File(nome);	
 	if(diretorio.isDirectory()) {
 		String[] listArquivo = diretorio.list();
			for(int i = 0; i <= 10; i++) {
				String arquivos = listArquivo[i];
				System.out.println(arquivos);
			}
 		         //  for (String item: listArquivo) {
		         //  System.out.printf("%s\n", item);}
 	}
}

	public void dadosArquivo() {

		
		lert = new Scanner(System.in);
		System.out.println("digite o nome do arquivo");
		/******************************************/
		String nome = lert.next();
     	File arquivo = new File(nome);		
		/***************************************/
		if (arquivo.exists()) {
			System.out.println("O arquivo existe!\n"
				             + "Tamanho------------------"+ arquivo.length() + "\n"
					         + "Caminho------------------"+ arquivo.getPath()+ "\n"
							 + "caminho absuluto---------"+arquivo.getAbsolutePath()+ "\n"
							 + "horario de alteraçoa-----"+arquivo.lastModified()+ "");
		}
			else {
			System.out.println("arquivo nao existe");	
		}
		  System.out.println("todos dados existente foram exibidos\n");
	      System.out.println("Escolha uma das opçoes a baixo para continuar\n"
	      		+ "1. Voltar ao menu\n"
	      		+ "2. sai do sistema\n"
	      		+ "3. pesquisar dados de outro arquivo");
	     pesquisar = lert.nextInt();
	     
		
	}
}

