package Benders;
import Styles.*;

// Lightningbender class inheriting from Firebender
public class LightningBender extends FireBender {

  public LightningBender(String name) {
    super(name);
    setBendingStyle(
        new LightningBendingStyle()); // Set Lightningbending as default style for Lightningbender
  }

  @Override
  protected boolean isValidBendingStyle(BendingStyle bendingStyle) {
    return bendingStyle instanceof FireBendingStyle || bendingStyle instanceof LightningBendingStyle;
  }
}
