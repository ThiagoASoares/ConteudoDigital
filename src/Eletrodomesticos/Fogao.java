package Eletrodomesticos;

import java.util.Scanner;

public class Fogao extends Eletrodomestico {

	private String cor;
	
	public Tampa tampa = new Tampa();
	
	public String getCor() {
	
	return cor;
	
	}
	
	public void setCor(String co) {
	
	cor = verificarCor(co);
	
	}
	
	public Tampa getTampa() {
	
	return tampa;
	
	}
	
	
	
	public void setTampa(Tampa ta) {
	
	tampa = ta;
	
	}
	
	
	
	private String verificarCor (String co) {
	
	if(!co.isEmpty()) {
	
	return co;
	
	}
	
	else {
	
	return "";
	
	}
	
	}
	
	
	
	public Fogao( ) {
	
	super();
	
	}
	
	public Fogao( String marca, String modelo ) {
	
	super(marca, modelo);
	
	}
	
	public Fogao( String marca, String modelo, int volume, double preco ) {
	
	super(marca, modelo, volume, preco);
	
	}
	
	public Fogao( String marca, String modelo, int volume, double preco, String cor){
	
	super(marca, modelo, volume, preco);
	
	setCor( cor );
	
	}
	
	public Fogao( String marca, String modelo, int volume, double preco, String cor,
	
	Porta porta1, Tampa tampa ) {
	
	super(marca, modelo, volume, preco, porta1);
	
	setCor( cor );
	
	setTampa( tampa );
	
	}
	
	
	
	public void imprimir() {
	
	System.out.println("***** Fog�o *****");
	
	super.imprimir();
	
	tampa.imprimir();
	
	System.out.println("Cor :" + getCor());
	
	}
	
	public void cadastrar( String marca, String modelo, int volume, double preco,
	
	String cor, Porta p1, Tampa ta ) {
	
	super.cadastrar(marca, modelo, volume, preco, p1);
	
	setCor( cor );
	
	tampa.cadastrar( ta.getMaterial(), ta.getEspessura() );
	
	}
	
	public void entrada() {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("***** Fog�o *****");
	
	super.entrada();
	
	System.out.println("Cor :");
	
	setCor(entrada.nextLine());
	
	tampa.entrada();
	}
}