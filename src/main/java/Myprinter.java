

interface parser{
	String parse(String p);
}
class  convert{
	 public static String coL(String s) {
		
		 return  s.toUpperCase();
	 }
}
class printer{
	public void printc(String str,parser p) {
		
		System.out.println("hello");
	}
}

public class Myprinter {

	public static void main(String[] args) {
		String str="abc";
		printer p=new printer();
		p.printc(str, new parser() {
		public String parse(String p) {
			return convert.coL(p);
		}
		});
		
		
		p.printc(str,(String p1)->convert.coL(p1));
		p.printc(str,convert::coL);

	}

}
