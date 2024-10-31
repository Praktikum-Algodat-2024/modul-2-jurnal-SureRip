public class Queue {
    QueueNode head;
    QueueNode tail;
    private int currAntrian;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.currAntrian = 1;
    }


    public void enqueue(String nama, boolean spesial, Stack stack) {
        QueueNode newNode = new QueueNode(nama, currAntrian++, spesial, stack);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void displayBukuQueue(QueueNode node) {
        if (node == null || node.stack == null) {
            System.out.println("Kosong");
            return;
        }
        StackNode temp = node.stack.top;
        System.out.println("===================================");
        System.out.println("=           BUKU "+ node.nama +"           =");
        System.out.println("===================================");
        while (temp != null) {
            System.out.println("===================================");
            System.out.println("Judul Buku: "+temp.judul +"\nNama Pengarang: "+temp.pengarang+"\nGenre: "+temp.genre +"\nStatus Buku: "+(temp.terkutuk ? "Cursed" : "Buku Biasa"));
            System.out.println("===================================");
            temp = temp.next;
        }
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("Antrian Kosong");
            return;
        }
        QueueNode temp = head;
        boolean adaTerkutuk = false;
        StackNode stackNode = temp.stack.top;
        while (stackNode != null) {
            if (stackNode.terkutuk) {
                adaTerkutuk = true;
                break;
            }
            stackNode = stackNode.next;
        }
        if (adaTerkutuk && !temp.spesial) {
            displayBukuQueue(temp);
            System.out.println("Tidak Bisa Meminjam Buku Terkutuk Bila Tidak Memiliki Kartu Spesial");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        displayBukuQueue(temp);
        QueueNode current = head;
        int newAntrian = 1;
        while (current != null) {
            current.antrian = newAntrian++;
            current = current.next;
        }
        currAntrian = newAntrian;
    }
    
    public void deleteMid(String nama){
        QueueNode current = head;
        QueueNode prev = null;
        while (current != null && !current.nama.equals(nama)) {
            prev = current;
            current = current.next;
        }   
        prev.next = current.next;
        int newAntrian = 1;
        while (current != null) {
            current.antrian = newAntrian++;
            current = current.next;
        }
        currAntrian = newAntrian;
    }

    public void swapAntrian(String nama1, String nama2) {
        QueueNode prevNode1 = null; 
        QueueNode node1 = head;
        while (node1 != null && !node1.nama.equals(nama1)) {
            prevNode1 = node1;
            node1 = node1.next;
        }
        QueueNode prevNode2 = null;
        QueueNode node2 = head;
        while (node2 != null && !node2.nama.equals(nama2)) {
            prevNode2 = node2;
            node2 = node2.next;
        }
        if(prevNode1 !=null){
            prevNode1.next = node2;
        }else{
            head = node2;
        }
        if(prevNode2 !=null){
            prevNode2.next = node1;
        }else{
            head = node1;
        }
        QueueNode temp = node1.next;
        node1.next = node2.next;
        node2.next = temp;
        QueueNode current = head;
        int newAntrian = 1;
        while (current != null) {
            current.antrian = newAntrian++;
            current = current.next;
        }
        currAntrian = newAntrian;
    }

    public void displayAntrian() {
        QueueNode temp = head;
        System.out.println("===================================");
        System.out.println("=          DAFTAR ANTRIAN        =");
        System.out.println("===================================");
        if(temp == null){
            System.out.println("Antrian Kosong");
            return;
        }
        while (temp != null) {
            int jumlahBuku = temp.stack != null ? temp.stack.hitung() : 0;
            System.out.println("===================================");
            System.out.println("Nama: " + temp.nama + "\nAntrian ke : "+temp.antrian+"\nJumlah Buku : "+jumlahBuku +"\nKartu Spesial : "+ (temp.spesial ? "ada" : "tidak ada"));
            System.out.println("===================================");
            temp = temp.next;
        }
    }
}
