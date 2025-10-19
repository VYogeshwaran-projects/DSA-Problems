public class RansomNoteSimple {
    public static boolean canConstruct(String ransomNote, String magazine) {
        // Convert magazine to a mutable StringBuilder (so we can remove letters)
        StringBuilder mag = new StringBuilder(magazine);

        for (char c : ransomNote.toCharArray()) {
            int index = mag.indexOf(String.valueOf(c)); // find the letter
            if (index == -1) {
                return false; // letter not found
            }
            mag.deleteCharAt(index); // remove used letter
        }

        return true; // all letters found
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine)); // Output: false
    }
}
