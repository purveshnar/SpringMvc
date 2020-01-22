package com.purvesh.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparisonTest {
	
	public static void main(String[] args) {
		
		Movie movie1 = new Movie();
		movie1.setReleaseYear(2001);
		
		Movie movie2 = new Movie();
		movie2.setReleaseYear(2000);
		
		List<Movie> movieList = new ArrayList<>();
		movieList.add(movie1);
		movieList.add(movie2);
		
		System.out.println(movieList);
		//Collections.sort(movieList);
		System.out.println(movieList);
		
		ReleaseComparator releaseComparator = new ReleaseComparator();
		Collections.sort(movieList, releaseComparator);
		System.out.println(movieList);
		
		System.out.println("Java 8");
		Collections.sort(movieList, Comparator.comparing(Movie::getReleaseYear).thenComparing(Movie::getReleaseYear).reversed());
		System.out.println(movieList);
		
	}

}
