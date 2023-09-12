package com.xworkz.engdto.dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {

	
		private int id;
		private String name;
		private String developedBy;
		private String developedAt;
		private String version;
		
		public ApplicationDTO()
		{
			
		}
		
		public ApplicationDTO(int id,String name,String developedBy,String developedAt,String version)
		{
			this.id=id;
			this.name=name;
			this.developedBy=developedBy;
			this.developedAt=developedAt;
			this.version=version;
		}

		@Override
		public boolean equals(Object obj) {
			System.out.println("Running equals in "+this.getClass().getSimpleName());
			if(obj!=null) {
				if(obj instanceof ApplicationDTO)
				{
					ApplicationDTO casted=(ApplicationDTO)obj;
					if(this.getId()==casted.id && this.getName().equals(casted.name) && this.getDevelopedBy().equals(casted.developedBy)
							&& this.getDevelopedAt().equals(casted.developedAt) && this.getVersion().equals(casted.version))
					{
						System.err.println("Instance are same "+casted);
						return true;
					}
		
				}
			}
			
			return super.equals(obj);
		}
		
		@Override
		public String toString() {
			return "ApplicationDTO [id=" + id + ", name=" + name + ", developedBy=" + developedBy + ", developedAt="
					+ developedAt + ", version=" + version + "]";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDevelopedBy() {
			return developedBy;
		}

		public void setDevelopedBy(String developedBy) {
			this.developedBy = developedBy;
		}

		public String getDevelopedAt() {
			return developedAt;
		}

		public void setDevelopedAt(String developedAt) {
			this.developedAt = developedAt;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
		


	}


