public class DebuggingProblem02 {
    
    public static void main(String [] args){

    // String word = "Java";

    // for(int i = 0; i <= word.length(); i++){
    //     System.out.println(word.charAt(i));
    //     }
    
    // Answer: The problem in this code is that the word.length is out of bounds with the count 
    // of 4 but the array index is only 0, 1, 2, 3. The solution is remove the = sign before the word.length
    // to make sure that it count exactly the number of index is.

    String word = "Java";

        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
