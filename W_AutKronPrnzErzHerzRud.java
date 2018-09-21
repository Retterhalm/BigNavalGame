/*
Austrian Battleship Kronprinz Erzherzog Rudolf.
*/
public class W_AutKronPrnzErzHerzRud extends Warship{
  
      String name = "Kronprinz Erzherzog Rudolf";
      int yearBuilt = 1887;
      String flag = " Ausrian Navy";
      String hullMaterial = "Steel";
      String hullColor;
      int hullColorHex;
      String bridgeColor;
      int bridgeColorHex;
      String funnelColor;
      int funnelColorHex;
      double lengthOA = 97.6; // Length overall
      double lengthPP = 93.98; // Length between perpendiculars
      double beam = 19.27; // Width
      double draughtGeneral = 7.39;
      double draughtBowGeneral = 6.78;
      double draughtAftGeneral = 7.92;
      double freeboard;
      double displacement = 6829; // metric tons
      int decksQty;
      int complementGeneral = 447;
      int complementMax = 450;
      int complementMin;
      int mastsQty = 1;
      boolean foreMast = false;
      boolean mainMast = true;
      boolean mizzenMast = false;
      int engineRoomsQty;
      int boilerRoomsQty;
      int enginesQty = 2;
      String enginesType =" Verticale Triple-expansion"
      int engineCylsQty = 2;
      int boilersQty = 10;
      int boilerType = "Fire-tube"
      int shaftsQty = 2;
      int propellersQty = 2;
      int propellersBladesQty = 4;
      int propellersRPMNormal = 80;
      int propellersRPMForced = 90;
      double propuslionPowerNormal = 6500; // Horse Power
      double propulsionPowerForced = 7500; // Horse Power
      double coalComsumpEconomic; 
      double coalConsumpForced;
      double coalConsumpNormal
      double coalBunkersCap;
      double waterTanksCap;
      int anchorsQty;
      int bowAnchorsQty;
      int bowAnchorsType;
      int aftAnchorsQty;
      int aftAnchorsType;
      int spareAnchorsQty;
      int spareAnchorsType;
      int boatsQty;
      /* 
      Warship parameters
      */
      /*
      Armour description
      */
      double citadelArmour = 305;
      String citadelArmourType = "Compound";
      double mainBeltArmour;
      String mainBeltArmourType;
      double upperBeltArmour;
      String upperBeltArmourType;
      double mainBeltEndsArmour = 62;
      String mainBeltEndsArmourType = "Compound";
      double bulkheadsArmour;
      String bulkheadsArmourType;
      double transverseBulkheadsArmour = 254;
      String transverseBulkheadsArmourType = "Compound";
      double casematteArmour;
      String casematteArmourType;
      double mainDeckArmour;
      String mainDeckArmourType
      double carapaceArmour = 69;
      String carapaceArmourType = "Compound";
      double deckSlopesArmour;
      String deckSlopesArmourType;
      double conningTWRArmour;
      String conningTWRArmourType;
      double barbetteArmour = 254;
      String barbetteArmourType = "Compound";
      double elevatorsArmour;
      String elevatorsArmourType;
      double magazineArmour;
      String magazineArmourType;
      boolean ram = true;
      double ramArmour;
      String ramArmourType;
    
      /*
      Armament description
      */
      int mainGunsQty = 3;
      int secondaryGunQty = 6;
      int antiTBGunsQty = 9;
      int machineGunsQty;
      int torpedoTubesQty = 4;
}
