package package1;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Malayalam", rs = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rs = ch + rs;

		}
		System.out.println(rs);
	}

}
