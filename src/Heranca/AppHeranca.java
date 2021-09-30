package Heranca;

public class AppHeranca {

	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.hd.cadastrar("Samsung","HD502HJ/SRA", "HD Interno", 203.00,1000);
		
		System.out.println("Marca do HD deste desktop : " + desktop.hd.getMarca() + "\nModelo HD deste desktop : " + desktop.hd.getModelo()
		+ "\nCapacidade do HD deste desktop : " + desktop.hd.getCapacidade() + "\nPreço do HD deste desktop : " + desktop.hd.getPreco());

	}

}
