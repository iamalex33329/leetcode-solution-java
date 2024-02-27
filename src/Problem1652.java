/**
 *  1652. Defuse the Bomb
 *
 *  You have a bomb to defuse, and your time is running out! Your informer
 *  will provide you with a circular array code of length of n and a key k.
 *
 *  To decrypt the code, you must replace every number. All the numbers are
 *  replaced simultaneously.
 *
 *  If k > 0, replace the ith number with the sum of the next k numbers.
 *  If k < 0, replace the ith number with the sum of the previous k numbers.
 *  If k == 0, replace the ith number with 0.
 *
 *  As code is circular, the next element of code[n-1] is code[0], and the
 *  previous element of code[0] is code[n-1].
 *
 *  Given the circular array code and an integer key k, return the decrypted
 *  code to defuse the bomb!
 *
 */

public class Problem1652 {

    public int[] decrypt(int[] code, int k) {
        int[] decryptCode = new int[code.length];

        if (k == 0) return decryptCode;

        int[] prefix = new int[code.length*2+1];

        for (int i=0; i<code.length*2; i++) {
            prefix[i+1] = prefix[i] + code[i % code.length];
        }

        for (int i=0; i<code.length; i++) {
            int end = i+k;
            if (k > 0) {
                decryptCode[i] = prefix[end+1] - prefix[i+1];
            } else {
                decryptCode[i] = prefix[i+code.length] - prefix[end+code.length];
            }
        }
        return decryptCode;
    }
}
