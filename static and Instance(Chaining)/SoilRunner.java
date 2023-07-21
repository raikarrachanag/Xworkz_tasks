class SoilRunner{

 public static void main(String[] args)
 { 
  Soil soil = new Soil("Light Brown", 200, 1, "Sandy");
  Soil.printstatic();
  soil.printInstance();
  
  Soil soil1 = new Soil("Red", 150, 2, "Clay");
  Soil.printstatic();
  soil1.printInstance();
 }
}