import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {
    public static void main(String[] args) {
        Queue<String> taskQueue = new LinkedList<>();

        // Menambahkan tugas ke dalam antrian
        taskQueue.add("Tugas 1");
        taskQueue.add("Tugas 2");
        taskQueue.add("Tugas 3");

        // Menampilkan seluruh tugas dalam antrian
        System.out.println("Tugas dalam antrian: " + taskQueue);

        // Mengambil tugas pertama dari antrian
        String nextTask = taskQueue.poll();
        System.out.println("Tugas selanjutnya: " + nextTask);

        // Menampilkan sisa tugas dalam antrian setelah pengambilan pertama
        System.out.println("Tugas dalam antrian setelah pengambilan pertama: " + taskQueue);
    }
}

