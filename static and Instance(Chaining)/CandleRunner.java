class CandleRunner{

 public static void main(String[] args)
 {
  Candle candle = new Candle("White", "Cylindrical", 20, 4);
  Candle.printstatic();
  candle.printInstance();
  
  Candle candle1 = new Candle("Blue", "Sqaure", 40, 8);
  Candle.printstatic();
  candle1.printInstance();
  }
}