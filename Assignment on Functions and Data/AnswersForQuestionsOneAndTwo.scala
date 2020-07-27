object AnswersForQuestionsOneAndTwo extends App{
  class Rational (x:Int,y:Int){

    private def gcd(a: Int, b: Int): Int=if (b==0) a else gcd(b,a%b)
    private val g=gcd(Math.abs(x),y)

    def numer=x/g
    def denom=y/g

    def neg = new Rational(-this.numer,this.denom)

    def +(that: Rational)= new Rational(this.numer*that.denom+that.numer*this.denom,this.denom*that.denom)
    def -(that: Rational)= this+that.neg
    override def toString: String = numer + "/" + denom


    //A simple method
    /*
    def sub(r:Rational):Rational={
      var a=this.numer;
      var b=this.denom;
      var c=r.numer;
      var d=r.denom;

      var numerForNew=a*d-b*c;
      var denomForNew=b*d;

      var rationalResult=new Rational(numerForNew,denomForNew);

      return rationalResult;

    }*/
  }
  //Get the denominator greater than zero
  val r=new Rational(2,6);
  val x=new Rational(1,3);
  val y=new Rational(4,3);

  //Simple method
  /*
  val result1=x.sub(y);
  val result2=x.sub(r.sub(y));
  */

  val result1=x-y;
  val result2=x-y-r;
  printf("Numerator: "+r.numer);
  printf("\nDenominator: "+r.denom);
  printf("\nNegative of 'r': "+r.neg.numer+"/"+r.denom);
  printf("\nResult after Subtracting: "+result1.numer/ result1.denom);
  printf("\nResult after Subtracting: "+result2.numer/ result2.denom);
}
