package mainPrincipal.com;
//C:\Users\joao.Ribeiro\eclipse-workspace\GerenciadorDeArquivos\testeArquivo
import java.util.*;

public class RodarTeste {
	public static void main(String[] args) {
		Scanner lert = new Scanner(System.in);
		CriarArquivo op1 = new CriarArquivo();
		LerEescrever op2 = new LerEescrever();
		PesquisarArquivosDados op3 = new PesquisarArquivosDados();
		view exibir = new view ();
		int loop = 0;
		int usua;
		
		try {
		while(loop >= 0) {
			System.out.println("");
			System.out.println(" --------  Voce estar no gerenciador de arquivos!! -------- \n"
					+ " -------------------   Bem Vindo!!  -----------------------" + "\n");
			
			exibir.quadradro();
			
			System.out.println("\n"
					+ "Escolha uma das opçoes validas a baixo\n"
					+ "1. Criar novo arquivo..... \n"
					+ "2. Entrar no modo de escrita em um arquivo existente..... \n"
					+ "3. Visualizar informaçao do corpo do arquivo.....\n"
					+ "4. visualizar informaçoes tecnicas sobre o arquivo.....\n"
					+ "5. Excluir arquivo..........\n"
					+ "6. Sai do gerenciador........"); usua = lert.nextInt();
			
			switch (usua) {
			case 1:
				exibir.loading();
				op1.novoArquivo();
				break;
			case 2:
				op2.escreverNoArquivo();
				break;
			case 3:
				op2.lerArquivo();
				break;
			case 4:
				op3.dadosArquivo();
				break;
			case 5:
				op1.excluirArquivo();
				break;
			case 6:
				loop = 0;
				break;
			default:
				break;
			}
		}
		} catch (Exception e) {
			System.out.println("erro ao inicializar loop");
		}
		
		
		
		
		
		
		
		
		
		
		/*op1.novoArquivo();
		op2.escreverNoArquivo();
		op2.lerArquivo();
		
		op1.excluirArquivo();*/
		
	
		
	}

}
