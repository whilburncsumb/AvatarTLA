public class Main {
  public static void main(String[] args) {
    WaterBender katara = new WaterBender("Katara");
    FireBender zuko = new FireBender("Zuko");
    LightningBender azula = new LightningBender("Azula");
    //The Avatar represents the singleton pattern, and only one Avatar can exist.
    Avatar aang = Avatar.getInstance("Aang");  // We have to get the reference to the Avatar with getInstance


    katara.meditate();// Perform Waterbending techniques
    katara.performBending();
    zuko.meditate();// Perform Firebending techniques
    zuko.performBending();

    //Because Azula is a Lightningbender, which inherits from firebender, she can do both fire and lightning
    azula.performBending(); // Perform Lightningbending technique
    azula.setBendingStyle(new FireBendingStyle());
    azula.performBending(); // Perform Firebending
    azula.setBendingStyle(new WaterBendingStyle());// Try to make Azula perform waterbending...
    azula.performBending(); // Her technique didn't change so she stays bending fire

    //Aang, as the avatar, can bend all elements. Avatar's performBending method takes in an argument.
    aang.performBending("Water"); // Perform Waterbending technique as Avatar
    aang.performBending("Fire"); // Perform Firebending technique as Avatar
    aang.meditate();
  }
}
