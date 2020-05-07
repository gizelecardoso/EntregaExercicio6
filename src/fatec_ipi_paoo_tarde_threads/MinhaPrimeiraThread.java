package fatec_ipi_paoo_tarde_threads;

public class MinhaPrimeiraThread extends Thread{
	
	public void run () {
		System.out.println("Estou sendo executado por uma thread diferente da principal, veja: "
				+ Thread.currentThread().getName());
	}

}
