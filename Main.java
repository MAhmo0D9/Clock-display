public class Main {
    private static ClockDisplay time1;
    private static String myTime;
    public static void main(String[] args) {
        time1 = new ClockDisplay();
        for (int i = 0; i < 200; i++) {

            System.out.println(time1.getTime());
            time1.timeTick();
        }
    }
}

