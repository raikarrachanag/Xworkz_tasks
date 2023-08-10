package encapsulation.boot;

import encapsulation.app.LinkedIn;

public class LinkedInRunner {
	
		    public static void main(String[] args) {
		        
		        LinkedIn linkedin = new LinkedIn();

		       
		        linkedin.setFullName("Rachana G Raikar");
		        linkedin.setHeadline("B. E in Computer Science");
		        linkedin.setCurrentJob("Fresher");
		        linkedin.setCompany("Not Applicable");
		        linkedin.setLocation("Banglore");
		        linkedin.setConnectionsCount(244);
		        linkedin.setSummary("Seeking for a job which is challenging and Interesting as Software Engineer");
		        linkedin.setIndustry("Information and Technology");
		        linkedin.setEmail("rachanagraikar@gmail.com");
		        linkedin.setPhoneNumber(8431882167l);
		        linkedin.setProfilePictureURL("http:/rachana.jpg");
		        linkedin.setPremiumMember(true);
		        linkedin.setJobSeeker(true);
		        linkedin.setVisibilityLimited(false);

		     
		        System.out.println("Channel Name: " + linkedin.getFullName());
		        System.out.println("Owner Name: " + linkedin.getHeadline());
		        System.out.println("Subscribers Count: " + linkedin.getCurrentJob());
		        System.out.println("Videos Count: " + linkedin.getCompany());
		        System.out.println("Verified: " + linkedin.getLocation());
		        System.out.println("About: " + linkedin.getConnectionsCount());
		        System.out.println("Country: " + linkedin.getSummary());
		        System.out.println("Join Date: " + linkedin.getIndustry());
		        System.out.println("Monetized: " + linkedin.getEmail());
		        System.out.println("Website: " + linkedin.getPhoneNumber());
		        System.out.println("Live Streaming Enabled: " + linkedin.getProfilePictureURL());
		        System.out.println("Comments Enabled: " + linkedin.isPremiumMember());
		        System.out.println("Notifications Enabled: " + linkedin.isJobSeeker());
		        System.out.println("Subtitles Enabled: " + linkedin.isVisibilityLimited());
		    }
		}

