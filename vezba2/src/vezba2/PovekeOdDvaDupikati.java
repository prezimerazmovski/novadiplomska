package vezba2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class PovekeOdDvaDupikati implements IProverka {

	ArrayList<Integer> array = new ArrayList<>(List.of(8, 2, 3, 4, 5, 3, 2, 6, 6, 6, 6, 2));

	HashMap<Integer, Integer> niza = new HashMap<>();

	@Override
	public void proveri() {

		for (int i = 0; i < array.size(); i++) {
			if (!niza.containsKey(array.get(i))) {
				niza.put(array.get(i), 1);
			} else {
				int count = niza.get(array.get(i));
				niza.put(array.get(i), count + 1);
			}


		}
		System.out.println(niza);
		for (Entry<Integer, Integer> entry : niza.entrySet()) {
			// Integer key = entry.getKey();
			// Integer tab = entry.getValue();
			// do something with key and/or tab
			if (entry.getValue() >= 2) {
				System.out.println("Brojot" + entry.getKey() + "ima" + entry.getValue() + "duplikati");
		}
	}

		// System.out.println("Brojot"+key+"ima"+tab);

}
}


