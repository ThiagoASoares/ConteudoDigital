package Eletrodomesticos;

import java.util.Scanner;

public class Geladeira extends Eletrodomestico{


	
	private double peso;
			
	public Porta porta2 = new Porta();
	
	public double getPeso() {
	
	return peso;
	}
	
	public void setPeso( double pe ) {
	peso = verificarPeso(pe);
	
	}
	
	public Porta getPorta2() {
	
	return porta2;
	
	}
	
	
	
	public void setPorta2( Porta p2 ) {
	
	porta2 = p2;
	
	}
	
	
	
	private double verificarPeso (double pe) {
	
	if(pe>0) {
	
	return pe;
	
	}
	
	else {
	
	return 0.0;
	
	}
	
	}
	
	
	
	public Geladeira() {
	
	super();
	
	}
	
	public Geladeira( double peso ) {
	super();
	
	setPeso(peso);
	
	}
	
	public Geladeira( String marca, String modelo ) {
	
	super(marca, modelo);
	
	}
	
	public Geladeira( String marca, String modelo, int volume, double preco ) {
	
	super(marca, modelo, volume, preco);
	
	}
	
	public Geladeira( String marca, String modelo, int volume, double preco,
	
	double peso ) {
	
	super(marca, modelo, volume, preco);
	
	setPeso(peso);
	
	}
	
	public Geladeira( String marca, String modelo, int volume, double preco,
	
	double peso, Porta porta1, Porta porta2 ) {
	
	super(marca, modelo, volume, preco);
	
	setPeso(peso);
	
	setPorta1( porta1 );// Superclasse Eletrodomestico
	
	setPorta2( porta2 );
	
	}
	
		
	public void imprimir() {
	
	System.out.println("***** Geladeira *****");
	
	super.imprimir();
	
	porta2.imprimir();
	
	System.out.println("Peso :" + getPeso());
	
	}
	
	public void cadastrar ( String marca, String modelo, int volume, double preco,
	double peso, Porta p1, Porta p2 ) {
	
	super.cadastrar(marca, modelo, volume, preco, p1);
	
	setPeso(peso);
	
	porta2.cadastrar(p2.getComprimento(), p2.getLargura(), p2.getVidro());
	
	}
	
	public void entrada() {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("***** Geladeira *****");
	
	super.entrada();
	
	porta2.entrada();
	
	System.out.println("Peso :");
	
	setPeso(Double.parseDouble(entrada.nextLine()));
	
	}
	
}
