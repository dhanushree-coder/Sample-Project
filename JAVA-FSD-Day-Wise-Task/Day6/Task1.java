package Day6;

public class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // optional: pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        Task1 thread = new Task1(); // create thread object
        thread.start();             // start the thread
    }
}
