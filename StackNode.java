public class StackNode {
    String judul;
    String pengarang;
    String genre;
    boolean terkutuk;
    StackNode next;

    public StackNode(String judul, String pengarang, String genre, boolean terkutuk){
        this.judul = judul;
        this.pengarang = pengarang;
        this.genre = genre;
        this.terkutuk = terkutuk;
        this.next = null;
    }
}
