package keyword.app;

public class Gmail extends Email {

	@Override
	public void deleteEmail() {
		System.out.println("This is an abstarct method-deletEmail");

	}

	@Override
	public void archiveEmail() {
		System.out.println("This is an abstarct method-archiveEmail");

	}

	@Override
	public void markAsRead() {
		System.out.println("This is an abstarct method-markAsRead");

	}

	@Override
	public void reply() {
		System.out.println("This is an abstarct method-reply");

	}

	@Override
	public void forward() {
		System.out.println("This is an abstarct method-forward");
	}

}
