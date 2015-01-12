import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TeachersPet pet = new TeachersPet("asd");
		System.out.println(pet.respondToGreeting("Good morning"));
		System.out.println(pet.respondToGreeting("Very cold this afternoon.  My name is Mr. Fog"));
		System.out.println(pet.respondToGreeting("My name is Ms. Blake"));	
		ArrayList<ChatBot> bots = new ArrayList<ChatBot>();
		bots.add(new StudentBot("Ada"));
		bots.add(new TeachersPet("Boris"));
		bots.add(new StudentBot("Charlier"));
		greetAll(bots);
	}

	
	public static void greetAll(ArrayList<ChatBot> bots)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter greeting: ");
		String response = keyboard.nextLine();
		for (int i = 0;i< bots.size();i++)
		{
			System.out.println(bots.get(i).getName()+": "+bots.get(i).respondToGreeting(response));	
		}
	}
}
