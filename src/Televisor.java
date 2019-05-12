public class Televisor {
    boolean isTVon;

    void trunOn(){
        isTVon=true;
    }

    void turnOff(){
        isTVon=false;
    }

    void showStatus(){
        System.out.println("Czy telewizor jest włączony? "+isTVon);
    }

    Televisor(boolean aisTVon){
        isTVon=aisTVon;
    }

}
