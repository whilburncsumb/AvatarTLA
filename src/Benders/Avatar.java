package Benders;
import Styles.*;

// Avatar class representing a bender who can bend all four elements
public class Avatar extends Bender {

  private static Avatar instance; // Singleton instance

  private Avatar(String name) {
    super(name, null); // Initial bending style is null
  }

  public static Avatar getInstance(String name) {
    if (instance == null) {
      instance = new Avatar(name);
    }
    return instance;
  }

  // Perform bending with a specified element
  public void performBending(String element) {
    switch (element.toLowerCase()) {
      case "water":
        setBendingStyle(new WaterBendingStyle());
        break;
      case "fire":
        setBendingStyle(new FireBendingStyle());
        break;
      default:
        System.out.println("Invalid element for bending.");
    }
    performBending(); // Delegate to the appropriate bending style
  }

  public void meditate(){
    System.out.println("Avatar " + getName() + " allows the cosmic energies to flow through them, and they enter the Avatar State!");
  }
}
