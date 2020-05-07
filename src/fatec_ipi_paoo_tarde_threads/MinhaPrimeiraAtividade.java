package fatec_ipi_paoo_tarde_threads;

public class MinhaPrimeiraAtividade implements Runnable{

	@Override
	public void run() {
		System.out.println("Queremos que seja executado em uma thread diferente da principal");		
	}

}
