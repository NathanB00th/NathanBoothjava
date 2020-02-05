import java.lang.reflect.Array;

public class Runner {

    //#1

    public static boolean monkeyTrouble(Boolean aSmile, Boolean bSmile) {
        if (aSmile == bSmile) {
            return true;
        } else {
            return false;
        }
    }

    //#2

    public static String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }

    //#3

    public static boolean no23(int[] nums) {
        for (int i = 0; i <= 1; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    //#4

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else {
            if ((a + b == 6) || (Math.abs(a - b) == 6)) {
                return true;
            }
            return false;
        }
    }

    //#5

    public static int loneSum(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return a + b + c;
        }
        if (a == b && a == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (b == c) {
            return a;
        } else {
            return b;
        }
    }

    //#6

    public static boolean tripleUp(int[] nums) {
        if (nums.length >= 3) {
            int counter = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] + 1 == nums[i]) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    //#7

    public static String stringTimes(String str, int n) {
        String finalStr = "";
        for (int i = 0; i < n; i++) {
            finalStr += str;
        }
        return finalStr;
    }

    //#8

    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        } else {
            int counter = 0;
            for (int i = 2; i <= str.length(); i ++) {
                if (str.substring(i - 2, i) ==  "hi") {
                    counter++;
                }
            }
            return counter;
        }
    }

    //#9

    public static int[] biggerTwo(int[] a, int[] b) {
        if (a[0] + a[1] < b[0] + b[1]) {
            return b;
        }
        return a;
    }

    //#10

    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += 2;
            }
        }
        if (sum == 8) {
            return true;
        } else {
            return false;
        }
    }

}