class LogoMain{

 public static void main(String[] args)
 {
  System.out.println("Invoking main in LogoMain");
  Logo logo = new Logo();
  System.out.println(logo.price);
  System.out.println(logo.design);
  System.out.println(logo.pixel);
  System.out.println(logo.shape);
  System.out.println(logo.color);
  System.out.println(logo.backGround);
  System.out.println(logo.size);
  System.out.println(logo.type);
  
  System.out.println("========================================");
  
  Logo logo1 = new Logo(2888);
  System.out.println(logo1.price);
  System.out.println("========================================");
  
  Logo logo2 = new Logo(2888, "modern");
  System.out.println(logo2.price);
  System.out.println(logo2.design);
  System.out.println("========================================");
  
  Logo logo3 = new Logo(2888, "modern", 6.6f);
  System.out.println(logo3.price);
  System.out.println(logo3.design);
  System.out.println(logo3.pixel);
  System.out.println("========================================");
  
  Logo logo4 = new Logo(2888, "modern", 6.6f, "sqaure");
  System.out.println(logo4.price);
  System.out.println(logo4.design);
  System.out.println(logo4.pixel);
  System.out.println(logo4.shape);
  System.out.println("========================================");
  
  Logo logo5 = new Logo(2888, "modern", 6.6f, "sqaure", "Orange");
  System.out.println(logo5.price);
  System.out.println(logo5.design);
  System.out.println(logo5.pixel);
  System.out.println(logo5.shape);
  System.out.println(logo5.color);
  System.out.println("========================================");
  
  Logo logo6 = new Logo(2888, "modern", 6.6f, "sqaure", "Orange","black");
  System.out.println(logo6.price);
  System.out.println(logo6.design);
  System.out.println(logo6.pixel);
  System.out.println(logo6.shape);
  System.out.println(logo6.color);
  System.out.println(logo6.backGround);
  System.out.println("========================================");
  
  Logo logo7 = new Logo(2888, "modern", 6.6f, "sqaure", "Orange","black", 160);
  System.out.println(logo7.price);
  System.out.println(logo7.design);
  System.out.println(logo7.pixel);
  System.out.println(logo7.shape);
  System.out.println(logo7.color);
  System.out.println(logo7.backGround);
  System.out.println(logo7.size);
  System.out.println("========================================");
  
  Logo logo8 = new Logo(2888, "modern", 6.6f, "sqaure", "Orange","black", 160, "Xworkz");
  System.out.println(logo8.price);
  System.out.println(logo8.design);
  System.out.println(logo8.pixel);
  System.out.println(logo8.shape);
  System.out.println(logo8.color);
  System.out.println(logo8.backGround);
  System.out.println(logo8.size);
  System.out.println(logo8.name);
  System.out.println("========================================");
  
  Logo logo9 = new Logo(2888, "modern", 6.6f, "sqaure", "Orange","black", 160, "Xworkz","Training Institute");
  System.out.println(logo9.price);
  System.out.println(logo9.design);
  System.out.println(logo9.pixel);
  System.out.println(logo9.shape);
  System.out.println(logo9.color);
  System.out.println(logo9.backGround);
  System.out.println(logo9.size);
  System.out.println(logo9.name);
  System.out.println(logo9.type);
  System.out.println("========================================");
  
  }}