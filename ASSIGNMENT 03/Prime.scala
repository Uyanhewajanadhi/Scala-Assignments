import scala.io.StdIn.readInt

object Prime extends App{
  def Prime(p:Int, n:Int=2):Boolean =n match{ //I guess n:Int=2 means, Intially n is 2.
    //n is the one which is matched here, and the value 'x' gets is the value of n.
    case x if (x==p) => true;
    case x if GCD(p,x)>1  => false;
    case x => Prime(p,x+1);
  }

  def GCD(a:Int,b:Int):Int=b match{
    case 0 => a;
    case x if x>a => GCD(x,a);
    case x => GCD(x,a%x);
  }
  print("5:  ");
  println(Prime(5));
  print("8:  ");
  println(Prime(8));
  print("Enter a numebr for n: ");
  val n=readInt();
  printf("%d:  ",n);
  println(Prime(n));
}
