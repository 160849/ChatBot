public class TeachersPet extends StudentBot{

	public TeachersPet(String nm)
	{
		super(nm);
	}
	
	public String respondToGreeting(String greeting)
	{
		String afterName;
		String response = super.respondToGreeting(greeting);
		if (greeting.indexOf("name is") >= 0)
		{
			afterName = greeting.substring(greeting.indexOf("name is")+7);
			response += afterName;
		} 
		response += ".\nWhat are we going to do in class today?";
		return response;
	}
	
	
}
