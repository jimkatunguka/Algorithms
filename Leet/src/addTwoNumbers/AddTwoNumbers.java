package addTwoNumbers;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(args[0]);

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode newlist = new ListNode(0);
		ListNode temp = newlist;

		int carry = 0;
		while (l1 != null || l2 != null) {
			int l1_val = (l1 != null) ? l1.val : 0;
			int l2_val = (l2 != null) ? l2.val : 0;

			int totalsum = l1_val + l2_val + carry;
			carry = totalsum / 10;
			int last_digit = totalsum % 10;

			ListNode newnode = new ListNode(last_digit);
			temp.next = newnode;

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
			temp = temp.next;
		}

		if (carry > 0) {
			ListNode newnode = new ListNode(carry);
			temp.next = newnode;
			temp = temp.next;
		}

		return newlist.next;

	}

}
