package homework_week_5;
/**
 * Write a java program to print the result of the following operations.
 * Test Data :
 * a. -5 + 8 * 6
 * b. (55+9) % 9
 * c. 20 + -3*5 / 8
 * d. 5 + 15 / 3 * 2 -8 % 3
 * Expected OutPut is :
 * a = 43
 * b = 1
 * c = 19
 * d = 13
 */

public class Programme_9_MixedOperation {
    public static void main(String[] args) {
        // Mixed Operation declaration
        int a = -5+8*6;
        int b = (55 +9) % 9;
        int c = 20+ -3*5/8;
        int d = 5+15/ 3*2 -8%3;
        //output
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

}
