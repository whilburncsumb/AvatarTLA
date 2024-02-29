package Benders;
import Styles.*;

// Firebender class
public class FireBender extends Bender {

  public FireBender(String name) {
    super(name, new FireBendingStyle());
  }
  @Override
  protected boolean isValidBendingStyle(BendingStyle bendingStyle) {
    return bendingStyle instanceof FireBendingStyle;
  }
}
