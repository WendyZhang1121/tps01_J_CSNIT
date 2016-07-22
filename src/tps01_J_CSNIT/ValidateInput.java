package tps01_J_CSNIT;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

//Does not use same thread pool
	public final class ValidateInput<V> implements Callable<V> {

		private final V input;
		ValidateInput(V input) { 
			this.input = input;
	}
		@Override
		public V call() throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
		
	
}
