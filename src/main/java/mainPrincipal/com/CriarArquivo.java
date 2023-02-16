package mainPrincipal.com;
import java.io.*;
import java.util.Scanner;;

public class CriarArquivo {
	private boolean status = false;
	CriarArquivo(){
		
	}
	
	public void novoArquivo(){
		Scanner lert = new Scanner(System.in);
		
		System.out.println("Digite o nome que deseja para novo arquivo e´o tipo dele (exemplo: NovoArquivo.txt):");
		String nome = lert.next();
		try {
		FileReader reader = new FileReader(nome);
		}catch (IOException e) { 
			status = true;
		}
		if(status == true) {
	  try {
		    //Abre o arquivo
		    
		    FileWriter stream = new FileWriter(nome);
		    stream.close();
		    System.out.println("Arquivo *" + nome + "* criar com sucesso!!");
		  } catch (IOException e) {// 
		    e.printStackTrace();
		  }
		}else {
			System.out.println("Ja existe arquivo com esse nome, tente outro nome ou adicione uma versao ao arquivo");
		}
	}
}
