
public class binaryNumToLinkedList {
	
	static class Node{
		int value;
		Node next;
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	public static void main(String[] args) {
		
		
		
		Node node2 = new Node(1, null);
		Node node1= new Node(0, node2);
		Node head = new Node(1, node1);
		
		System.out.println(getDecmalValue(head));
		
		
		
	}
	public static int getDecmalValue(Node head) {
		Node temp = head;
		int total = 0, itteration = 0;
		while(temp != null) {
			if(temp.value == 1)
				total += (int) Math.pow(2, itteration);
			temp = temp.next;
			itteration ++;
		}
		return total;
		
	}
	
}
