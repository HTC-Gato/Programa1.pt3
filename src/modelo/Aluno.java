package modelo;

import java.util.Scanner;

public class Aluno {
	public String nome;
	public Integer idade;
	public String matricula;
	
public Telefone telefone;

public Aluno LerAluno() {
	Scanner scan = new Scanner(System.in);
	
	Aluno aluno = new Aluno();	
	System.out.println("digite o nome:");
	aluno.nome = scan.next();
	
	System.out.println("digite a idade:");
	aluno.idade = scan.nextInt();
	
	System.out.println("Informe o código de matrícula:");
	aluno.matricula = scan.next();
	
	aluno.telefone = new Telefone();
	System.out.println("digite o DDD:");
	aluno.telefone.codigoArea = scan.next();
	
	System.out.println("digite o Telefone:");
	aluno.telefone.numero = scan.next();
	
	
	
	return aluno;
	
	
}
}
