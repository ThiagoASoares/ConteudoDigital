package ModeloStatic;

public class Exemplo3 {

public static void main(String[] args) {

// TODO Auto-generated method stub

System.out.println("System.out.println � um m�todo est�tico Compartilhado)");

System.out.println("Uso do m�todo Math.pow para pot�ncia:" + Math.pow(2, 3));

System.out.println("Tamb�m utilizamos em nossas convers�es:");

String valor = "1000";

System.out.println("Double.parseDouble(valor):" + Double.parseDouble(valor));

System.out.println("Integer.parseInt(valor):" + Integer.parseInt(valor));

// Agora vamos usar os dois m�todos da classe MetodoCompartilhado,

// sem a cria��o de objetos:

System.out.println("Dobro do valor :" +

MetodosCompartilhados.valorDobro());

System.out.println("Quadrado do valor :" +

MetodosCompartilhados.valorQuadrado());

}

}
