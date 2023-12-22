package effective.java.chap2.unnecessaryobjects;

import java.util.regex.Pattern;

public class RomanNumerals {
    // Instead of using a regular expression to check if a string is a valid Roman
    // numeral, we can improve the performance of the program by using a single
    // instance of the regular expression.
    // Improvement comes from the fact that the regular expression is compiled only
    // once, instead of being compiled every time the method is invoked.
    // By avoiding the creation of unnecessary objects, we improve the performance.
    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
