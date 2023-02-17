package mainPrincipal.com;
import java.io.*;
import java.util.Scanner;

public class PesquisarArquivosDados {

	private Scanner lert;

	public void dadosArquivo() {
		
		lert = new Scanner(System.in);
		System.out.println("digite o nome do arquivo");
		/******************************************/
		String nome = lert.next();
     	File arquivo = new File(nome);		
		/***************************************/
		if (arquivo.exists()) {
			System.out.println("O arquivo existe!"+
		"Pode ser lido: " + arquivo.canRead() +
		"Pode ser gravado: " + arquivo.canWrite() +""
				+ "Tamanho: " + arquivo.length() +
					"Caminho: " + arquivo.getPath());
		} else {
			System.out.println("arquivo nao existe");	
		}
	}
}

