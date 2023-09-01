package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import constants.Outcome;
import org.junit.jupiter.api.Test;

class BallTest {

  @Test
  void create() throws Exception {
    Ball ball = Ball.fromString("2");
    assertNotNull(ball);
    assertEquals(Outcome.RUNS_SCORED, ball.getOutcome());
    assertEquals(2, ball.getRunsScored());

    ball = Ball.fromString("W");
    assertEquals(Outcome.WICKET, ball.getOutcome());

    ball = Ball.fromString("1NB");
    assertEquals(Outcome.EXTRA, ball.getOutcome());
    assertEquals(2, ball.getRunsScored());
  }

}
