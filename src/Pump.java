public class Pump {

	protected int value = 0;
	int state=1;
	protected Pump() { value = 0 ; }

	protected Pump(int initial) { value = initial ; }

	public synchronized void P() {
		value--;
		if (value < 0)
			try {
				wait();
				//Thread.sleep(500);
			} catch (InterruptedException e) {
			}
	}

	public synchronized void V() throws InterruptedException {
		value++;
		if (value <= 0)
			//Thread.sleep(500);
			notify();
	}

}