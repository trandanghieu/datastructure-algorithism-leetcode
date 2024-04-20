package arrays;

public class _1295_FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        int a = findNumbers(nums);
        System.out.println(a);

    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            //countElement(num)
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countElements(int number) {
        int result = 0;
        int count = 0;
        while (number != 0) {
            result = number / 10;
            number = result;
            count++;
        }
        return count;
    }

}
