public class Main {
    static int x = 1;
    static int a = 10000;
    public static void main(String args[]) {
        // System.out.println("Hello World");
        // System.out.println(1/0);
        // System.out.println("Nepal");

        System.out.println(Thread.currentThread().getName());   // currentThread -> static method

        // Thread t1 = new Thread(() -> System.out.println("Hello Worlds"));
        // t1.start();

        

        Thread t1 = new Thread(() -> {
            // while(true){
            //     System.out.println(Thread.currentThread().getName());
            // }
            for (int i=1; i<=a; i++){
                x++;
            }
        });
        t1.setName("bab");
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i=1; i<=a; i++){
                x++;
            }
        });
        t2.setName("dab");
        t2.start();

        Thread t3 = new Thread(() -> {
            for (int i=1; i<=a; i++){
                x++;
            }
        });
        t3.setName("cab");
        t3.start();

        Thread t4 = new Thread(() -> {
            for (int i=1; i<=a; i++){
                x++;
            }
        });
        t4.setName("sab");
        t4.start();

        Thread t5 = new Thread(() -> {
            for (int i=1; i<=a; i++){
                x++;
            }
        });
        t5.setName("nab");
        t5.start();

        System.out.println(x);

    }
}
