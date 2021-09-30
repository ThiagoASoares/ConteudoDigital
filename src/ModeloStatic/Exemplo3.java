package ModeloStatic;

public class Exemplo3 {

public static void main(String[] args) {

// TODO Auto-generated method stub

System.out.println("System.out.println é um método estático Compartilhado)");

System.out.println("Uso do método Math.pow para potência:" + Math.pow(2, 3));

System.out.println("Também utilizamos em nossas conversões:");

String valor = "1000";

System.out.println("Double.parseDouble(valor):" + Double.parseDouble(valor));

System.out.println("Integer.parseInt(valor):" + Integer.parseInt(valor));

// Agora vamos usar os dois métodos da classe MetodoCompartilhado,

// sem a criação de objetos:

System.out.println("Dobro do valor :" +

MetodosCompartilhados.valorDobro());

System.out.println("Quadrado do valor :" +

MetodosCompartilhados.valorQuadrado());

}

}
