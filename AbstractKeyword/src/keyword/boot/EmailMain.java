package keyword.boot;

import keyword.app.Email;
import keyword.app.Gmail;

public class EmailMain {
	public static void main(String[] args) {
		System.out.println("Invoking Email in main");
		
		Email mail=new Gmail();
		System.out.println("calling abstract methods");
		mail.deleteEmail();
		mail.markAsRead();
		mail.forward();
		mail.reply();
		mail.archiveEmail();
		
		System.out.println("calling normal methods");
		mail.createAccount();
		mail.sendEmail();
		mail.receiveEmail();
		mail.viewInbox();
		mail.viewSentEmail();
		
	}

}
