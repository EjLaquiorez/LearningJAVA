import java.util.Scanner;
public class Strings {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String [] names = new String[5];
    private static final String myName = "Justine";
    private static final String password = "password123";
    private static final String [] students = {
            "Alice",
            "Bob",
            "Charlie",
            "David",
            "Jas"
        };

    public static void main(String[] args) {
        // printLength();
        // printToUppercase();
        // printToLowercase();
        // printCharSeperately();
        // printReverseString();
        // validatePassword();
        // countVowels();
        // countConsonants();
        palindromeChecker();
        // nameSearch();
        // spaceRemover();
    }

    public static void printLength(){
        System.out.print("The String length: ");
        System.out.println(myName.length());
        

        }

    public static void printToUppercase(){
        System.out.print("The String to uppercase: ");
        System.out.println(myName.toUpperCase());


    }
    public static void printToLowercase(){
        System.out.print("The String to lowercase: ");
        System.out.println(myName.toLowerCase());


    }
    public static void printCharSeperately(){
        for (int i = 0; i < myName.length(); i++) {
            System.out.print(myName.charAt(i) + " ");
            
        }
        System.out.println();

    }
    public static void countVowels(){
        int counter = 0;
        for(int i = 0; i < myName.length(); i++){
            char ch = Character.toLowerCase(myName.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                counter++;
                

            }
        }
        System.out.println("Vowel count: " + counter);
    }

    public static void countConsonants(){
        int consonantCount = 0;
        for(int i = 0; i < myName.length(); i++){
            char ch = Character.toLowerCase(myName.charAt(i));
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                consonantCount++;
            }
        }
        System.out.println("Consonant count: " + consonantCount);
    }

    public static void printReverseString(){
        for (int i = myName.length(); i > 0 ; i--) {
            System.out.print(myName.charAt(i-1)+ " ");
            
        }
        System.out.println();
        

    }
    public static void palindromeChecker(){
        //declare string word and reversed then for loop then if else if word and reversed is equal
        String word = "Level";
        String reversed = "";

        for(int i = word.length()-1; i >= 0; i--){
            reversed+= Character.toLowerCase(word.charAt(i));
        }
        if(reversed.equalsIgnoreCase(word)){
            System.out.println(word + " is a palindrome.");
        }
        else{
            System.out.println(word + " is not a palindrome.");
        }
    }
    public static void letterCharCounter(){
        // for (int i = 0; i < myName.length(); i++) {
        //     int counter = 0;
        //     if(myName.charAt(i).equals("a")){
        //         counter++;
        //     }
        //maybe i could i add it to a loop then for every char it adds up on an Array then
        //that array will for every loop will check if it equals with chat given

    }
    public static void validatePassword(){
        String passwordInput = "password123";
        if(password.equals(passwordInput)){
            System.out.println("Password is correct");
        }
        else{
            System.out.println("Incorrect Password");
        }


    }
    public static void nameSearch(){
        // String nameX = "Jas";
        // for(String name : names){
        //     if(name.equals(nameX))
        //     System.out.print(nameX + "Found!");
        // }


    }
    public static void spaceRemover(){
        // String mySentence = "The Java Programmer.";
        // System.out.println(mySentence.equalsIgnoreCase(" "));
    }
  

}
