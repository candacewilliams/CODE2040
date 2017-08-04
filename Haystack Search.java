public class Haystack_Search {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]haystack = {"ko7pC","SE4NH","XleTN","SYb0a","xfvG5","MJ8w6","ggrVJ","t0Kbq","iyZ8q","tlEvP","7TbW6","QAeDe","r1TDC","DkiwN","7Ie6I","YTegg","CwxYW","4M009","fTV7Z","K1fC9"};
		String needle = "7Ie6I";
		int index=0;

		for(int i=0; i < haystack.length; i++) {
			if (needle.equals(haystack[i])){
				System.out.println("The index is " + index);
			}
			index++;
		}
	}
}
