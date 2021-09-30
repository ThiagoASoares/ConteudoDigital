package ClassesAbstratas;

public class Exemplo7 {

public static void main(String[] args) {


SubAbstrata sabs = new SubAbstrata();

sabs.setNome("André");

sabs.setIdade(25);

sabs.setPeso(90);

sabs.setAltura(1.75);

if(sabs.maiorIdade()) {

System.out.println("Sim, maior de idade.");

}

else{

System.out.println("Não, não é de maior idade.");

}

System.out.println("IMC = "+ sabs.calculaImc(90, 1.78));

sabs.imprimir();

}

}