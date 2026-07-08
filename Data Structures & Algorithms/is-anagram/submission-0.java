class Solution {
    public boolean isAnagram(String s, String t) {
       // If lengths match incorrectly, they cannot be anagrams
       if(s.length() != t.length()){ //find the length 
            return false;
       }

        //Create an array of a to z to trace a letters lowercase
        int[] charCounts= new int[26];  // array to store string of anagram 
    
        // Increment for string s and decrement for string t 
       for (int i = 0; i<s.length(); i++){
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
       }
       
       // If all counts are zero, the strings are valid anagrams
       // why for loop cause charCounts are array 
       for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
