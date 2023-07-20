class TeacherRunner{

public static void main(String[] args)
{
 System.out.println("Invoking main in TeacherRunner");
 
 Teacher teacher=new Teacher();
 System.out.println(teacher.name);
 System.out.println(teacher.subject);
 System.out.println(teacher.salary);
 System.out.println(teacher.age);
 System.out.println(teacher.gender);
 System.out.println("=============================================================================================================");
 
 String name="Sahadev";
 String subject="Maths";
 float salary=18000;
 int age=28;
 String gender="Male";
 
 System.out.println("Print after Re-initializing");
 
 Teacher teacher1=new Teacher();
 System.out.println(name);
 System.out.println(subject);
 System.out.println(salary);
 System.out.println(age);
 System.out.println(gender);
 
 
 }}