package jojopose;
import java.util.Scanner;

public class cnh_exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     Scanner ler = new Scanner(System.in);
				// Variaveis do codigo
				int n, n1, n2;
				// Essa e a interface que aparecera para o usuario, para ele imputar os valores
				System.out.printf("Voce foi aprovado no exame psicotecnico? Digite 1 para sim e 0 para nao!\n");
				// Fara a leitura da String
				n = ler.nextInt();
				// Nosso if, que ira direcionar decisoes e esta determinando o valor "verdadeiro"
				if (n == 0) {
					// Essa e a interface que aparecera para o usuario
					System.out.printf("Voce nao esta apto a ter habilitacao!");
				// Comando de decisao caso o valor for falso	
				} else if (n == 1) {
					// Essa e a interface que aparecera para o usuario
					System.out.printf("Voce foi aprovado no exame de legislacao? Digite 1 para sim e 0 para nao!\n");
					// Fara a leitura das Strings
					n1 = ler.nextInt();
					
		            // Comando de decisao para determinar informacao verdadeira 
					if (n1 == 0) {
						// Essa e a interface que aparecera para o usuario
						System.out.printf("Voce nao esta apto a ter habilitacao!");
						
					// Comando de contra decisao caso o valor for false
					} else {
						// Essa e a interface que aparecera para o usuario 
						System.out.printf("Voce foi aprovado no exame de direcao? Digite 1 para sim e 0 para nao!\n");
						// Fara a leitura das Strings
						n2 = ler.nextInt();
						
						// Comando de decisao que determina o valor verdadeiro
						if (n2 == 0) {
							// Essa e a interface que aparecera para o usuario
							System.out.printf("Voce nas esta apto a ter habilitacao!");
							
						// Comando de contra decisao caso valor for falso
						} else {
							//Essa e a interface que aparecera para o usuario
							System.out.println("Parabens! Voce pode tirar sua habilitacao!");
						}
					}
				}

			
		

	}

}
