package ArrayDemo;

import java.util.Comparator;

public class AgeComparator implements Comparator<ComparatorDemo>{

	@Override
	public int compare(ComparatorDemo o1, ComparatorDemo o2) {
		// TODO Auto-generated method stub
		return o1.getRollno()-o2.getRollno();
	}

	

}
