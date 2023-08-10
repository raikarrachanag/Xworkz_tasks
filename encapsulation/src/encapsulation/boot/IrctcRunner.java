package encapsulation.boot;

import encapsulation.app.Irctc;

public class IrctcRunner {
		
		    public static void main(String[] args) {
		        
		        Irctc ticket = new Irctc();

		        
		        ticket.setPassengerName("Archana Naik");
		        ticket.setTrainName("Shatabdi Express");
		        ticket.setSourceStation("Mumbai");
		        ticket.setDestinationStation("Karwar");
		        ticket.setJourneyDate("2023-08-15");
		        ticket.setDepartureTime("08:00 AM");
		        ticket.setArrivalTime("10:30 AM");
		        ticket.setSeatNumber(12);
		        ticket.setCoachType("AC Chair Car");
		        ticket.setBookingStatus("Confirmed");
		        ticket.setTicketType("E-Ticket");
		        ticket.setSleeper(false);
		        ticket.setAC(true);
		        ticket.setTatkalBooking(false);

		       
		        System.out.println("Passenger Name: " + ticket.getPassengerName());
		        System.out.println("Train Name: " + ticket.getTrainName());
		        System.out.println("Source Station: " + ticket.getSourceStation());
		        System.out.println("Destination Station: " + ticket.getDestinationStation());
		        System.out.println("Journey Date: " + ticket.getJourneyDate());
		        System.out.println("Departure Time: " + ticket.getDepartureTime());
		        System.out.println("Arrival Time: " + ticket.getArrivalTime());
		        System.out.println("Seat Number: " + ticket.getSeatNumber());
		        System.out.println("Coach Type: " + ticket.getCoachType());
		        System.out.println("Booking Status: " + ticket.getBookingStatus());
		        System.out.println("Ticket Type: " + ticket.getTicketType());
		        System.out.println("Is Sleeper: " + ticket.isSleeper());
		        System.out.println("Is AC: " + ticket.isAC());
		        System.out.println("Is Tatkal Booking: " + ticket.isTatkalBooking());
		    }
		}


