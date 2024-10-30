class Node {
    String nama;
    int umur;
    String gender;
    String penanganan;
    String status;
    Node next;

    public Node(String nama, int umur, String gender, String penanganan, String status) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.penanganan = penanganan;
        this.status = status;
        this.next = null;
    }
}