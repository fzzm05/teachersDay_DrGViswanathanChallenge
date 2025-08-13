import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public int romanToInteger(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int n = s.length();

        // Iterate through the Roman numeral string.
        for (int i = 0; i < n; i++) {
            // Get the value of the current Roman numeral.
            int currentValue = romanMap.get(s.charAt(i));

            // Check if there is a next character to consider for the subtraction rule.
            if (i + 1 < n) {
                int nextValue = romanMap.get(s.charAt(i + 1));

                // If the current value is less than the next value,
                // it's a subtractive case (e.g., IV, IX).
                if (currentValue < nextValue) {
                    total -= currentValue;
                } else {
                    // Otherwise, it's an additive case (e.g., VI, XII).
                    total += currentValue;
                }
            } else {
                // If it's the last character, always add its value.
                total += currentValue;
            }
        }
        return total;
    }
}
