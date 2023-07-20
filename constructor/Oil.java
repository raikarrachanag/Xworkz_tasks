class Oil{
 
 String name;
 int viscocity;
 int quantity;
 
 Oil()
 {
  System.out.println("Invoking const in oil");
 }
 Oil(String name)
 {
  System.out.println("Invoking const in oil");
  System.out.println("Name Of Oil: " +name);
  this.name=name;
  }
 Oil(String name, int viscocity)
 {
  System.out.println("Invoking const in oil");
  System.out.println("Name Of Oil: " +name);
  System.out.println("viscocity Of Oil: " +viscocity);
  this.name=name;
  this.viscocity=viscocity;
  }
  Oil(String name, int viscocity, int quantity)
 {
  System.out.println("Invoking const in oil");
  System.out.println("Name Of Oil: " +name);
  System.out.println("viscocity Of Oil: " +viscocity);
  System.out.println("quantity Of Oil: " +quantity);
  this.name=name;
  this.viscocity=viscocity;
  this.quantity=quantity;
  }
  
  }