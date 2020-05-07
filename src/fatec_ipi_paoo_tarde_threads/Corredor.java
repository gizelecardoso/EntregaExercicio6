package fatec_ipi_paoo_tarde_threads;

public class Corredor implements Runnable{
	
	private double distanciaTotalDaCorrida = 500;
	private double distanciaTotalPercorrida = 0;
	
	private Thread mainThread;
	private int valorMaximo;
	
	public Corredor(Thread mainThread, int valorMaximo) {
		this.mainThread = mainThread;
		this.valorMaximo = valorMaximo;
	}

	@Override
	public void run() {
		
		try {
			mainThread.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while(distanciaTotalPercorrida < distanciaTotalDaCorrida) {
			distanciaTotalPercorrida += Math.random() * valorMaximo;
			
			System.out.printf("%s: %.2f\n", Thread.currentThread().getName(), distanciaTotalPercorrida);
			
			if(distanciaTotalPercorrida > distanciaTotalDaCorrida) {
				System.out.println(Thread.currentThread().getName() + " acabou.");
			}
			
			try {
				Thread.sleep(2000 + (int)Math.random() * 10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
