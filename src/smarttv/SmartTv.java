
package smarttv;
public class SmartTv {
    boolean switchOnOff = false;
    public void changePower() {
        switchOnOff = !switchOnOff;
        if (switchOnOff) {
            System.out.println("A Tv está ligada.");
        }
        else{
            System.out.println("A Tv está desligada.");
        }
    }
}
