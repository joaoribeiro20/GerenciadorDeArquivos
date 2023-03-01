package mainPrincipal.br;

public class rodarTeste {
	public static void main(String[] args) {
		// Declaraçoes de variaveis 
		int loop = 1;
		//criação de objetos
		criar Criar = new criar();
		view View = new view();
		renomear nomeNovo = new renomear();
		PesquisarArquivosDados dadosArquivo = new PesquisarArquivosDados();
		//View
		System.out.println("                      --------- Gerenciador de arquivos --------- \n"
				          +"                              ----- BEM VINDO!!! ----\n"
				          + "\n");
		View.menu();
		//loop principal da execulção do projeto
		try {
		while(loop >= 1) {
			switch (View.usua) {
			case 1:
				Criar.criarArquivo();
				if(Criar.criarArquivoOK == 1 || Criar.criarArquivoNO == 1) {//VOLTAR AO MENU
				View.menu();
				
				}
				else if (Criar.criarArquivoOK == 3 || Criar.criarArquivoNO == 3){//SAI DO SISTEMA
					loop = 0;
				}
				if(Criar.criarArquivoOK == 2){//CRIAR NOVO ARQUIVO
					View.usua = 1;
				}
				if(Criar.criarArquivoNO == 2) {	//RENOMEAR ARQUIVO			
					View.usua = 3;	
				}
				break;	
			case 2:
				Criar.criarDiretorio();
				if(Criar.criarDiretorioOK == 1 || Criar.criarDiretorioNO == 1) {//MENU
					View.menu();	
					}
					else if (Criar.criarDiretorioOK == 3 || Criar.criarDiretorioNO == 3){//SAI SISTEMA
						loop = 0;
					}
					if(Criar.criarDiretorioOK == 2){//CRIAR NOVO DIRETORIO
						View.usua = 2;
					}
					if(Criar.criarDiretorioNO == 2) {//RENOMEAR DIRETORIO
						View.usua = 3;
					}
				break;
			case 3:
				
				nomeNovo.ad();//ESCOLHA ENTRE ARQUIVO OU DIRETORIO
				if(nomeNovo.op == 1) {
				nomeNovo.renomerArquivo();
				if(nomeNovo.nomeArquivoOK == 1 || nomeNovo.nomeArquivoON == 1) {//MENU
					View.menu();	
					}
					else if (nomeNovo.nomeArquivoOK == 3 || nomeNovo.nomeArquivoON == 3){//SAI DO SISTEMA
						loop = 0;
					}
					if(nomeNovo.nomeArquivoOK == 2){//RENOMAR OUTRO ARQUIVO
						View.usua = 3;
						nomeNovo.op = 1;
					}
					if(nomeNovo.nomeArquivoON == 2) {//CRIAR UM ARQUIVO
						View.usua = 1;
					}
				
				}else 
				{
				nomeNovo.renomerDiretorio();	
				if(nomeNovo.nomeDiretorioOK == 1 || nomeNovo.nomeDiretorioON == 1) {//VOLTAR AO MENU
					View.menu();	
					}
					else if (nomeNovo.nomeDiretorioOK == 3 || nomeNovo.nomeDiretorioON == 3){// SAI DO SITEMA
						loop = 0;
					}
					if(nomeNovo.nomeDiretorioOK == 2){//RENOMAR OUTRO DIRETORIO
						View.usua = 3;
						nomeNovo.op = 2;
					}
					if(nomeNovo.nomeDiretorioON == 2) {//CRIAR UM DIRETORIO
						View.usua = 2;
					}
				}
				
				break;
            case 4:
            	dadosArquivo.exibirA();
            	//dadosArquivo.dadosArquivo();
				if(dadosArquivo.pesquisar == 1) {
					
					}
				
				if (dadosArquivo.pesquisar == 2) {
					
					
					loop = 0;
					System.out.println("SISTEMA FECHADO!!!");
				}
								
				if(dadosArquivo.pesquisar == 3) {
					
				} 
				break;
            case 5:
	
	           break;
	
            case 6:
	
	          break;
           case 7:
	
	          break;
           case 8:
	
         	 break;
           case 9:
	
	       break;
	
			
			}//switch
		
		
	}//loop
		}catch (Exception e) {
			
		}//catch
	}//main

}//rodarTeste
