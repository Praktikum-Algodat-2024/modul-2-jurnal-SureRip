public class QueueNode {
    String nama;
    int antrian;
    boolean spesial;
    Stack stack;
    QueueNode next;
    
    public QueueNode(String nama, int antrian, boolean spesial, Stack stack){
        this.nama = nama;
        this.antrian = antrian;
        this.spesial = spesial;
        this.stack = stack;
        this.next = null;
    }
}
