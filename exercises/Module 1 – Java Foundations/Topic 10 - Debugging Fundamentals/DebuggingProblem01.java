public class DebuggingProblem01 {

//     PROBLEM 1
//     int[] scores = {90, 85, 100};

// for(int i = 0; i <= scores.length; i++){
//     System.out.println(scores[i]);
// }
// Answer: for this code to run you need to assess first the index count which is
// 0, 1, 2. The error occurs because of scores.length is equal to 3, which is out of bounds.
// The common in this kind of error is "ArrayIndexOutOfBoundsException"
// To fix this we make sure that we do not cross the Array index by making <= to < only.

    public static void main(String []args){
    int[] scores = {90, 85, 100};

    for(int i = 0; i < scores.length; i++){
    System.out.println(scores[i]);
    }

}

}
