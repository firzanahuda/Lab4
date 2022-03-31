import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class LanguageGenerator {
	
	 public String getWord() {
	
	 Map<String, String> dictionary = new HashMap<String, String>();
	    dictionary.put("Good", "Selamat");
	    dictionary.put("Morning", "Pagi");
	    dictionary.put("Night", "Malam");
	    dictionary.put("How are", "apa");
	    dictionary.put("you?", "khabar?");
	    dictionary.put("Thank", "Terima");
	    dictionary.put("you", "kasih");
	    dictionary.put("Goodbye", "لسلامة مع");
	    dictionary.put("What's", "ada");
	    dictionary.put("up", "apa");
	    
	    String translate = "What's up";
	    StringBuilder result = new StringBuilder();

	    StringTokenizer st = new StringTokenizer(translate, " ");
	    while (st.hasMoreTokens()) {
	        String key = st.nextToken();
	        String translatedWord = dictionary.get(key);
	        if (translatedWord != null) {
	            result.append(translatedWord);
	        } else {
	            result.append("" + key + ""); // Unknown word
	        }
	        result.append(" ");
	    }
	    
	    String singleString = result.toString();
		return singleString;

	 }
}