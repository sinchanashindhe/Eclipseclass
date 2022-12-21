import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class AnimalRunner {

	public static void main(String[] args) {

		String animal1 = "Tiger";
		String animal2 = "Lion";
		String animal3 = "Cheeta";
		String animal4 = "Elephant";
		String animal5 = "Rabbit";
		String animal6 = "BlackPanther";
		String animal7 = "Leopard";
		String animal8 = "Fox";
		String animal9 = "Horse";
		String animal10 = "Camel";

		Collection<String> collection = new ArrayList<String>();
		collection.add(animal1);
		collection.add(animal2);
		collection.add(animal3);
		collection.add(animal4);
		collection.add(animal5);
		collection.add(animal6);
		collection.add(animal7);
		collection.add(animal8);
		collection.add(animal9);
		collection.add(animal10);

		System.out.println(collection);

		System.out.println(collection.size());
		System.out.println(System.lineSeparator());

		System.out.println("for each loop");
		for (String string : collection) {
			System.out.println(string);

		}
		System.out.println(System.lineSeparator());

		System.out.println("Itetatior method");
		Iterator<String> animal = collection.iterator();
		while (animal.hasNext()) {
			String element = animal.next();
			System.out.println(element);
		}
	}
}
