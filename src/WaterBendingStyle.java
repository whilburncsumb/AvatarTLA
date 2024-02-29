// Concrete implementation of Waterbending technique
class WaterBendingStyle implements BendingStyle {

  @Override
  public void performBending(String benderName) {
    System.out.println(benderName + " performs a graceful Waterbending technique!");
  }

  @Override
  public void meditate(String benderName){
    System.out.println(benderName + " contemplates the push and pull of the mighty waves.");
  }
}
