package medium; 

import java.util.HashSet;
import java.util.Set;

public class Problem1461 {

    public boolean hasAllCodes(String s, int k) {

        Set<String> set = new HashSet<>();

        for (int i=k; i<=s.length(); i++) set.add(s.substring(i-k, i));

        return set.size() == Math.pow(2,k);
    }
}
