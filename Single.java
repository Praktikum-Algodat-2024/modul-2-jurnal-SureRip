public class Single {
    Node head;

    public Single() {
        this.head = null;
    }

    public void push(String nama, int umur, String gender, String penanganan, String status) {
        Node newNode = new Node(nama, umur, gender, penanganan, status);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (head == null) {
            return -1;
        }
        int data = head.umur;
        head = head.next;
        return data;
    }

    public void enqueue(int umur) {
        antri.add(umur);
    }

    public int dequeue() {
        return antri.poll();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.umur + " ");
            temp = temp.next;
        }
    }
}