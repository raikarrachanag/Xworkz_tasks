class DoorBellRinging{

 public static void main(String[] args)
 {
 
  DoorBell doorbell = new DoorBell();
  System.out.println(doorbell.price);
  System.out.println(doorbell.netWeight);
  System.out.println(doorbell.frequency);
  System.out.println(doorbell.voltage);
  System.out.println(doorbell.electricPower);
  System.out.println(doorbell.wattage);
  System.out.println(doorbell.use);
  
  System.out.println("=====================================================");
  
  DoorBell doorbell1 = new DoorBell(800);
  System.out.println(doorbell1.price);
  
  System.out.println("=====================================================");
  
  DoorBell doorbell2 = new DoorBell(800, 0.300);
  System.out.println(doorbell2.price);
  System.out.println(doorbell2.netWeight);
  
  System.out.println("=====================================================");
  
  DoorBell doorbell3 = new DoorBell(800, 0.300, 480);
  System.out.println(doorbell3.price);
  System.out.println(doorbell3.netWeight);
  System.out.println(doorbell3.frequency);
  
  System.out.println("=====================================================");
  
  DoorBell doorbell4 = new DoorBell(800, 0.300, 480, 120);
  System.out.println(doorbell4.price);
  System.out.println(doorbell4.netWeight);
  System.out.println(doorbell4.frequency);
  System.out.println(doorbell4.voltage);
  
  System.out.println("=====================================================");
  
  DoorBell doorbell5 = new DoorBell(800, 0.300, 480, 120, "AC");
  System.out.println(doorbell5.price);
  System.out.println(doorbell5.netWeight);
  System.out.println(doorbell5.frequency);
  System.out.println(doorbell5.voltage);
  System.out.println(doorbell5.electricPower);
  
  System.out.println("=====================================================");
  
  DoorBell doorbell6 = new DoorBell(800, 0.300, 480, 120, "AC", 200);
  System.out.println(doorbell6.price);
  System.out.println(doorbell6.netWeight);
  System.out.println(doorbell6.frequency);
  System.out.println(doorbell6.voltage);
  System.out.println(doorbell6.electricPower);
  System.out.println(doorbell6.wattage);
  
  System.out.println("=====================================================");
  
  DoorBell doorbell7 = new DoorBell(800, 0.300, 480, 120, "AC", 200, "Signal/Alert");
  System.out.println(doorbell7.price);
  System.out.println(doorbell7.netWeight);
  System.out.println(doorbell7.frequency);
  System.out.println(doorbell7.voltage);
  System.out.println(doorbell7.electricPower);
  System.out.println(doorbell7.wattage);
  System.out.println(doorbell7.use);
  
  System.out.println("=====================================================");
  
  
  }}