import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;


public class VariableTypes {

	
	/** static variable only have one copy of the variable(s) shared with all instances of the class.
	 *  every object shares the one and only copy of that class(aka static) variable – 
	 *  and any changes made to that copy are seen by all of the objects of that class. 
	 * */
	static int  staticVariable = 0;
	
	/**Instance variables belong to an instance of a class. 
	 * Another way of saying that is instance variables belong to an object, 
	 * since an object is an instance of a class. 
	 * Every object has it’s own copy of the instance variables.
	 * */
	int instanceVariable = 0;
	
	
	
	/**Final member variable must be initialized at the time of declaration or inside constructor, 
	 * 
	 * failure to do so will result in compilation error.
	 * making a collection reference variable final means only reference can not be changed 
	 * but you can add, remove or change object inside collection. For example:
	 * private final List Loans = new ArrayList();
     * list.add(“home loan”);  //valid
     * list.add("personal loan"); //valid
     * loans = new Vector();  //not valid 


Read more: http://javarevisited.blogspot.com/2011/12/final-variable-method-class-java.html#ixzz3vVHApU7L


Read more: http://javarevisited.blogspot.com/2011/12/final-variable-method-class-java.html#ixzz3vVGmFOzG
    http://javarevisited.blogspot.com/2011/12/final-variable-method-class-java.html#ixzz3vVFfKQ9p*/
	final int finalVariable = 0;
	
	
	// static variable  can be accessed by static or nonstatic method
	public static void bar(){
		System.out.println(staticVariable);
	}
	
	//yet nonstatic(instance) variable can be accessed ONLY by nonstatic method 
	//even you can not write in the main !!!!
	public  void foo(){
		System.out.print(instanceVariable);
	}
	
	public void increaseStaticVarAndPrint() {
		++staticVariable; 
		System.out.println("static variable: "+ staticVariable);
	}
	
	public void increaseNONStaticVarAndPrint() {
		++instanceVariable;
		System.out.println("instance variable: " + instanceVariable);
	}
 	
	public static void main(String[] args) {
		VariableTypes sam = new VariableTypes();
		VariableTypes sam1 = new VariableTypes();
		VariableTypes sam2 = new VariableTypes();
		VariableTypes sam3 = new VariableTypes();
		VariableTypes sam4 = new VariableTypes();
		VariableTypes sam5 = new VariableTypes();
	
		
		
		/** static variable only have one copy of the variable(s) shared with all instances of the class.
		 *  every object shares the one and only copy of that class(aka static) variable – 
		 *  and any changes made to that copy are seen by all of the objects of that class. 
		 * */
		sam.increaseStaticVarAndPrint();// prints 1
		sam1.increaseStaticVarAndPrint();//prints 2
		sam2.increaseStaticVarAndPrint();//prints 3
		sam3.increaseStaticVarAndPrint();//prints 4
		sam4.increaseStaticVarAndPrint();//5
		sam5.increaseStaticVarAndPrint();//6
		sam.increaseStaticVarAndPrint();//7
		sam.increaseStaticVarAndPrint();//8
		sam.increaseStaticVarAndPrint();//9
		
		
		
		/**Instance(NONSTATIC) variables belong to an instance of a class. 
		 * Another way of saying that is instance variables belong to an object, 
		 * since an object is an instance of a class. 
		 * Every object has it’s own copy of the instance variables.
		 * */
		
		sam.increaseNONStaticVarAndPrint();//1
		sam1.increaseNONStaticVarAndPrint();//1
		sam2.increaseNONStaticVarAndPrint();//1
		sam3.increaseNONStaticVarAndPrint();//1
		sam4.increaseNONStaticVarAndPrint();//1
		sam5.increaseNONStaticVarAndPrint();//1
		sam.increaseNONStaticVarAndPrint();//2
		sam.increaseNONStaticVarAndPrint();//3
		sam.increaseNONStaticVarAndPrint();//4
		

		
		/** instance variaBle can not be written here, as main is static*/
		//instanceVariable = 6; 
		
		
		
		final ArrayList Loans = new ArrayList();
		Loans.add("home loan");  //valid
		Loans.add("personal loan"); //valid
	    //Loans = new Vector();  //not valid her turlu calismiyor anlamadim


		
	
		
		
	}
	
	
}
