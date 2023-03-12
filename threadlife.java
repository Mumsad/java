public class threadlife {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("current Thread "+t);

        t.setName("My Thread");
        System.out.println("After changing name"+t);
        try {
            for (int n =5;n>0;n--) {
                System.out.println(n);
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("main thread interputed ");
        }
    }
}
