package ArrayDemo;

import java.util.Comparator;

public class NameComparator implements Comparator<ComparatorDemo>{

	@Override
	public int compare(ComparatorDemo o1, ComparatorDemo o2) {
		
		return o1.getStudentname().compareTo(o2.getStudentname());
	}

}
