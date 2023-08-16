package keyword.app;

public abstract class Instagram {
	
	//normal methods
	public void login() {
		System.out.println("this is an login method");
	}
	public void logout() {
		System.out.println("this is an logout method");
	}
	public void post() {
		System.out.println("this is an post method");
	}
	public void likePost() {
		System.out.println("this is an like post method");
	}
	public void commentOnPost() {
		System.out.println("this is an login method");
	}
	
	//abstract methods
	
	public abstract void followUser();
	
	public abstract void viewFeed();
	
	public abstract void sendMessage();
	
	public abstract void viewProfile();
	
	public abstract void acceptRequest();
}