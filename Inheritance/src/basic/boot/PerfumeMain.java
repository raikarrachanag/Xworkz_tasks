package basic.boot;

import basic.app8.BellaVita;
import basic.app8.Denver;
import basic.app8.Engage;
import basic.app8.Eva;
import basic.app8.Fogg;
import basic.app8.ParkAvenue;
import basic.app8.Perfume;
import basic.app8.WildStone;
import basic.app8.Yardley;

public class PerfumeMain {
	public static void main(String[] args) {
		System.out.println("Invoking main in Perfume");
		Perfume perfume=new Perfume();
		perfume.perfumeFlavour();
		System.out.println("_____________________________");
		
		Perfume perfume1=new BellaVita();
		BellaVita bv=new BellaVita();
		bv.perfumeFlavour();
		bv.flavour();
		System.out.println("_____________________________");
		
		Denver denver=new  Denver();
		Perfume perfume2=new Denver();
		denver.perfumeFlavour();
		denver.flavour();
		System.out.println("_____________________________");
		
		Engage engage=new  Engage();
		Perfume perfume3=new Engage();
		engage.perfumeFlavour();
		engage.flavour();
		System.out.println("_____________________________");
		
		Eva eva=new  Eva();
		Perfume perfume4=new Eva();
		eva.perfumeFlavour();
		eva.flavour();
		System.out.println("_____________________________");
		
		Fogg fogg=new Fogg();
		Perfume perfume5=new Fogg();
		fogg.perfumeFlavour();
		fogg.flavour();
		System.out.println("_____________________________");
		
		ParkAvenue pa=new ParkAvenue();
		Perfume perfume6=new ParkAvenue();
		pa.perfumeFlavour();
		pa.flavour();
		System.out.println("_____________________________");
		
		WildStone ws=new WildStone();
		Perfume perfume7=new WildStone();
		ws.perfumeFlavour();
		ws.flavour();
		System.out.println("_____________________________");
		
		Yardley yardley=new Yardley();
		Perfume perfume8=new Yardley();
		yardley.perfumeFlavour();
		yardley.flavour();
		System.out.println("_____________________________");
}
}