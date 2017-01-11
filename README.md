# Assignment 1
Program for java
Command prompt string



package Pack;

public class Command_Prompt
{

	public static void main(String[] args)
	{
		String str = "Rahul is Dump,stupid,Rascal,nonsence";
		System.out.println(str.replaceAll(
				badwords("Stupid","Nonsence","Rascal","Dump"),"*"));
	}

	public static String badwords(String... words) {
		String re = "";
		for (String w : words)
			for (int i = 0; i < w.length(); i++)
				re += String.format("|((?<=%s)%s(?=%s))", w.substring(0, i),
						w.charAt(i), w.substring(i + 1));
		return re.substring(1);

	}

}
