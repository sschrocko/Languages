import java.util.ArrayList;

public class Letters {
	ArrayList<String> oneLetter = new ArrayList<String>();
	ArrayList<String> twoLetters = new ArrayList<String>();
	ArrayList<String> threeLetters = new ArrayList<String>();
	ArrayList<String> fourLetters = new ArrayList<String>();
	private String str;
	private String language;
	public Letters (String str, String language) {
		this.str = str;
		this.language = language;
	}
	
	public String getString() {
		return str;
	}
	public String getLanguage() {
		return language;
	}
	
	
}
