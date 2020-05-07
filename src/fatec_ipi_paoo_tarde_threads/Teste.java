package fatec_ipi_paoo_tarde_threads;

public class Teste {
	
	public static void main(String[] args) {
		
		MinhaPrimeiraThread thread = new MinhaPrimeiraThread();
		
		//para disparar a thread - criar um novo fluxo de execucao e chama o metodo run. -- leva tempo criar nova thread
		//thread.start();
		
		//chamar o metodo run não cria outra thread - ele é o novo main da nova thread
		//thread.run();
		
		for(int i = 0; i < 10; i++)
		{
			new MinhaPrimeiraThread().start();
		}
		
		System.out.println("No main: " + Thread.currentThread().getName());
		
	}

}
