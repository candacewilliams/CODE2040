//import java.util.Scanner;
public class String_Reverse {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Scanner input = new Scanner (System.in);
	        String API = "yw0VJ"; //input.next(); --> to enter any string 
	        String reverse = "";
	        for(int i=API.length()-1; i>=0; i--)
	            reverse += API.charAt(i);
	        System.out.println(reverse);        
	    }
	}
