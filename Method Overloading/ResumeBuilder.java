class ResumeBuilder{
 
  public static void main(String[] args)
  {
   Resume.format();
   Resume.format("pdf");
   Resume.format("doc", 2);
   Resume.clear();
   Resume.delete();
   }
  }