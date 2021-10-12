
public class SortedLinkedList {
	private Link first;
	
	
	/**
	 * Class constructor
	 */
	public SortedLinkedList() {
		this.first = null;
	}
	
	
	/**
	 * Checking if the linked list is empty
	 * @return
	 */
	public boolean isEmpty() {
		return this.first == null;
	}
	
	
	/**
	 * Inserting into the linked list in a sorted manner
	 * @param key
	 * @param value
	 */
	public void insert(int key, int value) {
		Link newLink = new Link(key, value);
		Link previousLink = null;
		Link currentLink = this.first;
		while(currentLink != null && value > currentLink.getValue()) {
			previousLink = currentLink;
			currentLink = currentLink.next;
		}
		if(previousLink == null) {
			this.first = newLink;
		}else {
			previousLink.next = newLink;
		}
		newLink.next = currentLink;
	}
	
	
	/**
	 * Deleting from the linked list
	 * @return
	 */
	public Link delete() {
		Link deleteLink = this.first;
		this.first = this.first.next;
		return deleteLink;
	}
	
	/**
	 * Displaying all the values in the linked list
	 */
	public void displayList() {
		Link currentLink = this.first;
		while(currentLink != null) {
			currentLink.displayLink();
			currentLink = currentLink.next;
		}
	}
}
