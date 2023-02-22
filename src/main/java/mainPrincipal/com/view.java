package mainPrincipal.com;
import java.util.Scanner;

public class view {
	public int usua;
	view(){}

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
		
		
		
		
		
		
		/*for(int i = 0; i <= 56; i++) {
			int j = 0;
			String mais = "*";
			while(j <= 28 ) {
				
				System.out.println("*" + mais +"");
				
				j++;
			}
		}*/
	}
    public void menu() {
    	Scanner lert = new Scanner(System.in);
    	System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * \r\n"
    			+ "*     --  Escolha uma das opçoes validas a baixo  --        *\r\n"
    			+ "*                                                           *\r\n"
    			+ "* 1. Criar novo arquivo.                                    *\r\n"
    			+ "* 2. adicionar dados ao um arquivo.                         *\r\n"
    			+ "* 3. Visualizar informaçao do corpo do arquivo.             *\r\n"
    			+ "* 4. visualizar informaçoes tecnicas sobre o arquivo.       *\r\n"
    			+ "* 5. Excluir arquivo.                                       *\r\n"
    			+ "* 6. Sai do gerenciador.                                    *\r\n"
    			+ "*                                                           *\r\n"
    			+ "*                                                           *\r\n"
    			+ "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *  ");
    	 usua = lert.nextInt();
    }
	
	
}
