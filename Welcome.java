public class Welcome{
  public static void main(String args[]){
    System.out.println("------> Welcome: Massage Displayed Here;");
    int n=20;

     for(int i=1; i<=n; i++){

       if (i%3 == 0 && i%5 == 0){
         System.out.println("HappyFizz");
       }

       else if (i%3 == 0){
         System.out.println("Happy");
       }
       else if (i%5 == 0) {
         System.out.println("Fizz");

       }

       else{
         System.out.println(i);
       }
     }






  }
}
