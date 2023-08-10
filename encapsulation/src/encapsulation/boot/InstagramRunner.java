package encapsulation.boot;

import encapsulation.app.Instagram;

public class InstagramRunner {
		
		public static void main(String[] args) {
			
			Instagram instagram=new Instagram();
			instagram.setBio("Be Positive");
			instagram.setBusinessAccount(true);
			instagram.setEmail("acchu@gmail.com");
			instagram.setFollowersCount(1090);
			instagram.setFollowingCount(500);
			instagram.setFullName("Archana Naik");
			instagram.setNoOfBlocked(4);
			instagram.setPhoneNumber(9878789898l);
			instagram.setPostsCount(50);
			instagram.setPublic(false);
			instagram.setSponsored(true);
			instagram.setUsername("archana_nk22");
			instagram.setVerified(false);
			instagram.setWebsite("www.insta/archana_nk.com");
			
			System.out.println(instagram.getBio());
			System.out.println(instagram.getEmail());
			System.out.println(instagram.getFollowersCount());
			System.out.println(instagram.getFollowingCount());
			System.out.println(instagram.getFullName());
			System.out.println(instagram.getNoOfBlocked());
			System.out.println(instagram.getPhoneNumber());
			System.out.println(instagram.getPostsCount());
			System.out.println(instagram.getUsername());
			System.out.println(instagram.getWebsite());
			System.out.println(instagram.isBusinessAccount());
			System.out.println(instagram.isPublic());
			System.out.println(instagram.isSponsored());
			System.out.println(instagram.isVerified());
			
			
		}

	}


