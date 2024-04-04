/**
 *  1041. Robot Bounded In Circle
 *
 *  On an infinite plane, a robot initially stands at (0, 0) and faces north. Note that:
 *
 *  - The north direction is the positive direction of the y-axis.
 *  - The south direction is the negative direction of the y-axis.
 *  - The east direction is the positive direction of the x-axis.
 *  - The west direction is the negative direction of the x-axis.
 *
 *  The robot can receive one of three instructions:
 *
 *  - "G": go straight 1 unit.
 *  - "L": turn 90 degrees to the left (i.e., anti-clockwise direction).
 *  - "R": turn 90 degrees to the right (i.e., clockwise direction).
 *
 *  The robot performs the instructions given in order, and repeats them forever.
 *
 *  Return true if and only if there exists a circle in the plane such that the
 *  robot never leaves the circle.
 *
 */

public class Problem1041 {

    public boolean isRobotBounded(String instructions) {

        //                                 UP   RIGHT   DOWN    LEFT
        int[][] directions = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
        int x = 0, y = 0, dir = 0;

        for (char i : instructions.toCharArray()) {
            if (i == 'L') dir = (dir + 3) % 4;
            else if (i == 'R') dir = (dir + 1) % 4;

            else {
                x += directions[dir][0];
                y += directions[dir][1];
            }
        }

        return (x == 0 && y == 0) || dir != 0;
    }
}
