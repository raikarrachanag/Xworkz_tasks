package encapsulation.boot;

import encapsulation.app.Amazon;

public class AmazonRunner {

	public static void main(String[] args) {
		Amazon amazon=new Amazon();
		amazon.setProductName("Pencil");
		amazon.setProductPrice(80);
		amazon.setProductColor("Grey");
		amazon.setProductType("Tool");
		amazon.setDeliveryDate("Aug 5th 2023");
		amazon.setShippingDate("Aug 3rd 2023");
		amazon.setShippingAdress("Davangere");
		amazon.setDeliveryAddress("Davangere");
		amazon.setSellerName("Devayani");
		amazon.setProductGstNo(8888);
		amazon.setOrderDate("Aug 1st 2023");
		amazon.setisProductIsGiftWrapped(false);
		amazon.setCustomerName("Rachana");
		amazon.setCustomerEmail("rachana@gmail.com");
		
		System.out.println(amazon.getProductName());
		System.out.println(amazon.getProductPrice());
		System.out.println(amazon.getProductColor());
		System.out.println(amazon.getCustomerName());
		System.out.println(amazon.getProductType());
		System.out.println(amazon.getDeliveryDate());
		System.out.println(amazon.getShippingDate());
		System.out.println(amazon.getDeliveryAddress());
		System.out.println(amazon.getSellerName());
		System.out.println(amazon.getProductGstNo());
		System.out.println(amazon.getOrderDate());
		System.out.println(amazon.getisProductIsGiftWrapped());
		System.out.println(amazon.getCustomerName());
		System.out.println(amazon.getCustomerEmail());
		
	}
}
