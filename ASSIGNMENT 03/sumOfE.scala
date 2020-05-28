import scala.io.StdIn.readInt

object sumOfE extends App{
  def isEven(n:Int):Boolean= n match{ //Indirect Recursion
    case 0 => true;
    case _ => isOdd(n-1);
  }
  def isOdd(n:Int):Boolean = !(isEven(n))

  def sumE(n:Int):Int= n match{
    case x if (x<0) => 0;
    case x if (x>=0 && isOdd(x) ) => sumE(x-1);
    case x if (x>=0 && isEven(x)) => x + sumE(x-1);
  }

  print("Enter a numebr for n: ");
  val n=readInt()-1;
  printf("The sum of all even numbers less than %d is : %d",n,sumE(n));
}
