public class MainTV {
    public static void main(String[] args) {

        // wersja z boolean
        Televisor tv = new Televisor(false); //bez konstruktora i tak z automatu false
        tv.showStatus();
        tv.trunOn();
        tv.showStatus();
        tv.turnOff();
        tv.showStatus();

        //wersja z String

        TelevisorWithString tv2 = new TelevisorWithString("wyłączony");
        tv2.showStatus();
        tv2.trunOn();
        tv2.showStatus();
        tv2.turnOff();
        tv2.showStatus();

    }
}
