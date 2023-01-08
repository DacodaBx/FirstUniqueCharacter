public class FirstUnique {
    public static void main(String[] args){
        System.out.println(firstuniquecharacter("sshannon"));
    }
    static int firstuniquecharacter(String s){
        int[] howOften = new int[26];
        char[] letters = s.toCharArray();
        for(char c: letters){
            howOften[c-'a']++;
        }
        for(int i = 0; i < letters.length; i++){
            if(howOften[letters[i]-'a']==1){
                return i;
            }

        }
        return -1;
    }
}

// Dacoda's Notes:
// We are looking for the index number of the first unique number.
// We need an array to track how often a letter in the alphabet is used, only considering lower case numbers.
// We will store the input string in an array as a char array. ie: s | h | a |....
// Then iterate through the input string. 
// For each letter in the string that is iterated, the amount of times that letter appears is stored in the how often array.
// Once the frequency is tallied, then we answer the question. 
// What is the first unique character? 
// After using the ASCII table to subtract the value of the iterated letter from a (97) and determined how many times
// a letter appeared in the string, the character that had a frequency of 1 that came first in the string, that index is the answer.
// if there is no 1, then the answer is -1.
