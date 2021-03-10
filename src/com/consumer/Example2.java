package com.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<Movie> list= new ArrayList<>();
		populate(list);
		Consumer<Movie> c = m -> {
			System.out.println("Movie name:"+m.name);
			System.out.println("Movie hero:"+m.hero);
			System.out.println("Movie heroine:"+m.heroine);
			System.out.println("=========================");
		};
		for(Movie movie: list) {
			c.accept(movie);
		}
		
	}
	public static void populate(ArrayList<Movie> list){
		list.add(new Movie("Bahubali", "Prabhas", "Anushka"));
		list.add(new Movie("Soorarai pottru", "Suriya", "Aparna"));
		list.add(new Movie("Gajini", "Suriya", "Asin"));
		list.add(new Movie("Kaka kaka", "Suriya", "Jyothika"));
	}

}

class Movie{
	String name;
	String hero;
	String heroine;
	
	Movie(String name,String hero,String heroine){
		this.name= name;
		this.hero= hero;
		this.heroine= heroine;
	}
}
