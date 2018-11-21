package uk.ashleybye.tictactoe.game.play;

import java.util.List;
import uk.ashleybye.tictactoe.game.Game;

public class MockTakesPlayersTurn extends TakesPlayersTurn {
  private int numberOfTimesTakeTurnHasBeenCalled = 0;
  private List<Move> moves;
  private Game game;

  @Override
  public Move takeTurn(Game game) {
    this.game = game;
    return moves.get(numberOfTimesTakeTurnHasBeenCalled++);
  }

  public void makeMovesInOrder(List<Move> moves) {
    this.moves = moves;
  }

  public int getNumberOfTimesTakeTurnHasBeenCalled() {
    return numberOfTimesTakeTurnHasBeenCalled;
  }

  public boolean wasLastCalledWith(Game game) {
    return this.game.equals(game);
  }
}