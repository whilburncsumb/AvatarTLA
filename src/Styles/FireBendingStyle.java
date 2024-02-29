package Styles;

// Concrete implementation of Firebending technique
public class FireBendingStyle implements BendingStyle {

  @Override
  public void performBending(String benderName) {
    System.out.println(benderName + " performs a fierce Firebending technique!");
  }

  @Override
  public void meditate(String benderName){
    System.out.println(benderName + " focuses deeply on the flame in their heart.");
  }
}
