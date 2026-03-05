package modelo;

import java.util.Scanner;

public class Telefone {
	
	String codigoArea;
	String numero;
	
	public Telefone (String codigoArea, String numero) {
		super();
		this.codigoArea = codigoArea;
		this.numero = numero;
	}
	
	
	
	
	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea.trim();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero.trim();
	}

	public Telefone() { // Construtor Default
		codigoArea = "63";
	}
	
	public Telefone LerTelefone() {
		Scanner scan = new Scanner(System.in);
		
		Telefone telefone = new Telefone();
		
		telefone = new Telefone();
		System.out.println("digite o DDD:");
		telefone.codigoArea = scan.next();
		
		System.out.println("digite o Telefone:");
		telefone.numero = scan.next();
		
		return telefone;

	}



}
