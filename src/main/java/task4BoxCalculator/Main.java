package task4BoxCalculator;

public class Main {
    public static void main(String[] args) {
        Double[] array = {1.0, 2.0, 3.0, 4.0};

        BoxWithNumber <Double> nums = new BoxWithNumber<>(array);
        System.out.println("nums.average() = " + nums.average());
        Double[] array2 = {5.0, 6.0, 1.0};
        BoxWithNumber <Double> nums2 = new BoxWithNumber<>(array2);
        System.out.println("nums.average() = " + nums2.average());
        System.out.println("nums.compareAverage(nums2) = " + nums.compareAverage(nums2));
        Double average1 = nums.average();
        Double average2 = nums2.average();
        System.out.println("nums.compareAverage(average1, average2) = " + nums.compareAverage(average1, average2));
        Integer[] boxInt = {1, 2, 3, 100};
        BoxWithNumber<Integer> nums3 = new BoxWithNumber<>(boxInt);
        System.out.println("nums3.average() = " + nums3.average());
// String[] box4 = {"qwe", "fgh"};
// BoxWithNumber<String> str = new BoxWithNumber<>(box4);
// System.out.println("str.compareAverage(nums) = " + nums.compareAverage(str));
// System.out.println("nums2.compareAverage(nums3) = " + nums2.compareAverage(nums3));
    }
}