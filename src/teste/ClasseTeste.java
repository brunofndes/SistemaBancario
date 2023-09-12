package teste;

import java.util.Iterator;
import java.util.Scanner;

public class ClasseTeste {

	public static void main(String[] args) {
		/*
		Pessoa p1 = new Pessoa("Bruno", 28, "Uninassau");
		Pessoa p2 = new Pessoa();
		
		System.out.println("Construtor com parametros "+"Nome = "+ p1.getNome() + " Faculdade= "  + p1.getFaculdade()+" Idade = " + p1.getIdade());
		
		p1.setNome("Gabriel");
		p1.setIdade(20);
		p1.setFaculdade("Unit");
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Construtor com paramentros novos valores "+" Nome = "+ p1.getNome() +" Faculdade= "  + p1.getFaculdade()+" Idade = " + p1.getIdade());
		
		p1.setNome("Lucas");
		p1.setIdade(40);
		p1.setFaculdade("Nada");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Valores modificados "+" Nome = "+ p1.getNome() +" Faculdade= "  + p1.getFaculdade()+" Idade = " + p1.getIdade());
		
		
		p2.setNome("Marcos");
		p2.setIdade(10);
		p2.setFaculdade("Estacio");
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Construtor sem parametros "+" Nome = "+ p2.getNome() +" Faculdade= "  + p2.getFaculdade()+" Idade = " + p2.getIdade());
		
		int[] arraydDeNumeros = {1, 2, 3, 4, 5};

		// Initialize an array separately
		String[] arrayDeString = new String[5];
		
		arrayDeString[0] = "Notebook";
		arrayDeString[1] = "Computador";
		arrayDeString[2] = "Mesa";
		arrayDeString[3] = "Tela";
		arrayDeString[4] = "Teclado";
		
		System.out.println("----------------------------------------------------------------------------");
		
		for (int i = 0; i < arraydDeNumeros.length; i++) {
			System.out.println("O valor do array é na posição "+ i +" é: " + arraydDeNumeros[i]);			
		}
		
		System.out.println("----------------------------------------------------------------------------");
		
		for (int i = 0; i < arrayDeString.length; i++) {
			System.out.println("O valor do array é na posição "+ i +" é: " + arrayDeString[i]);			
		}
		*/
		Banco b = new Banco();
		Scanner input = new Scanner(System.in);

		while(true) {
		System.out.println("==============================================");
        System.out.println("Selecione a operação:");
        System.out.println("1 - Depósito");
        System.out.println("2 - Saque");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Sair");
       
        if(input.hasNextInt()) {
        	
        int escolha = input.nextInt();
        
        
        switch (escolha) {
            case 1:
                System.out.print("Informe o valor a ser depositado: ");
                double valorDeposito = input.nextDouble();
                b.realizarDeposito(valorDeposito);
                // Chame a função de depósito aqui                ;
                break;

            case 2:
                System.out.print("Informe o valor a ser sacado: ");
                double valorSaque = input.nextDouble();
                b.realizarSaque(valorSaque);
                // Chame a função de saque aqui               
                break;
                
            case 3:
            	System.out.println("Seu saldo é de R$" + b.consultarSaldo() );            	
            	break;
            	
            case 4:
            	System.out.println("Sistema Finalizado");
            	input.close();
            	System.exit(4);
            	break;

            default:
                System.out.println("Opção inválida");
        }
        
       }else {
    	   System.out.println("Escolha inválida. Digite um número inteiro válido.");
           input.nextLine();
       }
        
	}
		
}
	
	
    
				
	
}

