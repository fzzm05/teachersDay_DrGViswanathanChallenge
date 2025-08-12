public class even_numbers {
    static int noOfDigits(int n){
        if (n == 0) {
            return 1;
        }
        String s = String.valueOf(n);
        if (n < 0) {
            return s.length() - 1;
        }
        return s.length();
    };

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if(noOfDigits(num) % 2 == 0){
                count += 1;
            }
        }

        return count;
    }
}
