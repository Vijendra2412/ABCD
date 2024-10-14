


class ListNode {
    int val;         // Node ka value
    ListNode next;   // Next node ka reference

    ListNode(int val) {
        this.val = val; // Node ko initialize karte hain
    }
}

public class LinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {
        // Agar linked list khali hai ya sirf ek node hai
        if (head == null || head.next == null) return true;

        ListNode fast = head; // Fast pointer ko head par set karte hain
        ListNode slow = head; // Slow pointer ko head par set karte hain

        // Slow pointer ko list ke mid tak le jaana
        while (fast != null && fast.next != null) {
            slow = slow.next;        // Slow pointer ko ek step aage badhao
            fast = fast.next.next;   // Fast pointer ko do steps aage badhao
        }

        // Second half ko reverse karte hain
        ListNode reversedSecondHalf = reverse(slow);
        ListNode firstHalf = head; // First half ko head par set karte hain

        // Dono halves ko compare karte hain
        while (reversedSecondHalf != null) {
            if (firstHalf.val != reversedSecondHalf.val) return false; // Agar values match nahi karte
            firstHalf = firstHalf.next; // First half ko aage badhao
            reversedSecondHalf = reversedSecondHalf.next; // Reversed half ko aage badhao
        }
        return true; // Agar sab values match karti hain, to true return karo
    }

    // Linked list ko reverse karne wala helper method
    private ListNode reverse(ListNode head) {
        ListNode prev = null; // Previous node ko null se initialize karte hain
        while (head != null) {
            ListNode next = head.next; // Next node ko save karo
            head.next = prev;           // Current node ka next ko previous node set karo
            prev = head;                // Previous ko current node par le jao
            head = next;                // Head ko next node par le jao
        }
        return prev; // Reversed list ka head return karo
    }

    public static void main(String[] args) {
        // Linked list banate hain: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        LinkedListPalindrome palindromeChecker = new LinkedListPalindrome();
        boolean isPalin = palindromeChecker.isPalindrome(head);

        // Result print karte hain
        if (isPalin) {
            System.out.println("Linked list palindrome hai.");
        } else {
            System.out.println("Linked list palindrome nahi hai.");
        }
    }
}
