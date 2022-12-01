You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

SOLUTION

class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length()/2); 	//first half of s
        String b = s.substring(s.length()/2); 		//second half of s
        int p = 0, q = 0;				//vowel counters for a & b
        for (int i = 0; i < a.length(); i++)
        {
            char c = Character.toLowerCase(a.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') p++;	//checking each char in a and incrementing counter
            char d = Character.toLowerCase(b.charAt(i));
            if (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u') q++;	//same thing but for b
        }
        return (p==q); 				//check if counters are equal
    }
}
