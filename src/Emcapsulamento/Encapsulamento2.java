package Emcapsulamento;

import java.util.Scanner;

public class Encapsulamento2 {

public static void main(String[] args) {

// FIZ O ENCAPSSULAMENTO DA FORMA QUE ACHEI CORRETO;

Scanner entrada = new Scanner(System.in);

double preco = 0, valorPagar = 0;
int faixa;

System.out.println("Digite o preco: ");

preco = Double.parseDouble(entrada.nextLine());

System.out.println("Digite a faixa de tributação: ");
faixa = Integer.parseInt(entrada.nextLine());

Tributos tributo = new Tributos();

valorPagar = tributo.calcularImposto(preco, faixa);
System.out.println("Valor a pagar " + valorPagar);

	}
}
