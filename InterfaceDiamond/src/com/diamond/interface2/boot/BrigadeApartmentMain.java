package com.diamond.interface2.boot;

import com.diamond.interface2.app.ApartmentRule;
import com.diamond.interface2.app.BuildApartment;
import com.diamond.interface2.app.CommonApartment;
import com.diamond.interface2.app.PurchaseApartment;
import com.diamond.interface2.impl.BrigadeApartment;

public class BrigadeApartmentMain {
	

		public static void main(String[] args) {
			ApartmentRule apartmentRule =  new BrigadeApartment();
			apartmentRule.construct();

			BuildApartment apartment = new BrigadeApartment();
			apartment.construct();

			PurchaseApartment apartment2 = new BrigadeApartment();
			apartment2.construct();

			CommonApartment apartment3 = new BrigadeApartment();
			apartment3.construct();

			System.out.println("--------------StringBuilder ------------------------");

			StringBuilder builder = new StringBuilder("Banglore");
			System.out.println(builder);

			System.out.println(builder.append("ians"));

			System.out.println(builder.deleteCharAt(11));

			System.out.println(builder.insert(1, 1));

			System.out.println(builder.reverse());

			System.out.println("--------------StringBuffer ------------------------");

			StringBuffer buffer = new StringBuffer("X-Workz-");
			System.out.println(buffer.append(2));
			System.out.println(buffer.indexOf("W"));
			System.out.println(buffer.length());

			System.out.println(buffer.append(true));

			System.out.println(buffer.deleteCharAt(8));

		}

}
