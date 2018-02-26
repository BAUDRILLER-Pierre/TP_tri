package jus.aoo.tri.sort;

import java.util.Comparator;

import jus.aoo.tri.Tri;

public class MaximumSort extends Tri {

	@Override
	protected <T> T[] sort(T[] tab, Comparator<T> c) {


for (int i = tab.length-1; i>= 0 ; i--) {
	int k=i;
	for (int j=i;j>=0;j--){
		if (c.compare(tab[j], tab[k])>0) {k=j;}
			
		}swap(tab,i,k);
	}



		return tab;
	}

}
