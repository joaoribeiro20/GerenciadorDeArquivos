package mainPrincipal.com;

public class RodarTeste {
	public static void main(String[] args) {
		CriarArquivo op1 = new CriarArquivo();
		LerEescrever op2 = new LerEescrever();
		
		op2.escreverNoArquivo();
		op2.lerArquivo();
	}

}
