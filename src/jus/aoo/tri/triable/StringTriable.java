package jus.aoo.tri.triable;

import java.util.Comparator;

import jus.aoo.tri.Triable;

import java.math.*;

public class StringTriable implements Triable<String> {

	@Override
	public String newInstance() {
		String rand = (int)(Math.random()*10000000)+"";
		return rand;
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
