import java.util.Scanner;
import java.util.*;
import java.awt.*;


public class RepeatAdditionQuiz {
	static ArrayList<Integer> store;

	public static void main(String[] args){
		store=new ArrayList<>();
		
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		
		Scanner input=new Scanner(System.in);

		System.out.print("What is " + number1 + "+" + number2 + "?");
		int answer=input.nextInt();
		store.add(answer);
		
		while(number1 + number2!=answer){
			System.out.print("Wrong answer. Try again. What is " + number1 + "+" + number2 + "?");
			answer=input.nextInt();

			if(store.contains(answer))
				System.out.println("You already entered " + answer);
			else
				store.add(answer);
		}
		System.out.println("You got it!");
	}
}
