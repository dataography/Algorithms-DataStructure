

public class OuterClassForStaticNestedClass {
	
	public void methodInOuterClass() {
		System.out.println("Hello from outer class");
	}

	static class StaticClassInNestedClass{
		
		public void methodInStaticInnerClass(){
			System.out.println("Hello from static inner class");
		}
		
	}
	
	public class InnerClassInNestedClass{
		
		public void methodIn_NON_StaticInnerClass() {
			System.out.println("Hello form non-static inner class");
		}
		
	}
	
	public static void main(String[] args) {
		// calling a metheod in outer class
		OuterClassForStaticNestedClass outer = new OuterClassForStaticNestedClass();
		outer.methodInOuterClass();
        
		// calling a metheod in inner static class
		
		OuterClassForStaticNestedClass.StaticClassInNestedClass outerAndStaticInner = new OuterClassForStaticNestedClass.StaticClassInNestedClass();
		outerAndStaticInner.methodInStaticInnerClass();
		
		//calling a metheod in inner NON static class
		OuterClassForStaticNestedClass.InnerClassInNestedClass outerAndNONStaticInner = outer.new InnerClassInNestedClass();
		outerAndNONStaticInner.methodIn_NON_StaticInnerClass();
		//or also we can write above line as
		OuterClassForStaticNestedClass.InnerClassInNestedClass outerAndNONStaticInner1 = new OuterClassForStaticNestedClass().new InnerClassInNestedClass();
		outerAndNONStaticInner.methodIn_NON_StaticInnerClass();
		
				
	}

}
