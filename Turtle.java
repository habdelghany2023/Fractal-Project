package fractal;

import java.awt.geom.Point2D;

/** This is a helper class to assist you in drawing fractals.
 *  YOU DO NOT NEED TO MODIFY ANYTHING HERE
 */

public class Turtle {
  private Point2D pos;  // current position
  private Point2D dir;  // direction the turtle is heading to

  /** Constructor: the arguments are the initial position of the turtle
   *  and the target position it's heading to.
   */
  public Turtle(Point2D start, Point2D target) {
    pos = new Point2D.Double(start.getX(), start.getY()); // clone the position
    double dx = target.getX() - pos.getX();
    double dy = target.getY() - pos.getY();
    double length = start.distance(target);
    dir = new Point2D.Double(dx / length, dy / length); // normalize the direction vector
  }

  // return the current position
  public Point2D getPosition() { 
    return pos; 
  }

  /** move by a given distance, for example 0.1
   * this distance can also be negative, in which case if will move backward
   * 
   * @param distance distance
   */
  public void move(double distance) {
    pos = new Point2D.Double(pos.getX(), pos.getY()); // clone to a new point
    pos.setLocation(pos.getX() + distance * dir.getX(),
        pos.getY() + distance * dir.getY());
  }

  /** set the direction of the turtle to turn left by a certain number of degrees, e.g. 60
  * you can also use a negative number, in which case it turns right
  */
  public void turnLeft(double degrees) {
    double radians = Math.toRadians(degrees);
    double newDx = Math.cos(radians) * dir.getX() - Math.sin(radians) * dir.getY();
    double newDy = Math.sin(radians) * dir.getX() + Math.cos(radians) * dir.getY();
    dir.setLocation(newDx, newDy);
  }

  // set the direction of the turtle to turn left by a certain number of degrees, e.g. 60
  public void turnRight(double degrees) {
    turnLeft(-degrees);
  }
}
