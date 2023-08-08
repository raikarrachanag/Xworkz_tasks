package overloading.boot;

import overloading.app.Amoeba;
import overloading.app.Bangle;
import overloading.app.BassDrum;
import overloading.app.BrainEatAmoeba;
import overloading.app.Charcoal;
import overloading.app.Coal;
import overloading.app.Dinosur;
import overloading.app.Drum;
import overloading.app.Gate;
import overloading.app.MetalBangle;
import overloading.app.MetalGate;
import overloading.app.Mic;
import overloading.app.Onithopods;
import overloading.app.PVR;
import overloading.app.PoleFlex;
import overloading.app.ReservationTicket;
import overloading.app.Speaker;
import overloading.app.Theater;
import overloading.app.Ticket;


public class Main {

		public static void main(String[] args) {
			
			
			Coal coal=new Charcoal();
			coal.burns();//Call Method of sub Class
			
			System.out.println("----------------------");
			
			Amoeba amoeba=new BrainEatAmoeba();
			amoeba.movement();
			
			System.out.println("----------------------");
			
			Bangle bangle=new MetalBangle();
			bangle.polish();
			
			System.out.println("----------------------");
			
			Gate gate=new MetalGate();
			gate.close();
			
			System.out.println("----------------------");
			
			Dinosur dinosur=new Onithopods();
			dinosur.roar();
			
			System.out.println("----------------------");
			
			PoleFlex flex=new PoleFlex();
			flex.display();
			
			System.out.println("----------------------");
			
			Drum drum=new BassDrum();
			drum.vibrate();
			
			System.out.println("----------------------");
			
			Theater pvr=new PVR();
			pvr.show();
			
			System.out.println("----------------------");
			
			Ticket reservationTicket=new ReservationTicket();
			reservationTicket.displayBill();
			
			System.out.println("----------------------");
			
			Mic mic=new Speaker();
			mic.sound();
			
		}

	}


