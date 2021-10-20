import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return  strs[0];

        String commonPrefix = getShortString(strs);
        StringBuilder var = new StringBuilder();
        for (String str: strs) {
            if( str.equals("")) {
                return "";
            }
            var.append(str, 0, commonPrefix.length());
        }

        while( var.length() > 0) {
            if(var.toString().replaceAll(commonPrefix, "").equals("")) {
                return commonPrefix;
            } else {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
                int j = 1;
                while( j <= strs.length) {
                    var.deleteCharAt( commonPrefix.length() * j);
                    j++;
                }
            }
        }
        return commonPrefix;
    }

    private String getShortString(String[] strs) {
        return Arrays.stream(strs)
                .min(Comparator.comparingInt(String::length))
                .get();
    }
}
