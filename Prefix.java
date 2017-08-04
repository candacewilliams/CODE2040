import java.util.ArrayList;
public class Prefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]array = {"850gWJwO","8508kt9L","850QdaY9","933qsVwz","850Th5hA","786SI3Bf"};
		String prefix = "850";
		ArrayList<String> no_prefix = new ArrayList<String>();


		for(int i=0; i < array.length; i++) { //check each string
			no_prefix.add(array[i]);
			if(array[i].startsWith(prefix)){
				no_prefix.remove(array[i]);
			}
		}
		System.out.println("The New Array is " + no_prefix);
	}
}

