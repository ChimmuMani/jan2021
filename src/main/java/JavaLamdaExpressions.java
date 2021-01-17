

interface A {
	void show() ;
}
class B implements A {
	public void show() {
		System.out.println("hello inside");
	}
}
public class JavaLamdaExpressions {
	/**
	 * @param args
	 */
	public static void main (String args[]) {
A obj;
//	obj=new A() {  //boilerplate code
//			public void show() {
//				System.out.println("hello inside A impl");
//			}
//		};
        //obj=()->{System.out.println("hello A lamda");};
obj=()->System.out.println("Hello  removed bolerplacte code");
        
		obj.show();
	}

}
