/**
 *  168. Excel Sheet Column Title
 *
 *  Given an integer columnNumber, return its corresponding column
 *  title as it appears in an Excel sheet.
 *
 *  For example:
 *
 *  A -> 1
 *  B -> 2
 *  C -> 3
 *  ...
 *  Z -> 26
 *  AA -> 27
 *  AB -> 28
 *  ...
 *
 */

public class Problem168 {

    public String convertToTitle(int columnNumber) {

        StringBuilder builder = new StringBuilder();

        while (columnNumber-- > 0) {
            builder.append(Character.toString(columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }

        return builder.reverse().toString();
    }
}
