package practice.progatePractice;

import java.util.Scanner;
import java.lang.Math;

public class Main3 {
	
	public static void main(String[] args) {
		System.out.println("数値を入力してください");
		
		// 標準入力を受け付ける
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		// 最高年齢と平均年齢に初期値0を代入
		int maxAge = 0;
		int avgAge = 0;
		
		// 人数分繰り返す
		for (int i = 1; i <= num; i++) {
			System.out.println("名前を入力してください");
			String name = scan.next();
			
			System.out.println("年齢を入力してください");
			int age = scan.nextInt();
			
			System.out.println("身長を入力してください");
			double height = scan.nextDouble();
			
			System.out.println("体重を入力してください");
			double weight = scan.nextDouble();
			
			System.out.println(name + "さんのBMIは" + Math.round(Person.bmi(height, weight)));
			
			// 変数ageが最高年齢の時、更新する
			if (age > maxAge) {
				maxAge = age;
			}
			
			// ageをたす
			avgAge += age;
		}
		
		System.out.println("最年長は" + maxAge + "歳");
		System.out.println("平均年齢は" + (avgAge / num) + "歳");
	}

}
