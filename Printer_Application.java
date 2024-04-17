import java.util.Scanner;
interface Printer{
	void getPrint();
}

class ColorPrint implements Printer{
	public void getPrint() {
		System.out.println("Your color prints are ready........");
	}
}

class BlackAndWhite implements Printer{
	public void getPrint() {
		System.out.println("Your black & white prints are ready.....");
		
	}
}

class JumboPrint implements Printer{
	public void getPrint() {
		System.out.println(" Your jumbo prints are ready......");
		
	}
} 

public class Printer_Application {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Which Prints you have to print.......");
		String PrinterMachine=sc.next();
		
		Printer p1=null;
		
		if(PrinterMachine.equalsIgnoreCase("colorprint")) {
			p1=new ColorPrint();
			
		}
		else if(PrinterMachine.equalsIgnoreCase("blackandwhite")) {
            p1=new BlackAndWhite ();			
		}
		else if(PrinterMachine.equalsIgnoreCase("JumboPrint")) {
			p1= new JumboPrint();
		}
	
	    if(p1!=null) {
	    	p1.getPrint();
	    	
	    }
	    else {
	    	System.out.println("Prints are not available.....");
	    }
		
		
		
	}

}
