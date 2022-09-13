package com.doitAlgorithm.ch03;

public class P302 {
	static int seqSearch(int[] a, int n, int key) {
		for(int i = 0; i<n; i++) {
			if(a[i] == key)
				return i;
		}
		return -1;
	}
}
