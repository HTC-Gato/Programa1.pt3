package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Professor {
	
	private String nome;
	private String cpf;
	private String matricula;
	private Telefone telefone;
	private static DateTimeFormatter dateTimeFrometter;


 public static void main(String[] args) { 
	 LocalDate data = LocalDate.now();
	 
	 System.out.println(data);
	 String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	 System.out.println(data);
 }


 public String getNome() {
	return nome;
 }


 public void setNome(String nome) {
	this.nome = nome;
 }


 public String getCpf() {
	return cpf;
 }


 public void setCpf(String cpf) {
	this.cpf = cpf;
 }


 public String getMatricula() {
	return matricula;
 }


 public void setMatricula(String matricula) {
	this.matricula = matricula;
 }


 public Telefone getTelefone() {
	return telefone;
 }


 public void setTelefone(Telefone telefone) {
	this.telefone = telefone;
 }
}