import java.util.HashMap;
class Crypto {
  
  public static String wordPattern(final String word){
    // Your code here!
    String ans ="";
    
    HashMap<Character,Integer> m = new HashMap<Character,Integer>();
    for (int i =0 ,j =0 ; i<word.length();i++){
      if(m.containsKey(word.toLowerCase().charAt(i))){
        
      }
      else{
        m.put(word.toLowerCase().charAt(i),j++);
      }
    }
    for(char c : word.toLowerCase().toCharArray()){
      ans += m.get(c)+".";
    }
    return ans.substring(0,ans.length()-1);
  }
}
// In cryptanalysis, words patterns can be a useful tool in cracking simple ciphers.
// A word pattern is a description of the patterns of letters occurring in a word, where each letter is given an integer code in order of appearance. So the first letter is given the code 0, and second is then assigned 1 if it is different to the first letter or 0 otherwise, and so on.
// As an example, the word "hello" would become "0.1.2.2.3". For this task case-sensitivity is ignored, so "hello", "helLo" and "heLlo" will all return the same word pattern.
// Your task is to return the word pattern for a given word. All words provided will be non-empty strings of alphabetic characters only, i.e. matching the regex "[a-zA-Z]+".

// {"hello", "0.1.2.2.3"},
// {"heLlo", "0.1.2.2.3"},
// {"helLo", "0.1.2.2.3"},
// {"Hippopotomonstrosesquippedaliophobia", "0.1.2.2.3.2.3.4.3.5.3.6.7.4.8.3.7.9.7.10.11.1.2.2.9.12.13.14.1.3.2.0.3.15.1.13"}