import java.util.Scanner;

class Main {
  public static void main(String[] args) {
 
     Scanner scan = new Scanner(System.in);

     System.out.println("whats your name");
     String name = scan.next();

     System.out.println("whats your age?");
     int age = scan.nextInt();

     System.out.println("do you have siblings");
     String siblings = scan.next();

     System.out.println("what time is it");
     int time = 22;
if (time < 10) {
  System.out.println("the morning.");
} else if (time < 20) {
  System.out.println("the middle of the day.");
} else {
  System.out.println("the evening.");

  System.out.println("can you count from 1-10");
  
  for(int i=1;i<=10;i++){
      System.out.println(i);
}


  }
}
}