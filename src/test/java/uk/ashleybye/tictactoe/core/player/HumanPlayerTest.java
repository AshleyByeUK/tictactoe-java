package uk.ashleybye.tictactoe.core.player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import uk.ashleybye.tictactoe.core.ClientInterface;
import uk.ashleybye.tictactoe.core.Game;
import uk.ashleybye.tictactoe.core.MockGame;

public class HumanPlayerTest {

  private ClientInterface clientInterface = new MockClientInterface(1, 0L);

  @Test
  void testCanGetAMoveWhenThereIsNoDelay() {
    Player player = new HumanPlayer(new MockPlayerOneMark(), "Player", clientInterface);

    Game game = new MockGame();

    assertEquals(1, player.takeTurn(game));
  }

  @Test
  @Tag("slow")
  void testCanGetAMoveWhenThereIsADelay() {
    ClientInterface clientInterface = new MockClientInterface(1, 10000L);
    Player player = new HumanPlayer(new MockPlayerOneMark(), "Player", clientInterface);

    Game game = new MockGame();

    assertEquals(1, player.takeTurn(game));
  }

  @Test
  void testEquality() {
    Player player = new HumanPlayer(new MockPlayerOneMark(), "Player 1", clientInterface);
    Player otherPlayer = new HumanPlayer(new MockPlayerTwoMark(), "Player 2", clientInterface);

    assertEquals(player, player);
    assertEquals(player, new HumanPlayer(new MockPlayerOneMark(), "Player 1", clientInterface));
    assertEquals(player.hashCode(),
        (new HumanPlayer(new MockPlayerOneMark(), "Player 1", clientInterface)).hashCode());
    assertNotEquals(player, otherPlayer);
    assertNotEquals(player, "not a player");
    assertNotEquals(player, null);
    assertNotEquals(player.hashCode(), otherPlayer.hashCode());
  }
}
