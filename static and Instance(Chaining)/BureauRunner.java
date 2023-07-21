class BureauRunner{

 public static void main (String[] args)
 {
  Bureau bureau = new Bureau("Investigation Agency","India", "Recruitment Agency", 250);
  Bureau.printstatic();
  bureau.printInstance();
  
  Bureau bureau1 = new Bureau("Recruitment Agency", "Sri Lanka", "Central Agency", 500);
  Bureau.printstatic();
  bureau1.printInstance();
 }
}