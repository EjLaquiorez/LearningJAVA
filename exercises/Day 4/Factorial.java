public class Factorial {
    public static void main(String[] args){
        int number = 1;
        for (int i = 5; i >= 1; i--) {
            number *= i;
                if(i > 1){
                    System.out.print(i + "x" );
                }
                else{
                    System.out.print(i);
            }
            
        }
        System.out.println("=" + number);
    }
}
