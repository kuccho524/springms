package practice.progatePractice;

public class Main1 {

	public static void main(String[] args) {
		// nameメソッドを呼び出す
		name("Ryo", 30);
		
		// fullNameメソッドを呼び出す
		String name = fullName("Shinonome", "Miyabi");
		name(name, 32);
		
		// 1行で呼び出す
		name(fullName("Kayama", "Shinya"), 37);
		

	}
	
	public static void name(String name, int age) {
		System.out.println("私の名前は" + name + "です");
		System.out.println("年齢は" + age + "歳です");
	}
	
	public static String fullName(String lastName, String firstName) {
		return lastName + " " + firstName;
	}

}
