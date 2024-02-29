// Bender class (Root class)
class Bender {

  private final String name;
  private BendingStyle bendingStyle; // Strategy

  public Bender(String name, BendingStyle bendingStyle) {
    this.name = name;
    this.bendingStyle = bendingStyle;
  }

  public String getName() {
    return name;
  }

  // Method to check if the bending style is valid for this bender
  protected boolean isValidBendingStyle(BendingStyle bendingStyle) {
    return true; // Default implementation, can be overridden by subclasses
  }

  public BendingStyle getBendingStyle() {
    return bendingStyle;
  }

  public void setBendingStyle(BendingStyle bendingStyle) {
    if (isValidBendingStyle(bendingStyle)) {
      this.bendingStyle = bendingStyle;
    } else {
      System.out.printf("Invalid bending style for %s.\n",name);
    }
  }

  public void performBending() {
    bendingStyle.performBending(name); // Delegate to strategy and pass the bender's name
  }

  public void meditate() {
    bendingStyle.meditate(name);
  }
}
