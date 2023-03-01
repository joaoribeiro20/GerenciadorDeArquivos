package mainPrincipal.br;
import java.io.*;
import java.util.Scanner;

public class criar {
	
	int criarArquivoNO;
	int criarArquivoOK;
	
	int criarDiretorioNO;
	int criarDiretorioOK;
	
	String nomeArquivo;
    String nomeDiretorio;
	Scanner lert = new Scanner(System.in);
	criar(){}
	
	public void criarArquivo() 
	{
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * *\n"
				          +"*  Digite o nome do arquivo que deseja Criar      *\n"
				          +"* * * * * * * * * * * * * * * * * * * * * * * * * *");
		nomeArquivo = lert.next();
		 try {
			File arquivo = new File(nomeArquivo);
			 if (arquivo.exists()) {
				 System.out.println(
						    "----------------------------------------------------------------------------------------------------\n"
		 		          + "*                 -- -- Ja Existe arquivo com esse nome -- --                                      *\n"
		 		          + "*      -- escolha um das opçoes a baixo para continuar a navegar --                                *\n"
		                  + "*                     - 1. Voltar ao Menu de Opcoes                                                *\n"
		                  + "*                     - 2. Renomear arquivo ja existente                                           *\n"
		                  + "*                     - 3. Sai do sistema                                                          *\n"
		                  + "----------------------------------------------------------------------------------------------------\n"
		                  + " \n");
				 criarArquivoNO = lert.nextInt();
			 }else {arquivo.createNewFile();
				
				 System.out.println("-------------------------------------------------------------------------------------------------------------\n"
				 		          + "*                -- -- Arquivo criado com sucesso!!  -- --                                                  *\n"
                                  + "*   Tamanho do arquivo ----> "+ arquivo.lastModified()+""     
                                  + " ||| Caminho do arquivo ----> "+arquivo.getAbsolutePath()+"\n" 
				 		          + "*      -- escolha um das opçoes a baixo para continuar a navegar --                                         *\n"
		 		                  + "*                     - 1. Voltar ao Menu de Opcoes                                                         *\n"
		 		                  + "*                     - 2. Criar novo arquivo                                                               *\n"
		 		                  + "*                     - 3. Sai do sistema                                                                   *\n"
		 		                  + "-------------------------------------------------------------------------------------------------------------\n"
		 		                  + "");
		 criarArquivoOK = lert.nextInt();
			 }
			 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("  -- -- erro na criaçãod o arquivo  -- -- ");
		}
}//criarArquivo()
	public void criarDiretorio() 
	{
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * *\n"
		                  +"*  Digite o nome do Diretorio que deseja criar    *\n"
		                  +"* * * * * * * * * * * * * * * * * * * * * * * * * *");
        nomeDiretorio = lert.next();
		try {
			File diretorio = new File(nomeDiretorio);
			
			
			if (diretorio.exists()){ 
				
				System.out.println(
					    "----------------------------------------------------------------------------------------------------\n"
	 		          + "*                 -- -- Diretório ja existe ou Arquivo com esse nome!  -- --                       *\n"
	 		          + "*      -- escolha um das opçoes a baixo para continuar a navegar --                                *\n"
	                  + "*                     - 1. Voltar ao Menu de Opcoes                                                *\n"
	                  + "*                     - 2. Renomear Diretorio ja existente                                         *\n"
	                  + "*                     - 3. Sai do sistema                                                          *\n"
	                  + "----------------------------------------------------------------------------------------------------\n"
	                  + " \n");
				criarDiretorioNO = lert.nextInt();
			
		}else      {diretorio.mkdir();
					System.out.println("-------------------------------------------------------------------------------------------------------------\n"
			 		                 + "*               -- -- Diretório criado!  -- --                                                              *\n"
                                     + "*   Tamanho do diretorio ----> "+diretorio.length()+""     
                                     + " ||| Caminho do diretorio ----> "+diretorio.getPath()+"\n" 
			 		                 + "*      -- escolha um das opçoes a baixo para continuar a navegar --                                         *\n"
	 		                         + "*                     - 1. Voltar ao Menu de Opcoes                                                         *\n"
	 		                         + "*                     - 2. Criar novo diretorio                                                             *\n"
	 		                         + "*                     - 3. Sai do sistema                                                                   *\n"
	 		                         + "-------------------------------------------------------------------------------------------------------------\n"
	 		                         + "");
					criarDiretorioOK = lert.nextInt();	
			
			}
		} catch (Exception e) {
			System.out.println("      -- -- erro ao criar diretorio  -- -- ");
		}
	}//criarDiretorio()

}//criar
