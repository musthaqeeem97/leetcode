package june;

public class Ex19RemoveNthNodeFromEndofList {

	
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
	  public ListNode removeNthFromEnd(ListNode head, int n) {
		  
		  
		  ListNode dummy = new ListNode(0);
		  dummy.next = head;
		  
		  ListNode fastPointer = dummy;
		  ListNode slowPointer = dummy;
		  
		  for (int i = 0; i <= n; i++) {
		
			  fastPointer = fastPointer.next;
		}
		  
		  while(fastPointer!=null) {
			
			  fastPointer = fastPointer.next;			  
			  slowPointer = slowPointer.next;
			  
			 
		}
		  slowPointer.next = slowPointer.next.next;
		  
		 return dummy.next;
	  }
	   
}
