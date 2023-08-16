package keyword.app;


public abstract class Email {
	public void createAccount() {
		System.out.println("This is create account method");
	}
	public void sendEmail() {
		System.out.println("This is sendEmail method");
	}
	public void receiveEmail() {
		System.out.println("This is receiveEmail method");
	}
	public void viewInbox() {
		System.out.println("This is viewInbox method");
	}
	public void viewSentEmail() {
		System.out.println("This is viewSentEmail method");
	}
	
	public abstract void deleteEmail();
	public abstract void  archiveEmail();
	public abstract void markAsRead();
	public abstract void reply();
	public abstract void forward();
	
}