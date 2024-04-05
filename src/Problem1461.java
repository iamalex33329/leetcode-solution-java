/**
 *  1461. Check If a String Contains All Binary Codes of Size K
 *
 *  Given a binary string s and an integer k, return true if every binary
 *  code of length k is a substring of s. Otherwise, return false.
 *
 */

import java.util.HashSet;
import java.util.Set;

public class Problem1461 {

    public boolean hasAllCodes(String s, int k) {

        Set<String> set = new HashSet<>();

        for (int i=k; i<=s.length(); i++) set.add(s.substring(i-k, i));

        return set.size() == Math.pow(2,k);
    }
}
