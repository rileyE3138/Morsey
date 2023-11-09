package Morsey;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Convertor convertor = new Convertor();
		Scanner userInput = new Scanner(System.in);
		String input;
		input = userInput.nextLine();
		System.out.println(convertor.getMorsePhrase(input, true));
		input = userInput.nextLine();
		System.out.println(convertor.getEnglishPhrase(input));
		
	}

}
