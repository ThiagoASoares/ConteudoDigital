package Constante;

public class SuperClasse {

protected static int valor = 5;

public int getValor() {

return valor;

}

public void setValor(int valor) {

// Não pode usar a referência this

// porque valor foi modificado com static

SuperClasse.valor = valor;

}

public final double valorQuadrado() {

return Math.pow(valor, 2);

}

public final int valorDobro() {

return valor * 2;

}
}

  