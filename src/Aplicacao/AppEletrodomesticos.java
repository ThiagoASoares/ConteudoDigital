package Aplicacao;

import Eletrodomesticos.Fogao;
import Eletrodomesticos.Geladeira;
import Eletrodomesticos.Porta;
import Eletrodomesticos.Tampa;

public class AppEletrodomesticos {
	
	public static void main(String[] args) {

		
		Geladeira gl1 = new Geladeira();

		gl1.entrada();

		gl1.imprimir();

		

		Fogao fg1 = new Fogao();

		fg1.entrada();

		fg1.imprimir();

		

		Porta paux1 = new Porta(65, 45, true);
		Porta paux2 = new Porta(25, 45, false);

		Geladeira gl2 = new Geladeira("GE", "AB123", 365, 899.00, 350, paux1, paux2);

		gl2.imprimir();

		
		Porta paux3 = new Porta(45, 50, true);
		
		Tampa taux1 = new Tampa("Vidro", 5.5);

		Fogao fg2 = new Fogao("Brastemp", "FG404", 250, 599.00, "Prata", paux3, taux1);

		fg2.imprimir();

		}

}
