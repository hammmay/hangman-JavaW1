import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

  @Test
  public void initializeGame_printOutWordFromArray_at() {
    Game testGame = new Game();
    assertEquals("at", testGame.initializeGame("at"));
  }

  @Test
  public void getWordLength_returnNumberOfChars_2() {
    Game testGame = new Game();
    assertEquals(2, testGame.getWordLength("at"));
  }

  @Test
  public void returnDashes_returnSameNumberOfDashesAsLetters_4dashes() {
    Game testGame = new Game();
    assertEquals("----", testGame.returnDashes("coat"));
  }

  @Test
  public void isLetterPresent_returnBoolean_true() {
    Game testGame = new Game();
    assertEquals(true, testGame.isLetterPresent("father", "h"));
  }

  @Test
  public void replaceLetters_replaceADashwithH_3dashes1H2dashes() {
    Game testGame = new Game();
    assertEquals("---h--", testGame.replaceLetters("father", "h"));
  }

}
