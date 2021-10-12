
public class SortedApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedLinkedList sll = new SortedLinkedList();
		
		System.out.println("Is list empty: "+sll.isEmpty()+"\n");
		sll.insert(10, 14);
		sll.insert(20, 2);
		sll.insert(30, 34);
		sll.insert(40, 99);
		sll.insert(50, 7);
		System.out.println("Is list empty: "+sll.isEmpty()+"\n");
		
		sll.displayList();

	}

}
