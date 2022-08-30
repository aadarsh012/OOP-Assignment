import java.util.*;

class first {

	public static void main(String[] args) {

		int n = args.length;

		String[] str = new String[n];

		str = args;

		Arrays.sort(str);

		for (String st : str) {
			System.out.println(st);
		}
	}
}