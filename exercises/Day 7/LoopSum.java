import java.util.Scanner;

public class LoopSum {

        public static int sum(int[] ages) {
            int total = 0;
            for (int age : ages) {
            total += age;
            }
            return total;
    }
        public static int average(int[] ages) {
            if (ages == null || ages.length == 0) return 0;
            int total = 0;
            for (int age : ages) {
                total += age;
            }
            return total / ages.length;
    }
        public static int maximum(int[] nums) {
            if (nums == null || nums.length == 0) return 0;
            int max = nums[0];
            for (int num : nums) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
        public static int minimum(int[] nums) {
            if (nums == null || nums.length == 0) return 0;
            int min = nums[0];
            for (int num : nums) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
    public static int countEven(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOdd(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int count = 0;
        for (int num : nums) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static int numSearch(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int target = scanner.nextInt();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("Found.");
                return i;
            }
        }
        System.out.println("Not Found.");
        return -1;
    }
    public static int reversePrint(int[] nums) {
        if (nums == null) return -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
        return 0;
    }
    public static int replaceOddNumToZero(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(nums[i]);
            }
            else{
                System.out.println("0");
            }
        }
        
        return -1;
    }
    public static int countGrades(int[] grades){
        if (grades == null || grades.length == 0) return -1;

        for(int grade : grades){
            if(grade >= 75){
                System.out.println("Passed.");
            }
        }
        System.out.println("Failed.");
        return -1;
    }

    public static void main(String[] args) {
        int[] ages = {18, 21, 19, 22, 25};
        int[] grades = {78, 81, 84, 90, 97};
        int[] nums = {8, 11, 16, 22, 33, 50};

        System.out.println("Ages sum: " + sum(ages));
        System.out.println("Ages average: " + average(ages));
        System.out.println("Ages maximum: " + maximum(ages));
        System.out.println("Ages minimum: " + minimum(ages));

        System.out.println("Even numbers count: " + countEven(nums));
        System.out.println("Odd numbers count: " + countOdd(nums));

        System.out.println("Reverse print:");
        reversePrint(nums);

        System.out.println("Replace odd indexes with zero (output shown below):");
        replaceOddNumToZero(nums);

        System.out.println("Grade results:");
        countGrades(grades);

        System.out.println("Number search result index: " + numSearch(nums));
    }
}