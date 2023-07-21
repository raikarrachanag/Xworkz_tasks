class PowerRunner{

 public static void main(String[] args)
 {
  Power power = new Power(true, true, 5, 100);
  Power.printstatic();
  power.printInstance();
  
  Power power1 = new Power(true, true, 6, 250);
  Power.printstatic();
  power1.printInstance();
 }
}