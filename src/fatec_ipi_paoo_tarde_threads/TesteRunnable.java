package fatec_ipi_paoo_tarde_threads;

public class TesteRunnable {
	
	public static void main(String[] args) {
		Thread thread = new Thread(new MinhaPrimeiraAtividade());
		
		thread.start();
		
		System.out.println("Chegando ao fim do main ....");
	}

}
