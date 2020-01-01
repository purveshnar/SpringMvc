package java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author purveshnar
 *
 */
public class Java8ForEachExample {
	
	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<Integer>();
		for(int i =0; i<10; i++) {
			myList.add(i);
		}
		
		Iterator<Integer> iterator = myList.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			//System.out.println(next);
		}
		
/*		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer i) {
				//System.out.println(i);
				
			}
		});*/
		
		MyConsumer myConsumer = new MyConsumer();
		myList.forEach(myConsumer);
	}

}

class MyConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {

		System.out.println(t);
		
	}
	
}
