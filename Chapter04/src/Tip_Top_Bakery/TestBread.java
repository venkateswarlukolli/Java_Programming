package Tip_Top_Bakery;
/**
 * Project:  Java Programming
 * Package:  Tip_Top_Bakery
 * File:  TestBread
 * Created by Kimberly Henry <kimbelry.henry@outlook.com>
 * On 18-Jun-2014
 * At: 7:05 PM
 */
public class TestBread
	{
		public static void main(String[] args)
			{
				Bread test001 = new Bread("Wheat", 256);
				System.out.println("Bread Type: " + test001.getTypeBread());
				System.out.println("Bread Calories: " + test001.getCaloriesBread());
				System.out.println(Bread.MOTTO);
				System.out.println();
				Bread test002 = new Bread("White", 89);
				System.out.println("Bread Type: " + test002.getTypeBread());
				System.out.println("Bread Calories: " + test002.getCaloriesBread());
				System.out.println(Bread.MOTTO);
				System.out.println();
				Bread test003 = new Bread("Sourdough", 185);
				System.out.println("Bread Type: " + test003.getTypeBread());
				System.out.println("Bread Calories: " + test003.getCaloriesBread());
				System.out.println(Bread.MOTTO);
			}
	}
