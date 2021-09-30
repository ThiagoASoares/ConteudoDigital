package ModeloStatic;

import java.util.Scanner;

public class Exemplo1 {

public static void main(String[] args) {

// TODO Auto-generated method stub

double valorReal;

Scanner entrada = new Scanner(System.in);

Cotacao cot_1 = new Cotacao();

cot_1.entrada();

System.out.println("Digite o valor em real que deseja converter para dolar");

valorReal = Double.parseDouble(entrada.nextLine());

cot_1.imprimir();

System.out.printf("Coversão de Real para dólar : US$ %.2f",

cot_1.converterRealParaDolar(valorReal));

System.out.println();

Cotacao cot_2 = new Cotacao(4.15);

// Conversão utilizando os objetos cot_1 e cot_2 com o mesmo valor de R$ 1000,00

cot_1.imprimir();

System.out.printf("Coversão de Real para dólar : US$ %.2f",

cot_1.converterRealParaDolar(valorReal));

System.out.println();

cot_2.imprimir();

System.out.printf("Coversão de Real para dólar : US$ %.2f",

cot_2.converterRealParaDolar(valorReal));

System.out.println();

}

}
