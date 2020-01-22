package com.purvesh.compare;

public class Movie implements Comparable<Movie>{
	private int releaseYear;
	private String name;

	@Override
	public String toString() {
		return "Movie [releaseYear=" + releaseYear + ", name=" + name + "]";
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
