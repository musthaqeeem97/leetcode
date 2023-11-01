package june;


import java.time.chrono.HijrahChronology;
import java.util.List;

import june.Ex19RemoveNthNodeFromEndofList.ListNode;

public class Ex234PallindromeLinkedList {

	public boolean isPalindrome(ListNode head) {
        
		ListNode fastPointer = head;
		ListNode slowPointer = head;
		
		while (fastPointer!=null && fastPointer.next!=null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		
		//if odd no of odds to make right half smaller
		if (fastPointer!=null) {
			slowPointer = slowPointer.next;
		}
		
		     slowPointer = reverseList(slowPointer);
		     fastPointer = head;
		     
		
		     while (slowPointer!=null) {
				if (slowPointer.val!=fastPointer.val) {
					return false;
				}
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			}
		     return true;
    }

	private ListNode reverseList(ListNode slowPointer) {
		
		ListNode currrent = slowPointer;
		slowPointer = null;
	
		
		while (currrent!=null) {
			
			ListNode next = currrent.next;
			currrent.next = slowPointer;
			slowPointer = currrent;
			currrent = next;
			
		}
		return slowPointer;
	}
   
	//take left as global variable
	ListNode left;
	public boolean isPalindrome2(ListNode head) {
        left = head;
		return checkPalindrome(head);
    }

	private boolean checkPalindrome(ListNode right) {
		
		if (right == null) {
			return true;
		}
		
		//move to the right most node
		boolean ispalindromeSubList = checkPalindrome(right.next);
		if (!ispalindromeSubList) {
			return false;
		}
		boolean currentNodesMatch = left.val == right.val;
		 left = left.next;
		 
		 return currentNodesMatch;
		
	}

	
}
