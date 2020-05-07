package fatec_ipi_paoo_tarde_threads;

public class TesteCorredor {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		
		Thread corredor1 = new Thread (new Corredor(mainThread, 300), "Senna");
		Thread corredor2 = new Thread (new Corredor(mainThread, 100), "Barrichello");
		Thread corredor3 = new Thread (new Corredor(mainThread, 120), "Mansell");
		Thread corredor4 = new Thread (new Corredor(mainThread, 50), "Piquet");
		Thread corredor5 = new Thread (new Corredor(mainThread, 80), "Hill");
		
		corredor1.start();
		corredor2.start();
		corredor3.start();
		corredor4.start();
		corredor5.start();
		
		System.out.println("Começou");
	}
}
