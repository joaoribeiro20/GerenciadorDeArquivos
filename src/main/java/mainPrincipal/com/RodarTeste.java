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
		/*-----------------------------------------------------------*/
		System.out.println("");
		System.out.println(" --------  Voce estar no gerenciador de arquivos!! -------- \n"
					+ " -------------------   Bem Vindo!!  -----------------------" + "\n");
		exibir.menu();
		
		/*------------------------------------------------------------------*/
		int loop = 111;
		
        
		try {
		while(loop > 0) {
/*************************************************/
			switch (exibir.usua) {
			case 1:
				op1.novoArquivo();
				
				if(op1.entrada == 1) {
				exibir.menu();
				}
				
				if (op1.entrada == 2) {
					loop = 0;
					System.out.println("SISTEMA FECHADO!!!");
				}
				
				if(op1.entrada == 3) {
					exibir.usua = 1;
					exibir.loading();
				} 
				
				break;
/*****************************************************************/
			case 2:
				op2.escreverNoArquivo();
				
				if(op2.entrada == 1) {
					exibir.loading();
					exibir.menu();
					}
				
				if (op2.entrada == 2) {
					
					exibir.loading();
					loop = 0;
					System.out.println("SISTEMA FECHADO!!!");
				}
								
				if(op2.entrada == 3) {
					exibir.usua = 2;
					exibir.loading();
				} 
				break;
			case 3:
				op2.lerArquivo();
				
				if(op2.entradaler == 1) {
					exibir.loading();
					exibir.menu();
				}
				
				if(op2.entradaler == 2) {
					loop = 0;
					exibir.loading();
					System.out.println("SISTEMA FECHADO!!!");
				}
				
				if(op2.entradaler == 3) {
					exibir.usua = 3;
					exibir.loading();
				}
				break;
			case 4:
				op3.dadosArquivo();
				if(op3.entrada == 1) {
					exibir.loading();
					exibir.menu();
					}
				
				if (op3.entrada == 2) {
					
					exibir.loading();
					loop = 0;
					System.out.println("SISTEMA FECHADO!!!");
				}
								
				if(op3.entrada == 3) {
					exibir.usua = 2;
					exibir.loading();
				} 
				break;
			case 5:
				op1.excluirArquivo();
				break;
			case 6:
				loop = 0;
				System.out.println("SISTEMA FECHADO!!!");
				break;
			}
		}
		} catch (Exception e) {
			System.out.println("erro ao inicializar loop ");
		}
		
		}

}	
		
		
		
		
		
		
		
		
		/*op1.novoArquivo();
		op2.escreverNoArquivo();
		op2.lerArquivo();
		
		op1.excluirArquivo();*/
		
	
		

