package Eletrodomesticos;

import java.util.Scanner;

public class Eletrodomestico {
	
	protected String marca, modelo;
	protected int volume;
	protected double preco;
	
	public Porta porta1 = new Porta();
	
	public String getMarca() {
	
	return marca;
	
	}
	
	public void setMarca(String marca) {
	
	this.marca = verificarTexto(marca);
	
	}
	
	public String getModelo() {
	
	return modelo;
	
	}
	
	public void setModelo(String modelo) {
	this.modelo = verificarTexto(modelo);
	
	}
	
	public int getVolume() {
	return volume;
	
	}
	
	public void setVolume(int volume) {
	this.volume = verificarVolume(volume);
	
	}
	
	public double getPreco() {
	
	return preco;
	
	}
	
	public void setPreco(double preco) {
	
	this.preco = verificarPreco(preco);
	
	}
	
	public Porta getPorta1() {
	return porta1;
	
	}
	
	
	
	public void setPorta1(Porta p1) {
	
	porta1 = p1;
	
	}
	
	// métodos privados
	
	private String verificarTexto(String texto) {
	
	if (!texto.isEmpty()) {
	
	return texto;
	} else {
	
	return "";
	
	}
	
	}
	
	private double verificarPreco(double pe) {
	
	if (pe>0) {
	
	return pe;
	
	} else {
	
	return 0.0;
	
	}
	
	}
	
	private int verificarVolume(int vol) {
	
	if (vol>0) {
	
	return vol;
	
	} else {
	
	return 0;
	
	}
	
	}
	
	// como não há Superclasse, não existe reaproveitamento de métodos construtores
	
	public Eletrodomestico( ) { }
	
	public Eletrodomestico( String marca ) {
	
	setMarca( marca );
	
	}
	
	public Eletrodomestico( String marca, String modelo ) {
	
	setMarca( marca );
	
	setModelo( modelo );
	
	}
	
	public Eletrodomestico( String marca, String modelo, int volume ) {
	
	setMarca( marca );
	
	setModelo( modelo );
	
	setVolume( volume );
	
	}
	
	public Eletrodomestico( String marca, String modelo, int volume, double preco ) {
	
	setMarca( marca );
	
	setModelo( modelo );
	
	setVolume( volume );
	
	setPreco( preco );
	
	}
	
	public Eletrodomestico( String marca, String modelo, int volume, double preco,
	
	Porta p1 ) {
	
	setMarca( marca );
	
	setModelo( modelo );
	
	setVolume( volume );
	
	setPreco( preco );
	
	setPorta1(p1);
	
	}
	
	// métodos que poderão ser reaproveitados na herança
	
	public void imprimir() {
	
	System.out.println("***** Eletrodoméstico *****");
	
	System.out.println("Marca :" + getMarca());
	
	System.out.println("Modelo :" + getModelo());
	
	System.out.println("Volume :" + getVolume());
	
	System.out.println("Preço :" + getPreco());
	
	porta1.imprimir();
	
	}
	
	public void cadastrar( String marca, String modelo, int volume, double preco,
	
	Porta p1 ) {
	
	setMarca( marca );
	
	setModelo( modelo );
	
	setVolume( volume );
	
	setPreco( preco );
	
	setPorta1(p1);
	
	}
	
	public void entrada() {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("***** Eletrodoméstico *****");
	
	System.out.println("Marca :");
	
	setMarca(entrada.nextLine());
	
	System.out.println("Modelo :");
	
	setModelo(entrada.nextLine());
	
	System.out.println("Volume :");
	
	setVolume(Integer.parseInt(entrada.nextLine()));
	
	System.out.println("Preço :");
	
	setPreco(Double.parseDouble(entrada.nextLine()));
	
	porta1.entrada();
	
	}

}