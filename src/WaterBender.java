// Waterbender class
class WaterBender extends Bender {

  public WaterBender(String name) {
    super(name, new WaterBendingStyle());
  }
  @Override
  protected boolean isValidBendingStyle(BendingStyle bendingStyle) {
    return bendingStyle instanceof WaterBendingStyle;
  }
}
