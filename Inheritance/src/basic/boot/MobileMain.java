package basic.boot;

import basic.app4.Android;
import basic.app4.FlipPhone;
import basic.app4.Landline;
import basic.app4.Mobile;
import basic.app4.Smartphone;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.MobileMethod();
		System.out.println("-------------------");

		Smartphone smart = new Smartphone();
		Mobile smart1 = new Smartphone();
		smart.MobileMethod();
		smart.SmartMethod();
		System.out.println("-------------------");

		Android android = new Android();
		Mobile android2 = new Android();
		android.androidMethod();
		android.MobileMethod();
		System.out.println("-------------------");

		FlipPhone flip = new FlipPhone();
		Mobile flip1 = new FlipPhone();
		flip.MobileMethod();
		flip.flipPhoneMethod();
		System.out.println("-------------------");

		Landline phone = new Landline();
		Mobile phone2 = new Landline();
		phone.MobileMethod();
		phone.LandlineMethod();
		System.out.println("-------------------");
}
}
