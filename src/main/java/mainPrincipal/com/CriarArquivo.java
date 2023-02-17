package mainPrincipal.com;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class CriarArquivo {
	private boolean status = false;
	public int escolha;
	private Scanner lert;
	private FileReader stream;
	CriarArquivo(){
		
	}
	
	
	public void excluirArquivo() {
        Scanner lert = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo que deseja deletar (exemplo: NovoArquivo.txt):");
		String nome = lert.next();
		Path path= Paths.get(nome);
    try {
        Files.delete(path);
        System.out.println("arquivo deletado com sucesso!!!!!!");
    }
    catch (IOException e) {
        e.printStackTrace();
        System.out.println("arquivo não encontrado");
     }		
	}
	
	public void novoArquivo(){
		lert = new Scanner(System.in);
		
		System.out.println("Digite o caminho/nome que deseja para novo arquivo e o tipo dele (exemplo: C:/testeCriaçãO/PRIMEIRO/NovoArquivo.txt):");
		String nome = lert.next();
	
/***************************************************/
	if (status == false) {
		try {
			stream = new FileReader(nome);	
			System.out.println("ja existe arquivo com esse nome");
			System.out.println("escolha uma das opcao a baixo:\n"
					+ "1. Voltar ao Menu \n"
					+ "2. sair do sistema");
			
		} catch (Exception e) {
			status = true;
		}
		
	if(status == true) {
		try {
			File arquivo = new File(nome);	
			if (arquivo.createNewFile()) {
		System.out.println("O arquivo *"+ nome + "* foi criado com sucesso!!!");
			}
		} catch (Exception e) {
			System.out.println("erro na criação do arquivo");
		}
		
	 }
	}
 }
}//class
