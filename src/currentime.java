public class currentime {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.currentTimeMillis());
        Thread.sleep(2000);
        System.out.println(System.currentTimeMillis());
    }
}
