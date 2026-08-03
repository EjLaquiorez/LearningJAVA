public class DebuggingProblem03{

    public static void main(String [] args){


        //     int score = 75;
        // if(score > 75){
        //     System.out.println("Passed");
        // }else{
        //     System.out.println("Failed");
        // }
        // Answer: The only problem in this code is that, if the passing score is 75
        // the argument should say score >= 75, not score > 75 only. So then we can include
        // 75 as a passing number.


            int score = 75;
        if(score >= 75){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}