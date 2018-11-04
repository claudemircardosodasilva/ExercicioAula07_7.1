package Exercicio7_1;

public class Main {
	public static void main(String[] args) throws Exception {

		ManipuladorAbstrato manipulador;

		System.out.println("    Transforma o que escrever em letra mai�sculo    ");

		manipulador = new ManipuladorMaiusculo();
		manipulador.manipularString();

		System.out.println("    Transforma  o que escrever em  letra min�sculo    ");

		manipulador = new ManipuladorMinusculo();
		manipulador.manipularString();

		System.out.println("     Agora Duplico o que escreveu ");

		manipulador = new ManipuladorDuplicar();
		manipulador.manipularString();

		System.out.println("   Agora Inverto o que escreveu    ");

		manipulador = new ManipuladorInverter();
		manipulador.manipularString();
	}
}