package Styles;

// Concrete implementation of Lightningbending technique
public class LightningBendingStyle extends FireBendingStyle {

  @Override
  public void performBending(String benderName) {
    System.out.println(benderName + " channels lightning with precision!");
  }

  @Override
  public void meditate(String benderName){
    System.out.println(benderName + " ponders the terrifying destructive power of lightning.");
  }
}
