https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
/**
 * Class to represet robots (non-player characters)
 */
public class Robot extends Character {
  protected int index;

  /**
   * Stringifies a robot
   *
   * @return The stringified robot
   */
  @Override
  public String toString()
  {
    return "R";
  }

  /**
   * Creates a new robot at position (x, y)
   *
   * @param x The x position of the robot
   * @param y The y position of the robot
   */
  public Robot(int x, int y)
  {
    super(x, y);
  }

  /**
   * Returns the index of the robot in the tableau
   *
   * @return The index
   */
  public int getIndex()
  {
    return index;
  }

  /**
   * Updates the index of the robot in the tableau
   *
   * @param i The new index
   */
  public void setIndex(int i)
  {
    index = i;
  }

  /**
   * TODO: Handles collisions of the robot with another cell.  This is the
   * default collideWith method.  If something is in the cell, the robot is
   * removed and the cell is hit.  The content of the cell after the
   * collision is returned.
   *
   * @param c The cell to collide with
   * @param t The tableau
   * @return The value to be placed in the cell after the collision
   */
  public Cell collideWith(Cell c, Tableau t)
  {
  }

  /**
   * Handles the situation where a Cell is zapped (by a ray or an exploding
   * robot).  Zapping vaporizes (no rubble) everything except PermanentRock
   * (which isn't effected.  Returns true if and only if the value of the
   * cell should be changed to null.
   *
   * @return Whether or not the cell should be nullified
   */
  @Override
  public boolean getZapped()
  {
    return true;
  }

  /**
   * TODO: Handles the situation where a Cell is hit by a (non-exploding)
   * robot.  Getting hit will leave rock or rubble if cell was rock or
   * rubble, will leave rubble if cell was a robot.  Will cause an explosion
   * if cell is exploding robot.  Returns the value that should be placed in
   * cell after hit.
   *
   * @param by The thing doing the hitting
   * @return New value for cell
   */
  @Override
  public Cell getHit(Tableau t, Robot by)
  {
  }

  /**
   * Signals whether or not a cell can be removed (from Tableau's robot
   * list).  Robots return true; everything else false.  The PC should be
   * marked dead.
   *
   * @return false
   */
  @Override
  public boolean removable()
  {
    return true;
  }

  /**
   * TODO: Finds a new position for the moving robot.  Robots move toward the
   * PC.  "Toward the PC" means that the robot moves in the direction of the
   * PC in at least one dimension, and if possible, it moves toward the PC in
   * both dimensions.
   *
   * @param t The tableau
   * @return The new position
   */
  public Pair moveTo(Tableau t) {
  }
}
