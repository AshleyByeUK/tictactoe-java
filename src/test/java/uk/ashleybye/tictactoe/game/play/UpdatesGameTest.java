package uk.ashleybye.tictactoe.game.play;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import uk.ashleybye.tictactoe.game.Game;
import uk.ashleybye.tictactoe.game.MockGame;

class UpdatesGameTest {

  @Test
  void testUpdatesGameWithMove() {
    MockMove move = new MockMove(1);
    MockGame game = new MockGame();

    UpdatesGame updatesGame = new UpdatesGame();
    Game updatedGame = updatesGame.apply(move, game);

    assertTrue(((MockGame) updatedGame).applyMoveWasLastCalledWith(move));
  }
}