package com.boot;

import com.app.MilitaryMilitaryRules;
import com.impl.MilitaryRules;

public class MilitaryMain {


		public static void main(String[] args) {
			MilitaryRules militaryRules=new MilitaryMilitaryRules();
			System.out.println("Wear Uniform : "+militaryRules.wearUniform());
			System.out.println("UNIT NUMBER : "+militaryRules.unitNumber());
			System.out.println("Service : "+militaryRules.service());
			}

	}
