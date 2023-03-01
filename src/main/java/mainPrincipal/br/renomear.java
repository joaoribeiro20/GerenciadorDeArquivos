package mainPrincipal.br;

import java.io.File;
import java.util.Scanner;

public class renomear {
	int op = 0;
	 
	int nomeArquivoOK;
	int nomeArquivoON;
	
	int nomeDiretorioOK;
	int nomeDiretorioON;
	Scanner lert = new Scanner(System.in);
	renomear(){}
	
	public void ad() {
		System.out.println("////////////////////////////////////////////\n"
				         + "/          O que deseja renomar ?          /\n"
				         + "/              - 1. arquivo                 /\n"
				         + "/              - 2. diretorio               /\n"
				         + "/////////////////////////////////////////////");
		 op = lert.nextInt();
	}
	public void renomerArquivo() {
		System.out.println("digite o nome do arquivo QUE DESEJA RENOMEAR");
		String nomeArquivo = lert.next();
		File arquivo = new File(nomeArquivo);
		
		
		if(arquivo.isFile() && arquivo.exists()) {
			System.out.println("digite o novo nome desse Arquivo");
			String novoNomeArquivo = lert.next();
			//File nomeNovo = new File(novoNomeDiretorio);
			arquivo.renameTo(new File(novoNomeArquivo));
			System.out.println("-----------------------------------------------------------------------------------------------------\n"
	                 + "*               -- -- Arquivo renomeado com sucesso!  -- --                                               *\n"       
	                 + "*      -- escolha um das opçoes a baixo para continuar a navegar --                                         *\n"
                    + "*                     - 1. Voltar ao Menu de Opcoes                                                         *\n"
                    + "*                     - 2. Renomear outro Arquivo                                                         *\n"
                    + "*                     - 3. Sai do sistema                                                                   *\n"
                    + "-------------------------------------------------------------------------------------------------------------\n"
                    + "");
			nomeArquivoOK = lert.nextInt();
			
			
		}else
		{
			System.out.println(
				    "----------------------------------------------------------------------------------------------------\n"
		          + "*                 -- -- Arquivo não existe ou não é um Arquivo!  -- --                         *\n"
		          + "*      -- escolha um das opçoes a baixo para continuar a navegar --                                *\n"
                 + "*                     - 1. Voltar ao Menu de Opcoes                                                *\n"
                 + "*                     - 2. Criar um Arquivo                                                      *\n"
                 + "*                     - 3. Sai do sistema                                                          *\n"
                 + "----------------------------------------------------------------------------------------------------\n"
                 + " \n");
			nomeArquivoON = lert.nextInt();
		}
		
	}
	public void renomerDiretorio() {
		System.out.println("digite o nome do Diretorio QUE DESEJA RENOMEAR");
		String nomeDiretorio = lert.next();
		File diretorio = new File(nomeDiretorio);
		
		
		if(diretorio.isDirectory() && diretorio.exists()) {
			System.out.println("digite o novo nome desse Diretorio");
			String novoNomeDiretorio = lert.next();
			//File nomeNovo = new File(novoNomeDiretorio);
			diretorio.renameTo(new File(novoNomeDiretorio));
			System.out.println("-----------------------------------------------------------------------------------------------------\n"
	                 + "*               -- -- Diretório renomeado com sucesso!  -- --                                               *\n"       
	                 + "*      -- escolha um das opçoes a baixo para continuar a navegar --                                         *\n"
                     + "*                     - 1. Voltar ao Menu de Opcoes                                                         *\n"
                     + "*                     - 2. Renomear outro diretorio                                                         *\n"
                     + "*                     - 3. Sai do sistema                                                                   *\n"
                     + "-------------------------------------------------------------------------------------------------------------\n"
                     + "");
			nomeDiretorioOK = lert.nextInt();
			
		}else
		{
			System.out.println(
				    "----------------------------------------------------------------------------------------------------\n"
 		          + "*                 -- -- Diretório não existe ou não é um diretorio!  -- --                         *\n"
 		          + "*      -- escolha um das opçoes a baixo para continuar a navegar --                                *\n"
                  + "*                     - 1. Voltar ao Menu de Opcoes                                                *\n"
                  + "*                     - 2. Criar um Diretorio                                                      *\n"
                  + "*                     - 3. Sai do sistema                                                          *\n"
                  + "----------------------------------------------------------------------------------------------------\n"
                  + " \n");
			nomeDiretorioON = lert.nextInt();
		}
		
		
	}
	
}
