package Arrays;

// occurrence of each character in String
public class Occurrence_of_each_character {
    public static void main(String[] args) {
        String str = "assdgfdsasAS";
        char c[] = str.toCharArray();
        boolean[] b = new boolean[str.length()];

        for (int i = 0; i < c.length; i++) {
            if(b[i]) continue;
            int count =1;
            for(int j=i+1;j<c.length; j++){
                if(c[i]==c[j]){
                    count++;
                    b[j]=true;
                }
            }
            System.out.println(c[i]+":"+count);
        }
    }
}
//public class CharacterCount {
//    public static void main(String[] args) {
//        String inputString = "occurrence";
//        Map<Character, Integer> charCountMap = new HashMap<>();
//
//        // Convert the string to a character array and iterate
//        for (char c : inputString.toCharArray()) {
//            // Get the current count, or 0 if not present, then increment
//            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//        }
//
//        // Print the result
//        System.out.println("Character occurrences in the string \"" + inputString + "\":");
//        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
//    }
//}