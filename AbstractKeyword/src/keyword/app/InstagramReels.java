package keyword.app;

public class InstagramReels extends Instagram{

	@Override
	public void followUser() {
		System.out.println("This is an abstract method -followUser");
		
	}

	@Override
	public void viewFeed() {
		System.out.println("This is an abstract method -viewFeed");
		
	}

	@Override
	public void sendMessage() {
		System.out.println("This is an abstract method -sendMessage");
		
	}

	@Override
	public void viewProfile() {
		System.out.println("This is an abstract method -viewProfile");
	}

	@Override
	public void acceptRequest() {
		System.out.println("This is an abstract method -acceptRequest");
		
	}
	
	

}