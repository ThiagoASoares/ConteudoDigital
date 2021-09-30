package Interface;

public class AppForno {

public static void main(String[] args) {

// ojbetos Forno e Microondas

Forno f = new Forno("GE", "f505", 60, 120);

f.assar(200);

f.desligar();

System.out.println();

}

}