package uk.ashleybye.tictactoe.ui.console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import uk.ashleybye.tictactoe.core.Mark;

class ConsoleMarkTest {

  @Test
  void testReturnsCorrectStringRepresentation() {
    Mark mark = new ConsoleMark("X");

    assertEquals("X", mark.toString());
  }

  @Test
  void testMarksWithMultipleCharactersUseFirstCharacter() {
    Mark mark = new ConsoleMark("ABC");

    assertEquals("A", mark.toString());
  }

  @Test
  void testMarkWithSingleSpaceIsValid() {
    Mark mark = new ConsoleMark("");

    assertEquals(ConsoleMark.emptyMark().toString(), mark.toString());
  }

  @Test
  void testRemovesLeadingAndTrailingWhitespaceFromNonEmptyMarks() {
    Mark mark = new ConsoleMark(" ABC ");

    assertEquals("A", mark.toString());
  }

  @Test
  void testMarksWithOnlyMultipleSpacesAreValidForEmptyMark() {
    Mark mark = new ConsoleMark("   ");

    assertEquals(ConsoleMark.emptyMark().toString(), mark.toString());
  }

  @Test
  void testLowercaseMarksAreConvertedToUppercase() {
    Mark mark = new ConsoleMark(" abc ");

    assertEquals("A", mark.toString());
  }

  @Test
  void testEmptyMarkIsEmpty() {
    Mark mark = new ConsoleMark("");

    assertTrue(mark.isEmpty());
  }

  @Test
  void testNonEmptyMarkIsNotEmpty() {
    Mark mark = new ConsoleMark("X");

    assertFalse(mark.isEmpty());
  }

  @Test
  void testEquality() {
    Mark mark = new ConsoleMark("X");
    Mark otherMark = new ConsoleMark("O");

    assertEquals(mark, mark);
    assertEquals(mark, new ConsoleMark("X"));
    assertEquals(mark.hashCode(), (new ConsoleMark("X")).hashCode());
    assertNotEquals(mark, otherMark);
    assertNotEquals(mark, "not a mark");
    assertNotEquals(mark, null);
    assertNotEquals(mark.hashCode(), otherMark.hashCode());
  }
}
