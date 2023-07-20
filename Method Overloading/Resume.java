class Resume{

 static void format()
 {
  System.out.println("Running format in Resume....");
  System.out.println("\n");
 }
 static void format(String type)
 {
  System.out.println("Resume type: " +type);
  System.out.println("\n");
 }
 static void format(String type, int pages)
 {
  System.out.println("Resume type: " +type);
  System.out.println("Pages: " +pages);
  System.out.println("\n");
 }
 static void clear()
 {
  System.out.println("Running clear in Resume");
  System.out.println("\n");
 }
 static void delete()
 {
  System.out.println("Running delete in Resume");
 }
}