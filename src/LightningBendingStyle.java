// Concrete implementation of Lightningbending technique
class LightningBendingStyle implements BendingStyle {

  @Override
  public void performBending(String benderName) {
    System.out.println(benderName + " channels lightning with precision!");
  }

  @Override
  public void meditate(String benderName){
    System.out.println(benderName + " ponders the terrifying destructive power of lightning.");
  }
}
