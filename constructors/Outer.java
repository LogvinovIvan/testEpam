//Check designers have inner classes
public class Outer{
	
	public Outer(){
		System.out.println("Outer construct was calling");
		
		System.out.println("--------------------------------------");
		
		//For anonymus class required ','
		//Outer outer = new Outer(){
		//};
		
		
		
	}
	
	public void testLocalInner(){
		
		class LocalInner{
			public LocalInner(){
				System.out.println("Local Inner construct was calling");
			}
		}
		
		LocalInner local = new LocalInner();
		
		InnerStatic innerStatic = new InnerStatic(){
			
		};
	}
	
	
	
	public class InnerClass{
			InnerClass(){
				System.out.println("Inner construct was calling");
			}
	}
	
	static class InnerStatic{
		public InnerStatic(){
			System.out.println("Static inner construct was calling");
		}
	}
	
	
	public static void main(String[] args){
		InnerStatic innerStatic = new InnerStatic();
		System.out.println("--------------------------------------");
		
		Outer.InnerClass inner = new Outer().new InnerClass();
		System.out.println("--------------------------------------");
		
		
	}
}