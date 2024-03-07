package compareDemo;

import java.util.Comparator;

public class ComparatorDemo1 implements Comparator<ComparatorDemo>{

	@Override
	public int compare(ComparatorDemo o1, ComparatorDemo o2) {
		return (int) (o1.getPrice()-o2.getPrice());
	}

}
