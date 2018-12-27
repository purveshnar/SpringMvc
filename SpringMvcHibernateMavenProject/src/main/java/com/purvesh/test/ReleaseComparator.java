package com.purvesh.test;

import java.util.Comparator;

public class ReleaseComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getReleaseYear() < o2.getReleaseYear()) {
			return -1;
		}else if(o1.getReleaseYear() > o2.getReleaseYear()) {
			return 1;
		}
		return 0;
	}

}
