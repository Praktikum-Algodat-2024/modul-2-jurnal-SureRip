public class Hardd {
    public static void main(String[] args) {
        Stack kazuma = new Stack();
        kazuma.push("Belajar Java", "Raysen", "Edukasi", false);
        kazuma.push("Cara Menjadi Orang Kaya", "Teguh", "Fantasi", false);

        Stack huTao = new Stack();
        huTao.push("Cara Tidur Cepat", "Pengarang C", "Kesehatan", true);
        huTao.push("Belajar C++", "Pengarang D", "Pendidikan", false);
        huTao.push("Belajar Ilmu Hitam", "Pengarang E", "Terlarang", true);

        Stack kafka = new Stack();
        kafka.push("Raysen the Forgotten One", "Unknown", "Sejarah", true);
        kafka.push("Misteri Menghilangnya Nasi Puyung", "Optimus", "Misteri", false);
        kafka.push("Cara Menjadi Milioner Dalam 1 Jam", "Master Oogway", "Edukasi", false);

        Stack xiangLing = new Stack();
        xiangLing.push("Misteri Air Limbah Naga", "Unknown", "Horror", false);

        Stack sucrose = new Stack();
        sucrose.push("Resurection", "Unknown", "Unknown", true);
        sucrose.push("Alhcemy", "Albedo", "Sience", true);
        sucrose.push("Durin The Forgotten Dragon", "Gold", "Misteri", false);
        
        Queue Q = new Queue();
        Q.enqueue("Kazuma", false, kazuma);
        Q.enqueue("Hu Tao", true, huTao);
        Q.enqueue("Kafka", false, kafka);
        Q.enqueue("XiangLing", false, xiangLing);

        Q.displayAntrian();
        Q.dequeue();
        Q.displayAntrian();
        Q.dequeue();
        Q.displayAntrian();
        Q.enqueue("SUCROSE", true, sucrose);
        Q.displayAntrian();
        Q.deleteMid("XiangLing");
        Q.displayAntrian();
        Q.swapAntrian("Kafka", "SUCROSE");
        Q.displayAntrian();
        Q.dequeue();
        Q.displayAntrian();
        Q.dequeue();
        kafka.swap(1, 3);
        kafka.displayBukuStack("Kafka");
        kafka.pop();
        Q.dequeue();
        Q.displayAntrian();
    }
}
