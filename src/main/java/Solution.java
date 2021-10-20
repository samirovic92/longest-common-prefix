import java.util.Arrays;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if( strs[0].equals("")) return "";
        if (strs.length == 1) return  strs[0];

        int i = 0;
        String commonPrefix = "";
        while (true) {
            if ( i>= strs[0].length() ) return  commonPrefix;

            commonPrefix += Character.toString(strs[0].charAt(i));
            for ( String str : strs ) {
                if( !str.startsWith(commonPrefix)) {
                    return commonPrefix.substring(0, commonPrefix.length() - 1);
                }
            }
            i++;
        }
    }

}
