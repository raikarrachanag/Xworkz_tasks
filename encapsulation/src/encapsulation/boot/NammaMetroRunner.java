package encapsulation.boot;

import encapsulation.app.NammaMetro;

public class NammaMetroRunner{ 
		
		
		    public static void main(String[] args) {
		        
		        NammaMetro nammaMetro = new NammaMetro();

		       
		        nammaMetro.setPassengerName("Archana Naik");
		        nammaMetro.setMetroOperator("Namma Metro");
		        nammaMetro.setSourceStation("Station A");
		        nammaMetro.setDestinationStation("Station B");
		        nammaMetro.setTravelDate("2023-08-15");
		        nammaMetro.setEntryTime("08:00 AM");
		        nammaMetro.setExitTime("09:00 AM");
		        nammaMetro.setCoachNumber("C123");
		        nammaMetro.setSeatNumber(12);
		        nammaMetro.setFareAmount(30.0);
		        nammaMetro.setPeakHour(true);
		        nammaMetro.setRoundTrip(false);
		        nammaMetro.setPassengerRated(true);

		        
		        System.out.println("Passenger Name: " + nammaMetro.getPassengerName());
		        System.out.println("Metro Operator: " + nammaMetro.getMetroOperator());
		        System.out.println("Source Station: " + nammaMetro.getSourceStation());
		        System.out.println("Destination Station: " + nammaMetro.getDestinationStation());
		        System.out.println("Travel Date: " + nammaMetro.getTravelDate());
		        System.out.println("Entry Time: " + nammaMetro.getEntryTime());
		        System.out.println("Exit Time: " + nammaMetro.getExitTime());
		        System.out.println("Coach Number: " + nammaMetro.getCoachNumber());
		        System.out.println("Seat Number: " + nammaMetro.getSeatNumber());
		        System.out.println("Fare Amount: " + nammaMetro.getFareAmount());
		        System.out.println("Is Peak Hour: " + nammaMetro.isPeakHour());
		        System.out.println("Is Round Trip: " + nammaMetro.isRoundTrip());
		        System.out.println("Is Passenger Rated: " + nammaMetro.isPassengerRated());
		    }
		}


