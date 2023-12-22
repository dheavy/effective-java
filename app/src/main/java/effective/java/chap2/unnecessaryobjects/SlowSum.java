package effective.java.chap2.unnecessaryobjects;

public class SlowSum {

    /**
     * About 2 billion time slower than it should be!
     * The variable sum is declared as Long instead of long which means that the
     * program constructs about 2 billion unnecessary Long instances.
     * It still works because sum becomes a boxed primitive instead of a primitive
     * and the compiler is 100% ok with that.
     *
     * Watch out for unintentional autoboxing!
     */
    public static long sum() {
        Long sum = 0L; // Long instead of long
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}
