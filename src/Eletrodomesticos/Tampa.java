package Eletrodomesticos;

import java.util.Scanner;

public class Tampa {

	private String material;
	
	private double espessura;
	
	public String getMaterial() {
	
	return material;
	
	}
	
	public void setMaterial( String ma ) {
	
	material = verificarMaterial(ma);
	
	}
	
	public double getEspessura() {
	
	return espessura;
	
	}
	
	public void setEspessura( double es ) {
	espessura = verificarNumeroD(es);
	
	}
	
	// m?todos privados
	
	private double verificarNumeroD( double val ) {
	
	if(val>0) {
	
	return val;
	
	}
	
	else {
	
	return 0.0;
	
	}
	
	}
	
	private String verificarMaterial( String ma ) {
	
	if(!ma.isEmpty()) {
	
	return ma;
	
	}
	
	else {
	
	return "";
	}
	
	}
	
	// como n?o h? Superclasse, n?o existe reaproveitamento de m?todos
	
	// construtores
	
	public Tampa() { }
	
	public Tampa( String material ) {
	
	setMaterial( material );
	
	}
	
	public Tampa( double espessura ) {
	
	setEspessura( espessura );
	
	}
	
	public Tampa( double espessura, String material ) {
	
	setMaterial( material );
	
	setEspessura( espessura );
	
	}
	
	public Tampa( String material, double espessura ) {
	
	setMaterial( material );
	
	setEspessura( espessura );
	
	}
	
	// m?todos que poder?o ser reaproveitados na agrega??o
	
	public void imprimir() {
	
	System.out.println("***** Tampa *****");
	
	System.out.println("Material :" + getMaterial());
	
	System.out.println("Espessaura :" + getEspessura());
	
	}
	
	public void cadastrar( String material, double espessura ) {
	
	setMaterial( material );
	
	setEspessura( espessura );
	
	}
	
	public void entrada() {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("***** Tampa *****");
	
	System.out.println("Material :");
	
	setMaterial(entrada.nextLine());
	
	System.out.println("Espessaura :");
	
	setEspessura(Double.parseDouble(entrada.nextLine()));
	
	}

}
