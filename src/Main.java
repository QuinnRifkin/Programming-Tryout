
public class Main {

	public static void main(String[] args) {
		System.out.println(args[0]);
		String rev = "";
		for( int i = args[0].length() - 1; i >= 0; i --){
			rev += args[0].charAt(i);
		}
		System.out.println(rev);
		System.out.println(rev.length());
		int x = Integer.parseInt(args[1]);
		System.out.println(x % 10);
		

	}

}
