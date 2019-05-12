public class TelevisorWithString {
   String isTVon;

    void trunOn(){
        isTVon="włączony";
    }

    void turnOff(){
        isTVon="wyłączony";
    }

    void showStatus(){
        System.out.println("Telewizor jest "+isTVon);
    }

    TelevisorWithString(String aisTVon){
        isTVon=aisTVon;
    }
}
