
package smarttv;
public class Controler {
    public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();
    System.out.println("A Tv está Inicialmente liaga? " + smartTv.switchOnOff);

    smartTv.changePower();
    smartTv.changePower();
    smartTv.changePower();
    smartTv.changePower();
}
}