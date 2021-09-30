package Interface;

public interface Controle {

	// Todos os atributos definidos em uma interface

	// s�o implicitamente static e final

	int POTENCIAMAXIMA = 350; // static e final

	int POTENCIAMINIMA = 120; // static e final

	// Somente os m�todos Getters

	// como os atributos em uma interface s�o final

	//n�o poder�o ser alterados, ou seja, n�o teremos

	// os m�todos Setters

	public int getPotenciaMaxima( );

	public int getPotenciaMinima( );

	// Todos os m�todos definidos em uma interface

	// s�o implicitamente public e abstract

	void assar(int potencia); // public e abstract

	void aquecer(int potencia); // public e abstract

	void desligar(); // public e abstract

	}
