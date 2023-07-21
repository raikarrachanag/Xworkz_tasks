class BrickRunner{

 public static void main(String[] args)
 { 
  Brick brick = new Brick("Brown", 500, 2, 40);
  Brick.printstatic();
  brick.printInstance();
  
  
  Brick brick1 = new Brick("Brown", 400, 1, 30);
  Brick.printstatic();
  brick1.printInstance();
  }
 }