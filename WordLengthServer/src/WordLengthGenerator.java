
public class WordLengthGenerator {
	
	/**
	 * This method generates word
	 * 
	 * @return text
	 */
	
	public String getWordLength() {
		
		String text = "Kucing saya suka makan ikan dan juga nasi";
		String length = String.valueOf(count(text));
		
		return length;
		
	}

	public static int count(String text) {
		// TODO Auto-generated method stub
		if(text == null || text.isEmpty()) {
			return 0;
		}
		
		String [] word = text.split("\\s+");
		return word.length;
	}

}
