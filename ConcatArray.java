//6․ Concatenation of Array։
// Ձեզ տրվում է երկու ամբողջ թվային զանգված՝ nums1 և nums2, որոնք ներկայացնում են թվերի երկու հավաքածու:
// Խնդիրն է միացնել երկու զանգվածները և վերադարձնել ստացված զանգվածը:

class Concatenation {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {5, 6, 7, 8};

        int[] concatenatedArray = concat(nums1, nums2);
        
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
    }

    static public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;

        for (int current : arr1) {
            result[i] = current;
            i++;
        }

        for (int current : arr2) {
            result[i] = current;
            i++;
        }

        return result;
    }
}
