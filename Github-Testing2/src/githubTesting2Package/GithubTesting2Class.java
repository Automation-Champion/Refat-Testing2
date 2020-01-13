package githubTesting2Package;

public class GithubTesting2Class {

	static String rate;
	static String hour;
	String totalmoney;
	String yearly;

	public static void main(String[] args) {
		GithubTesting2Class obj = new GithubTesting2Class();
		obj.method1();
	}

	public void method1() {
		rate = "23";
		hour = "7";
		System.out.println(rate + hour);

	}

}
