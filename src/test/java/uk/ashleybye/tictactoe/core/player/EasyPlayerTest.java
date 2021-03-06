package uk.ashleybye.tictactoe.core.player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import uk.ashleybye.tictactoe.core.Game;
import uk.ashleybye.tictactoe.core.MockGame;

public class EasyPlayerTest {

  @Test
  void testChoosesTheFirstAvailablePosition() {
    Game game = new MockGame();
    Player player = new EasyPlayer(new MockPlayerOneMark(), "Player");

    assertEquals(4, player.takeTurn(game));
  }

  @Test
  void testEquality() {
    Player player = new EasyPlayer(new MockPlayerOneMark(), "Player 1");
    Player otherPlayer = new EasyPlayer(new MockPlayerTwoMark(), "Player 2");

    assertEquals(player, player);
    assertEquals(player, new EasyPlayer(new MockPlayerOneMark(), "Player 1"));
    assertEquals(player.hashCode(), (new EasyPlayer(new MockPlayerOneMark(), "Player 1")).hashCode());
    assertNotEquals(player, otherPlayer);
    assertNotEquals(player, "not a player");
    assertNotEquals(player, null);
    assertNotEquals(player.hashCode(), otherPlayer.hashCode());
  }
}
