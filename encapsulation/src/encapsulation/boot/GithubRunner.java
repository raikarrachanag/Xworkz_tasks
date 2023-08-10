package encapsulation.boot;

import encapsulation.app.Github;

public class GithubRunner {		
		
		    public static void main(String[] args) {
		        
		        Github gitHub = new Github();

		      
		        gitHub.setUsername("archana22");
		        gitHub.setRepositoryName("JavaPgms");
		        gitHub.setStarsCount(100);
		        gitHub.setForksCount(50);
		        gitHub.setPrivate(false);
		        gitHub.setDescription("My sample gitHub");
		        gitHub.setProgrammingLanguage("Java");
		        gitHub.setOwnerName("Archana Naik");
		        gitHub.setOwnerEmail("archana@github.com");
		        gitHub.setWebsite("http://github.com");
		        gitHub.setHasIssuesEnabled(true);
		        gitHub.setHasProjectsEnabled(true);
		        gitHub.setHasWikiEnabled(false);
		        gitHub.setArchived(false);

		       
		        System.out.println("Username: " + gitHub.getUsername());
		        System.out.println("Repository Name: " + gitHub.getRepositoryName());
		        System.out.println("Stars Count: " + gitHub.getStarsCount());
		        System.out.println("Forks Count: " + gitHub.getForksCount());
		        System.out.println("Is Private: " + gitHub.isPrivate());
		        System.out.println("Description: " + gitHub.getDescription());
		        System.out.println("Programming Language: " + gitHub.getProgrammingLanguage());
		        System.out.println("Owner Name: " + gitHub.getOwnerName());
		        System.out.println("Owner Email: " + gitHub.getOwnerEmail());
		        System.out.println("Website: " + gitHub.getWebsite());
		        System.out.println("Has Issues Enabled: " + gitHub.isHasIssuesEnabled());
		        System.out.println("Has Projects Enabled: " + gitHub.isHasProjectsEnabled());
		        System.out.println("Has Wiki Enabled: " + gitHub.isHasWikiEnabled());
		        System.out.println("Is Archived: " + gitHub.isArchived());
		    }
		}

