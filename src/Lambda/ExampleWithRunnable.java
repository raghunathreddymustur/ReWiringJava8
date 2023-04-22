package Lambda;

public class ExampleWithRunnable {
    public static void main(String[] args) {
        //Prior to Java 8 -- Anonymous Inner Class

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Using Anonymous Inner Class");
            }
        }).start();

        // Java 8 - Lambda
        new Thread(()-> System.out.println("Using Lambda")).start();
    }
}
