	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Scanner;

	public class Pincipal {

	    public static void main(String[] args) throws FileNotFoundException, IOException {

	        Scanner scanner = new Scanner(System.in);

	        int ops = 0;

	        while (ops != 5) {

	            System.out.println("---------------- Entre com umas das opcoes abaixo-------------\n");
	            System.out.println("--------------------------Corte de haste----------------------\n");
	            System.out.println("--1 implementacao recursiva de cima para baixo --------------");
	            System.out.println("-- 2 implementacao dinamica de cima para baixo com memoizacao-");
	            System.out.println("-- 3 implementacao dinamica de baixo para cima----------------\n");
	            System.out.println("----------------------Selecao de atividades-------------------\n");
	            System.out.println("-- 4 algoritmo guloso iterativo ------------------------------");
	            System.out.println("-- 5 Encerrar Programa ---------------------------------------");

	            ops = scanner.nextInt();
	            
	            
	            if(ops == 1) {
	            
	            	HasteRecursivaUpBottom.executar();
	            	  ops = 0;
	            }
	            
	            else if(ops == 2 ) {
	            	
	            	HasteDinamicaUpBottomMemorization.executar();
	            	    ops = 0;
	            }
	            
	            else if(ops == 3 ) {
	            	
	            	HasteDinamicaBottomUp.executar();
	            	ops = 0;
	            }
	            
	            else if(ops == 4 ) {
	            	
	            	AtividadeGulosoInterativo.executar();
	            		ops = 0;
	            
	            }
	            
	            else if(ops == 5 ) {
	            	
	            	System.out.println("------------MENU ENCERRADO-------------\n");
	        		ops = 0;
	            	
	            }else {
	            	
	            	System.out.println("----------VALOR INVALIDO!--------------\n");
	            		ops = 0;
	            }
	        }
	    }
	}
	
