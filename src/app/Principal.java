package app;

import java.util.Scanner;

import modelo.Aluno;
import modelo.Telefone;

public class Principal {
	
	public static void main(String[] args) {
		
		Telefone t = new Telefone();
	
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		Aluno vetor [] = new Aluno[2];
	
	for (int i  = 0; i < vetor.length; i++) {
	Aluno aluno = new Aluno(); 	
	vetor[i] = aluno.LerAluno();
	
		}
		
		//IMPRESSÃO
		

		
		scan.close();

		for (int i = 0; i < vetor.length; i++) {
		Aluno aluno = vetor[i];
		System.out.println(aluno.nome);
	System.out.println(aluno.idade);
		System.out.println(aluno.matricula);
		System.out.println(aluno.telefone.getCodigoArea());
		System.out.println(aluno.telefone.getNumero());
		
	}

  }
}
	
		// TODO Auto-generated method stub
		
	//}
