import scala.io.StdIn.readInt

object primeseq extends App{

  def GCD(a:Int,b:Int):Int=b match{
    case 0 => a;
    case x if x>a => GCD(x,a);
    case x => GCD(x,a%x);
  }

  def Prime(p:Int, n:Int=2):Boolean =n match{
    case x if (x==p) => true;
    case x if GCD(p,x)>1  => false;
    case x => Prime(p,x+1);
  }


  def primeSeq(n:Int):Unit={
    if (n>2) primeSeq(n-1);
    if (Prime(n)) print(n + " ");
  }

  print("Prime Sequence of 10:  ");
  primeSeq(10);
  print("\nEnter a numebr for n: ");
  val n=readInt();
  printf("Prime Sequence of %d:  ",n);
  primeSeq(n);


}

