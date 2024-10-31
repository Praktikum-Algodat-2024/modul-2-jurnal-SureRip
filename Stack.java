public class Stack {
    StackNode top;

    public Stack() {
        top = null;
    }

    public void push(String judul, String pengarang, String genre, boolean terkutuk) {
        StackNode newNode = new StackNode(judul, pengarang, genre, terkutuk);
        newNode.next = top;
        top = newNode;
    }

    public int hitung() {
        int pos = 0;
        StackNode temp = top;
        while (temp != null) {
            pos++;
            temp = temp.next;
        }
        return pos;
    }

    public void pop(){
        if(top == null){
            System.out.println("Kosong");
            return;
        }else{
            top = top.next;
        }
    }

    public void swap(int pos1, int pos2){
        StackNode prevNode1 = null;
        StackNode prevNode2 = null;
        StackNode currNode1 = top;
        StackNode currNode2 = top;      
        for (int i = 1; i<pos1; i++) {
            prevNode1 = currNode1;
            currNode1 = currNode1.next;
        }
        for (int i = 1; i<pos2; i++) {
            prevNode2 = currNode2;
            currNode2 = currNode2.next;
        }
        if(prevNode1 != null){
            prevNode1.next = currNode2;
        }else{
            top = currNode2;
        }
        if(prevNode2 != null){
            prevNode2.next = currNode1;
        }else{
            top = currNode1;
        }
        StackNode temp = currNode1.next;
        currNode1.next = currNode2.next;
        currNode2.next = temp;
    }

    public void displayBukuStack(String nama) {
        StackNode temp = top;
        System.out.println("===================================");
        System.out.println("=           BUKU "+ nama+"           =");
        System.out.println("===================================");
        while (temp != null) {
            System.out.println("===================================");
            System.out.println("Judul Buku: "+temp.judul+"\nNama Pengarang: "+temp.pengarang+"\nGenre: "+temp.genre +"\nStatus Buku: "+(temp.terkutuk ? "Cursed" : "Buku Biasa"));
            System.out.println("===================================");
            temp = temp.next;
        }
    }
}
