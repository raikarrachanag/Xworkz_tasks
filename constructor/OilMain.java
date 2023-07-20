class OilMain{

 public static void main(String[] args)
 {
  Oil oil = new Oil();
  System.out.println(oil.name);
  System.out.println(oil.viscocity);
  System.out.println(oil.quantity);
  
  System.out.println("===================================");
  
  Oil oil1 = new Oil("Sunflower");
  System.out.println(oil1.name);
  System.out.println("===================================");
  
  Oil oil2 = new Oil("Sunflower",40);
  System.out.println(oil2.name);
  System.out.println(oil2.viscocity);
  System.out.println("===================================");
  
  Oil oil3 = new Oil("Sunflower", 40, 1);
  System.out.println(oil3.name);
  System.out.println(oil3.viscocity);
  System.out.println(oil3.quantity);
  System.out.println("===================================");
  
  
  }}