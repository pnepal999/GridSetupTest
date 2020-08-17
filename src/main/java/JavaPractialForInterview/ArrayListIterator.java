package JavaPractialForInterview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of Thrones ");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The House Card");
		
		System.out.println(tvSeries);
		System.out.println("----------Printing using java8 forEach with lamda exp---------");
		
		// How can we iterate with different ways in ArrayList objects
		//1. Using java 8 with forEach loop and lamda expression
		tvSeries.forEach(shows->{
			System.out.println(shows);
		});
		System.out.println("------Printing using  Iterator-------------");
		//2.Using Iterator
		Iterator<String> st =tvSeries.iterator();
		while(st.hasNext()) {
			String shows = st.next();
			System.out.println(shows);
			
		}
		System.out.println("---------printing using Iterator and java8 lamda and ForEachRemaing() method------------");
		//3.using Iterator,java8 Lamda and forEachRamaining() method
		st = tvSeries.iterator();
		st.forEachRemaining(shows->{
			System.out.println(shows);
		});
		System.out.println("-------printing using forEach loop----------");
		//4. using forEach loop
		for(String show:tvSeries) {
			System.out.println(show);
		}
		System.out.println("--------printing for loop with order/Index----------------");
		//using for loop
		for(int i =0; i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
		}
		System.out.println("------Printing using listIterator to traverse in the both direction -------");
		//Using a listIterator() to traverse in the both direction
		ListIterator<String>tvSerieslistIterator = tvSeries.listIterator(tvSeries.size());
		while(tvSerieslistIterator.hasPrevious()) {
			String show =tvSerieslistIterator.previous();
			System.out.println(show);
		}
	}

}
