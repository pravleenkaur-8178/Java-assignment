package session_2;

public class ques3 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("thread is running!");
        });
        thread.start();
    }
}

