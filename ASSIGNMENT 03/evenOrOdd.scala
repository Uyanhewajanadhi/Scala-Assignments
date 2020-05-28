import scala.io.StdIn.readInt

object evenOrOdd extends App{
  def isEven(n:Int):Boolean= n match{ //Indirect Recursion
    case 0 => true;
    case _ => isOdd(n-1);
  }
  def isOdd(n:Int):Boolean = !(isEven(n))


  print("isEven(12):  ");
  println(isEven(12));
  print("\nisOdd(54):  ");
  println(isOdd(54));
  print("\nEnter a numebr for n: ");
  val n=readInt();
  printf("isOdd(%d):  ",n);
  println(isOdd(n));
  printf("isEven(%d):  ",n);
  println(isEven(n));
}



