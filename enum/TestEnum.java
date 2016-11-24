public enum TestEnum{
	
	A("A"),B("B");
	private String name;
	TestEnum(String name){
		this.name = name;
	}
	
	enum InnerEnum{
		;
	}
	
	abstract class InnerClass{
		
	}
	
	interface InnerInterface{
		
	}
}