package org.example.adv;

public class MAin2 {
    public static void main(String[] args) {

        Node n3 = new Node(3, null);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        int length = 0;
        Node current = n1;
        System.out.println(current);
        while (current.next != null) {
            length++;
            current = current.next;
        }
        System.out.println(length);
        System.out.println(current);
        System.out.println(n1);
    }
}
