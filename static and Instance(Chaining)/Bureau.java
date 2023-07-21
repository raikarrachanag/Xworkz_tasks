class Bureau{

 static String agencyName;
 static String countryLicense;
 String topAgencyName;
 float registrationFees;
 
 Bureau()
 {
	 super();
	 System.out.println("Invoking Const of Bureau");
 }
 
 Bureau(String agencyName, String countryLicense)
 {
	 System.out.println("Invoking String, String Const of Bureau");
	 this.agencyName=agencyName;
	 this.countryLicense=countryLicense;
 }
 
 Bureau(String agencyName, String countryLicense, String topAgencyName, float registrationFees)
 {
	 System.out.println("Invoking String, float Const of Bureau");
	 this.agencyName=agencyName;
	 this.countryLicense=countryLicense;
	 this.topAgencyName=topAgencyName;
	 this.registrationFees=registrationFees;
 }
 
 static void printstatic()
 {
	 System.out.println("Invoking main in Bureau");
	 System.out.println(agencyName);
	 System.out.println(countryLicense);
	 
 }
 
 void printInstance()
 {
	 System.out.println("Invoking main in Bureau");
	 System.out.println(topAgencyName);
	 System.out.println(registrationFees);
	 
 }
 }