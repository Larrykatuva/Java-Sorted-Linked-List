
public class Link {
	public int data;
	public int dData;
	public Link next;
	
	
	/**
	 * Class constructor
	 * @param data
	 * @param dData
	 */
	public Link(int data, int dData) {
		this.data = data;
		this.dData = dData;
	}	public void displayLink() {

	
	
	/**
	 * Displaying link values
	 */
		System.out.println("Key: "+this.data+" Data: "+this.dData);
	}


	/**
	 * Get dData value
	 * @return
	 */
	public int getValue() {
		return this.dData;
	}
}	
