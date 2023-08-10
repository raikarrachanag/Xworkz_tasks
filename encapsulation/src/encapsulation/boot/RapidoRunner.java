package encapsulation.boot;

import encapsulation.app.Rapido;

public class RapidoRunner {
	
		    public static void main(String[] args) {
		        
		        Rapido rapido = new Rapido();

		        rapido.setRiderName("Archana");
		        rapido.setCaptainName("Sahana");
		        rapido.setSourceLocation("Green Street");
		        rapido.setDestinationLocation("BTM");
		        rapido.setRideDate("2023-08-15");
		        rapido.setStartTime("09:00 AM");
		        rapido.setEndTime("09:30 AM");
		        rapido.setBikeModel("Pulsar 150");
		        rapido.setLicensePlate("KA01AB1234");
		        rapido.setRideDistance(10.5);
		        rapido.setRideFare(150.0);
		        rapido.setPrimeRide(true);
		        rapido.setSharedRide(false);
		        rapido.setRiderRated(true);

		       
		        System.out.println("Rider Name: " + rapido.getRiderName());
		        System.out.println("Captain Name: " + rapido.getCaptainName());
		        System.out.println("Source Location: " + rapido.getSourceLocation());
		        System.out.println("Destination Location: " + rapido.getDestinationLocation());
		        System.out.println("Ride Date: " + rapido.getRideDate());
		        System.out.println("Start Time: " + rapido.getStartTime());
		        System.out.println("End Time: " + rapido.getEndTime());
		        System.out.println("Bike Model: " + rapido.getBikeModel());
		        System.out.println("License Plate: " + rapido.getLicensePlate());
		        System.out.println("Ride Distance: " + rapido.getRideDistance() + " km");
		        System.out.println("Ride Fare: $" + rapido.getRideFare());
		        System.out.println("Prime Ride: " + rapido.isPrimeRide());
		        System.out.println("Shared Ride: " + rapido.isSharedRide());
		        System.out.println("Rider Rated: " + rapido.isRiderRated());
		    }
		}


