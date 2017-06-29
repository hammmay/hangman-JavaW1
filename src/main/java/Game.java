public class Game {

  public String initializeGame(String word) {
    return word;
  }
  public int getWordLength(String word) {
    return word.length();
  }
  public String returnDashes(String word) {
    String encryptWord = "";
    for (int i=0; i < word.length(); i++) {
      encryptWord = encryptWord.concat("-");
    }
    return encryptWord;
  }
  public boolean isLetterPresent(String inputWord, String letter) {
    boolean present = false;
    String[] word = inputWord.split("");
    for (String eachLetter : word) {
      if (eachLetter.equals(letter)) {
        present = true;
      }
    }
    return present;
  }
  public String replaceLetters(String inputWord, String letter) {
    String outputWord = "";
    for (int i=0; i < inputWord.length(); i++) {
      if(inputWord.regionMatches(i, letter, 0, letter.length())) {
        outputWord = outputWord.concat(letter);
      } else  {
        outputWord = outputWord.concat("-");
      }
    }
    return outputWord;
  }


}
