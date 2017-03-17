package epam.com.multitheding;

/**
 * Created by Ermek_Abyshev on 3/16/2017.
 */
public class ChickenVoice {

    public static void main(String[] args) {
        EggVoice eggVoice = new EggVoice();
        Thread thread = new Thread(new SomeThing());
//        thread.start();

        System.out.println("argue is start...");
        eggVoice.start();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }

            System.out.println("chicken!");
        }

        if (eggVoice.isAlive()) {
            try {
                eggVoice.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("egg is first");
        } else {
            System.out.println("chicken is first");
        }
        System.out.println("argue is finished!");
    }
}
