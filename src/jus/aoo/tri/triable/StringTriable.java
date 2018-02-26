package jus.aoo.tri.triable;

import java.util.Comparator;
import java.util.Random;
import jus.aoo.tri.Triable;



public class StringTriable implements Triable<String> {

	public Random rand;
	
	public StringTriable(){
		this.rand = new Random();
	}
	
	@Override
	public String newInstance() {
		return rand.nextInt(10000000)+"";
	}

	@Override
	public Comparator<String> comparator() {
		
		return String.CASE_INSENSITIVE_ORDER;
	}

	@Override
	public String toString(String o) {
		
		return o;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void resetCount() {
		
	}

}
