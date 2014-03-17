package vo;
public class Employee {
	
   private int id;
   private String name; 
   private String company;   
   private String designation;  
   private int expYears;
   
   public Employee() {}

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
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public int getExpYears() {
		return expYears;
	}
	
	public void setExpYears(int expYears) {
		this.expYears = expYears;
	}
   
   

}