package ClassesAbstratas;

public abstract class Abstrata {

private String nome;

private int idade;

private double peso, altura;

public String getNome() {

return nome;

}

public void setNome(String nome) {

this.nome = nome;

}

public double getPeso() {

return peso;

}

public void setPeso(double peso) {

this.peso = peso;

}

public double getAltura() {

return altura;

}

public void setAltura(double altura) {

this.altura = altura;

}

public int getIdade() {

return idade;

}

public void setIdade(int idade) {

this.idade = idade;

}

public abstract double calculaImc(double peso, double altura);

public abstract boolean maiorIdade();

public abstract void imprimir();

}
