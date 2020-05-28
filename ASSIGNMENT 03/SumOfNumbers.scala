import scala.io.StdIn.readInt

object SumOfNumbers extends App{
  def sum(n:Int):Int= n match{
    case x if (x<0) => 0;
    case x if (x>=0) => x + sum(x-1);
  }

  print("Sum of numbers less than 5:  ");
  println(sum(5));
  print("\nEnter a numebr for n: ");
  val n=readInt();
  printf("Sum of numbers less than %d:  ",n);
  println(sum(n));

}
