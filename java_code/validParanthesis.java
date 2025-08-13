import java.util.ArrayList;
import java.util.HashMap;

public class validParanthesis {
        public boolean isValid(String s) {
            HashMap<Character, Character> bracket_pair = new HashMap<>();
            bracket_pair.put('(', ')');
            bracket_pair.put('[', ']');
            bracket_pair.put('{', '}');

            ArrayList<Character> seen_brackets = new ArrayList<>();

            for (int i = 0; i < s.length(); i++){
                char current = s.charAt(i);
                Character last_element = seen_brackets.isEmpty() ? null : seen_brackets.get(seen_brackets.size() - 1);
                Character last_element_value = null;
                if (last_element != null){
                    last_element_value = bracket_pair.get(last_element);
                }

                if(bracket_pair.containsKey(current)){
                    seen_brackets.add(current);
                } else if(last_element_value != null && current == last_element_value){
                    seen_brackets.remove(seen_brackets.size() - 1);
                } else {
                    return false;
                }
            }

            return seen_brackets.isEmpty();
    }
}
