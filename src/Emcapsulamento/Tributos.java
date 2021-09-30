package Emcapsulamento;

public class Tributos {

private double imposto;


public double calcularImposto ( double preco, int tipoProduto){

if(tipoProduto < 10 && tipoProduto>=0) { // tipo 0

// exemplo: 01, tipo 0, faixa 0

// chamada método do tipo 0 e faixa: 00 = 0

// se tipo = 0, faixa será o valor de tipoProduto

this.imposto = calcularTipoProduto0(preco, tipoProduto);

}

else {

if(tipoProduto < 20 && tipoProduto>10) { // tipo 1

// se tipo = 1,

// faixa será o valor de tipoProduto - 10

// exemplo: 11, tipo 1, faixa 1

// chamada método do tipo 1 e faixa: 11 - 10 = 1

this.imposto = calcularTipoProduto1(preco, tipoProduto - 10);

}

else {
	if(tipoProduto>20) {

// se tipo = 2,}

// faixa será o valor de tipoProduto - 20

// exemplo: 22, tipo 2, faixa 2

// chamada método do tipo 1 e faixa: 22 - 20 = 2

this.imposto = calcularTipoProduto2(preco, tipoProduto - 20);

		}else {
			System.out.println("Faixa negativa, favor colocar a faixA CORRETAMENTE");
			
		}
	
	}
	
	
	}
return this.imposto;}



private double calcularTipoProduto0(double valor, int faixa) {

// verificar as faixas e realizar o cálculo correto

if(faixa == 0) {

this.imposto = valor * 4.5 / 100;

}

else {

if(faixa == 1) {

this.imposto = valor * 5.5 / 100;

}

else {

this.imposto = valor * 4.5 / 100;

}

}

return this.imposto;

}

private double calcularTipoProduto1(double valor, int faixa) {

// verificar as faixas e realizar o cálculo correto

if(faixa == 0) {

this.imposto = valor * 12.5 / 100;

}

else {

if(faixa == 1) {

this.imposto = valor * 12.8 / 100;

}

else {

this.imposto = valor * 13.1 / 100;

}

}

return this.imposto;

}

private double calcularTipoProduto2(double valor, int faixa) {

// verificar as faixas e realizar o cálculo correto}

if(faixa == 0) { this.imposto = valor * 25.8 / 100; }

else {

if(faixa == 1) {

this.imposto = valor * 26.3 / 100;

}

else {

this.imposto = valor * 28.1 / 100;

}

}

return this.imposto;

}

}
