class Solution {
    public static int missingNum(int[] a) {
        int x = 0;
        for (int i = 0; i < a.length; ++i) x ^= a[i] ^ (i + 1);
        return x ^ (a.length + 1);
    }

    public static void main(String[] args)
    {
        int[] arr= {1, 2, 3, 5};
        int missing = missingNum(arr);
        System.out.println("Missing number is : " + missing);

    }

}