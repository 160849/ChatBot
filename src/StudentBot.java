public class StudentBot extends ChatBot{

	public StudentBot(String nm)
	{
		super(nm);
	}
	public String respondToGreeting(String greeting)
	{
		String response;
		if (greeting.indexOf("morning")>=0)
			response = "Good morning";
		else if (greeting.indexOf("afternoon")>=0)
			response = "Good afternoon";
		else
			response = "Hello";
		return response;
	}
	
	
}
