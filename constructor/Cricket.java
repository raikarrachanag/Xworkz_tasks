class Cricket{

 String name;
 String place;
 int age;
 
 Cricket()
 {
  System.out.println("Invoking const in Cricket");
  System.out.println("Inside the constructor: " +this.name);
  System.out.println("Inside the constructor: " +this.place);
  System.out.println("Inside the constructor: " +this.age);
  
  this.name="Mahendra Singh Dhoni";
  this.place="Ranchi";
  this.age=40;
  }
  
  Cricket(String name, String place, int age)
  {
   System.out.println("Invoking arguement in main");
   this.name=name;
   this.place=place;
   this.age=age;
  }
}