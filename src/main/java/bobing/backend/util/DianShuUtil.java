package bobing.backend.util;

public class DianShuUtil {

    private static void printAllNumbers(int [] numbers) {

        for (int number : numbers) {
            System.out.print(number);
        }
        System.out.println();
    }

    /**
     * 判断是否是一秀
     * @return
     */
    public static boolean isYiXiu(int [] numbers) {

        boolean result = false;
        if (countNumber4(numbers) == 1) {
            result = true;
        }
        return result;
    }

    /**
     * 判断是否是二举
     * @return
     */
    public static boolean isErJu(int [] numbers) {

        boolean result = false;
        if (countNumber4(numbers) == 2) {
            result = true;
        }
        return result;
    }

    /**
     * 判断是否是三红
     * @return
     */
    public static boolean isSanHong(int [] numbers) {

        boolean result = false;
        if (countNumber4(numbers) == 3) {
            result = true;
        }
        return result;
    }

    /**
     * 计算是否是四进
     * @param numbers
     * @return
     */
    public static boolean isSiJin(int [] numbers) {

        return ifHas4SameNumber(numbers) && countNumber4(numbers) != 4;
    }

    /**
     * 计算是否是对堂
     * @param numbers
     * @return
     */
    public static boolean isDuiTang(int [] numbers) {

        return countNumber(numbers, 1) == 1
                && countNumber(numbers, 2) == 1
                && countNumber(numbers, 3) == 1
                && countNumber(numbers, 4) == 1
                && countNumber(numbers, 5) == 1
                && countNumber(numbers, 6) == 1;

    }



    /**
     * 计算是否是四红
     * @param numbers
     * @return
     */
    public static boolean isSiHong(int [] numbers) {

        return countNumber4(numbers) == 4;
    }

    /**
     * 计算是否是五子
     * @param numbers
     * @return
     */
    public static boolean isWuZi(int [] numbers) {

        return ifHas5SameNumber(numbers)
                && countNumber4(numbers) < 5;
    }

    /**
     * 计算是否是五红
     * @param numbers
     * @return
     */
    public static boolean isWuHong(int [] numbers) {

        return countNumber4(numbers) == 5;
    }

    /**
     * 计算是否是六子
     * @param numbers
     * @return
     */
    public static boolean isLiuZi(int [] numbers) {

        return ifHas6SameNumber(numbers)
                && countNumber4(numbers) < 6;
    }

    /**
     * 计算是否是六红
     * @param numbers
     * @return
     */
    public static boolean isLiuHong(int [] numbers) {

        return countNumber4(numbers) == 6;
    }

    /**
     * 计算有多少个4
     * @param numbers
     * @return 4的个数
     */
    private static int countNumber4(int [] numbers) {

        return countNumber(numbers, 4);
    }

    /**
     * 计算有多少个2
     * @param numbers
     * @return 2的个数
     */
    private static int countNumber2(int [] numbers) {

        return countNumber(numbers, 2);
    }

    /**
     * 计算有多少个num
     * @param numbers
     * @return num的个数
     */
    private static int countNumber(int [] numbers, int num) {

        int cnt = 0;
        for (int number : numbers) {
            if (number == num) {
                cnt++;
            }
        }
        return cnt;
    }

    /**
     * 计算是否有n个数字相同的骰子
     * @param numbers
     * @return
     */
    private static boolean ifHasSameNumber(int [] numbers, int n) {

        boolean result = false;
        for (int i = 1; i <= numbers.length; i++) {
            if (countNumber(numbers, i) == n) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * 计算是否有4个数字相同的骰子
     * @param numbers
     * @return
     */
    private static boolean ifHas4SameNumber(int [] numbers) {
        return ifHasSameNumber(numbers, 4);
    }

    /**
     * 计算是否有5个数字相同的骰子
     * @param numbers
     * @return
     */
    private static boolean ifHas5SameNumber(int [] numbers) {
        return ifHasSameNumber(numbers, 5);
    }

    /**
     * 计算是否有6个数字相同的骰子
     * @param numbers
     * @return
     */
    private static boolean ifHas6SameNumber(int [] numbers) {
        return ifHasSameNumber(numbers, 6);
    }

    /**
     * 计算是否是状元
     * @param numbers
     * @return
     */
    public static boolean isZhuangYuan(int [] numbers) {

        return countNumber4(numbers) >= 4;
    }

    /**
     * 计算是否是状元插金花
     * @param numbers
     * @return
     */
    public static boolean isChaJinHua(int [] numbers) {

        return countNumber4(numbers) == 4 && countNumber2(numbers) == 2;
    }
}
