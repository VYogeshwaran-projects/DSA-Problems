public class FirstUniqueCharSimple {
    public static int firstUniqChar(String s) {
        // Loop through each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check if this character appears only once
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i; // found first unique character
            }
        }
        return -1; // no unique character found
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s)); // Output: 0
    }
}
