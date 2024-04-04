
/*Q3:Write a Java Program to count the number of words in a string using HashMap.*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class wordcount {
	public static void main(String[] args) {

		String str = new String();
		int count = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.nextLine();

		Map<String, Integer> hashMap = new HashMap<>();

		String[] words = str.split(" ");

		for (String word : words) {
			count++;
			Integer integer = hashMap.get(word);

			if (integer == null)

				hashMap.put(word, 1);

			else {

				hashMap.put(word, integer + 1);
			}
		}
		System.out.println(hashMap);
		System.out.println("Total no of words in string are: " + count);
	}
}
