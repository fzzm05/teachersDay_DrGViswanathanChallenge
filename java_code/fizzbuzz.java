import java.util.ArrayList;
import java.util.List;

public class fizzbuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for(int i=1; i <= n; i++){
            if(i % 3 == 0 && i % 5 != 0){
                answer.add("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0){
                answer.add("Buzz");
            } else if (i % 5 == 0 && i % 3 == 0){
                answer.add("FizzBuzz");
            } else {
                String s = String.valueOf(i);
                answer.add(s);
            }
        }
        return answer;
    }
}
