package model;

import constants.Outcome;

public class Ball {

  private final Outcome outcome;

  private final int runsScored;

  public Ball(int runs, Outcome outcome) {
    this.runsScored = runs;
    this.outcome = outcome;
  }

  public static Ball fromString(String value) {
    if(value.endsWith("NB")) {
      if(value.length() == 2) {
        return new Ball(1, Outcome.EXTRA);
      }
      int runs = Integer.parseInt(value.substring(0, value.length() - 2)) + 1;
      return new Ball(runs, Outcome.EXTRA);
    }
    if(value.equals("W")) {
      return new Ball(0, Outcome.WICKET);
    }
    return new Ball(Integer.parseInt(value), Outcome.RUNS_SCORED);
  }

  public int getRunsScored() {
    return runsScored;
  }

  public Outcome getOutcome() {
    return outcome;
  }
}
