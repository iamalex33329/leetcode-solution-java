/**
 *  838. Push Dominoes
 *
 *  There are n dominoes in a line, and we place each domino vertically
 *  upright. In the beginning, we simultaneously push some of the dominoes
 *  either to the left or to the right.
 *
 *  After each second, each domino that is falling to the left pushes the
 *  adjacent domino on the left. Similarly, the dominoes falling to the
 *  right push their adjacent dominoes standing on the right.
 *
 *  When a vertical domino has dominoes falling on it from both sides, it
 *  stays still due to the balance of the forces.
 *
 *  For the purposes of this question, we will consider that a falling domino
 *  expends no additional force to a falling or already fallen domino.
 *
 *  You are given a string dominoes representing the initial state where:
 *
 *  - dominoes[i] = 'L', if the ith domino has been pushed to the left,
 *  - dominoes[i] = 'R', if the ith domino has been pushed to the right, and
 *  - dominoes[i] = '.', if the ith domino has not been pushed.
 *
 *  Return a string representing the final state.
 *
 */

public class Problem838 {

    public String pushDominoes(String dominoes) {

        char[] dominoesArray = dominoes.toCharArray();
        int[] forces = new int[dominoes.length()];

        int force = 0;
        // 計算向右 R 的力
        for (int i = 0; i < dominoes.length(); i++) {
            if (dominoesArray[i] == 'R') force = dominoes.length();
            else if (dominoesArray[i] == 'L') force = 0;
            else force = Math.max(force - 1, 0);
            forces[i] += force;
        }

        // 計算向左 L 的力
        force = 0;
        for (int i = dominoes.length() - 1; i >= 0; i--) {
            if (dominoesArray[i] == 'L') force = dominoes.length();
            else if (dominoesArray[i] == 'R') force = 0;
            else force = Math.max(force - 1, 0);
            forces[i] -= force;
        }

        // 根據力的結果決定每個骨牌的方向
        StringBuilder result = new StringBuilder();
        for (int f : forces) {
            if (f == 0) result.append('.');
            else result.append(f > 0 ? 'R' : 'L');
        }

        return result.toString();
    }
}
