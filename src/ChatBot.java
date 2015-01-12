
public abstract class ChatBot {

	public static String readInput(String prompt)
	{
		return prompt;
	}
	
	private String name;
	public ChatBot(String nm)
	{
		name = nm;
	}
	
	public String getName()
	{
		return name;
	}
	
	public abstract String respondToGreeting(String greeting);
	
	
}
