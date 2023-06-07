import java.util.LinkedList;
import java.util.Queue;

public class customerqueue {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();

        // Menambahkan pelanggan ke dalam antrian
        customerQueue.add("Pelanggan 1");
        customerQueue.add("Pelanggan 2");
        customerQueue.add("Pelanggan 3");

        // Menampilkan seluruh pelanggan dalam antrian
        System.out.println("Pelanggan dalam antrian: " + customerQueue);

        // Mengambil pelanggan pertama dari antrian
        String nextCustomer = customerQueue.poll();
        System.out.println("Pelanggan selanjutnya: " + nextCustomer);

        // Menampilkan sisa pelanggan dalam antrian setelah pengambilan pertama
        System.out.println("Pelanggan dalam antrian setelah pengambilan pertama: " + customerQueue);
    }
}
