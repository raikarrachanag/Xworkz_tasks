package encapsulation.boot;

import encapsulation.app.FaceBook;

public class FaceBookRunner {


		public static void main(String[] args) {

			FaceBook faceBook = new FaceBook();

			faceBook.setUsername("archanaNaik22");
			faceBook.setFullName("Archana Naik ");
			faceBook.setFriendsCount(500);
			faceBook.setFollowersCount(1000);
			faceBook.setPostsCount(50);
			faceBook.setPrivate(false);
			faceBook.setBio("Hello, I'm Archana!");
			faceBook.setLocation("Rajajinagar, Bangalore");
			faceBook.setEmail("archana@facebook.com");
			faceBook.setPhoneNumber("8979898999");
			faceBook.setProfilePictureURL("http://example.com/profile.jpg");
			faceBook.setVerified(true);
			faceBook.setTimelineEnabled(true);
			faceBook.setTaggingAllowed(true);

			// Getting values using getter methods
			System.out.println("Username: " + faceBook.getUsername());
			System.out.println("Full Name: " + faceBook.getFullName());
			System.out.println("Friends Count: " + faceBook.getFriendsCount());
			System.out.println("Followers Count: " + faceBook.getFollowersCount());
			System.out.println("Posts Count: " + faceBook.getPostsCount());
			System.out.println("Is Private: " + faceBook.isPrivate());
			System.out.println("Bio: " + faceBook.getBio());
			System.out.println("Location: " + faceBook.getLocation());
			System.out.println("Email: " + faceBook.getEmail());
			System.out.println("Phone Number: " + faceBook.getPhoneNumber());
			System.out.println("Profile Picture URL: " + faceBook.getProfilePictureURL());
			System.out.println("Is Verified: " + faceBook.isVerified());
			System.out.println("Is Timeline Enabled: " + faceBook.isTimelineEnabled());
			System.out.println("Is Tagging Allowed: " + faceBook.isTaggingAllowed());
		}

	}

