
package javaprep;

public class Singleton {

		
	 static Singleton instance = null;
	
	//constructor
	 protected Singleton() {
		   System.out.println("created");
	 }
	   //to make thread safe synchronized added
	 public static synchronized Singleton getInstance() {
	      if(instance == null) {
	         instance = new Singleton();
	         //System.out.println("created");
	      }
	      return instance;
	   }
	   
	   public static void main(String[] args){
	     
		   getInstance();
		   getInstance();
		   getInstance();
		   getInstance();
		   getInstance();
		   getInstance();
		   
		   //output will be only one "created" term, not 6 many
		   				   
	   }
}
