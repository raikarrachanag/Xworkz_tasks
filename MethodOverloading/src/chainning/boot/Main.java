package chainning.boot;

import chainning.app.Elevator;
import chainning.app.Gadget;
import chainning.app.Hotel;
import chainning.app.IronBox;
import chainning.app.Ladder;
import chainning.app.Mouse;
import chainning.app.Plier;
import chainning.app.Specs;
import chainning.app.Stepler;
import chainning.app.Umbrella;

public class Main{

		public static void main(String[] args) {
			
			System.out.println("Calling Main...........");

			Hotel hotel = new Hotel();
			hotel.management();
			
			System.out.println("------------------------------------");
			
			IronBox box=new IronBox();
			box.smoothsCloth(89);
			
			System.out.println("------------------------------------");
			
			Specs specs=new Specs();
			specs.lens(3);
			
			System.out.println("------------------------------------");
			
			Umbrella umbrella=new Umbrella();
			umbrella.protects("Sun", "WineRed");
			
			System.out.println("------------------------------------");
			
			Stepler stepler=new Stepler();
			stepler.steples();
			
			System.out.println("------------------------------------");
			
			Ladder ladder=new Ladder();
			ladder.ladderTypes();
			
			System.out.println("------------------------------------");
			
			Gadget gadget=new Gadget();
			gadget.run("CAR");
			
			System.out.println("------------------------------------");
			
			Plier plier=new Plier();
			plier.cuts();
			
			System.out.println("------------------------------------");
			
			Mouse mouse=new Mouse();
			mouse.moves();
			
			System.out.println("------------------------------------");
			
			Elevator elevator=new Elevator();
			elevator.movement(10);
		}

	}


