package leetcode;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(5);
        listNode.next = new ListNode(4);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(2);
        listNode.next.next.next.next = new ListNode(1);

        ListNode middle = middleNode(listNode);
        if (middle != null) {
            System.out.println("Middle Node Value: " + middle.val);
        } else {
            System.out.println("The linked list is empty.");
        }
    }

    static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

