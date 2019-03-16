public class Main {

    public static void main(String[] args) {
        System.out.println("On Test1 Branch");

        Node head = new Node(2);
        Node node = new Node(3);
        Node node1 = new Node(4);

        head.next = node;
        node.next = node1;
    }
}
