package mainPrincipal.br;
import java.util.Scanner;

public class view {
	public int usua;
	Scanner lert = new Scanner(System.in);
	view(){
		
	}

	public void quadradro() {
		for(int i = 0; i <= 28; i++) {
		System.out.print("* ");
		}
		for(int j = 0; j <= 10; j++) {
			System.out.println("*                                                         *");
			}
		for(int i = 0; i <= 29; i++) {
			System.out.print("* ");
			}
		
		
		}
	public void loading() {
		
		System.out.println("             *************************\r\n"
				+ "            ***************************\r\n"
				+ "       **************************************\r\n"
				+ "         **************    ****************\r\n"
				+ "         ************       ***************\r\n"
				+ "         ************       ***************\r\n"
				+ "          ****   **** loading ****    ****\r\n"
				+ "         ************       ***************\r\n"
				+ "         *************     ****************\r\n"
				+ "         **************   *****************\r\n"
				+ "       **************************************\r\n"
				+ "            ***************************\r\n"
				+ "             *************************");
		
		
		
		
		
		
	}
    public void menu() {
    	Scanner lert = new Scanner(System.in);
    	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \r\n"
    			+ "*     --  Escolha um dos numeros a baixo e digite no terminal o numero escolhido --         *\r\n"
    			+ "*            -- cada numero representa uma função dispinivel no sistema --                  *\r\n"
    			+ "*                                                                                           *\r\n"
    			+ "* 1. Criar novo arquivo.                                                                    *\r\n"
    			+ "* 2. criar um novo diretorio.                                                               *\r\n"
    			+ "* 3. renomear diretorios ou arquivos.                                                       *\r\n"
    			+ "* 4. visualizar informaçoes tecnicas sobre o arquivo.                                       *\r\n"
    			+ "* 5. Visualizar informaçao do corpo do arquivo.                                             *\r\n"
    			+ "* 6. Abrir arquivo no modo Escrita.                                                         *\r\n"
    			+ "* 7. Excluir arquivo ou diretorio.                                                          *\r\n"
    			+ "* 6. ...............................                                                        *\r\n"
    			+ "* 8. ...............................                                                        *\r\n"
    			+ "* 9. Fechar sistema.                                                                        *\r\n"
    			+ "*                                                                                           *\r\n"
    			+ "*                                                                                           *\r\n"
    			+ "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    	 usua = lert.nextInt();
    }	
	public void escolhas() {
	}
	
}


