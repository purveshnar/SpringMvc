package com.purvesh.test;

public class Movie implements Comparable<Movie>{
	private int releaseYear;

	@Override
	public String toString() {
		return "Movie [releaseYear=" + releaseYear + "]";
	}

	public int compareTo(Movie other) {
		if(this.getReleaseYear() >other.getReleaseYear()){
			return 1;
		}else
			return -1;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

}
