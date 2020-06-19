import java.util.NavigableSet;
import java.util.TreeSet;

public class ListMap12 {
	public static void main(String[] args) {
		TreeSet<Integer> scores =new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		NavigableSet<Integer> descendingSet=scores.descendingSet();//내림차순 정렬
		for(Integer score:descendingSet) {
			System.out.print(score+ " ");
		}
		System.out.println();
		NavigableSet<Integer> ascendingSet=descendingSet.descendingSet();
		//작은 숫자부터 먼저 정렬
		for(Integer score:ascendingSet) {
			System.out.print(score+ " ");
		}
	}

}