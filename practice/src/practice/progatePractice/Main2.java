package practice.progatePractice;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("高さを入力してください：");
		double height = scanner.nextDouble();
		
		System.out.print("底辺を入力してください：");
		double bottom = scanner.nextDouble();
		System.out.println(areaRec(height, bottom));

	}
	
	public static double areaRec(double height, double bottom) {
		double area = height * bottom / 2;
		return area;
	}

}
