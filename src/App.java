public class App {

	public static void main(String[] args) {
		Controle control = new Controle();
		control.readInput();
		if (control.parseInput()) {
			control.executeMovements();
			control.showOutput();
		} else {
			System.out.println("Entrada Invalida!");
		}
	}
}