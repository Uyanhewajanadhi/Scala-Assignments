import scala.math


object caseClassAssignment extends App{
  var p1 = Point(2, 3);
  val p2=Point(1,5);

  println("Point 1: "+p1);
  println("Point 2: "+p2);

  println("Point 1 + Point 2: "+(p1+p2));

  val p3=p1.move(2,5);
  p1=p3;
  //val p1=p3.copy();
  println("\nPoint 3 = Point 1 moved by (2,1). \nSo, P3: " + p1);

  val p4=p1.distance(p2)
  println("\nDistance between Point 1 and Pint 2: " + p4);

  println("\nPoint 1 inverted: " + p1.invert());

}

case class Point(a:Int,b:Int)
{
  def x:Int=a;
  def y:Int=b;

  //Answer for question 01
  def +(that:Point)={
    Point(this.x+that.x,this.y+that.y)
  }

  //Answer for question 02
  def move(dx:Int,dy:Int)= {
    Point(this.x+dx,this.y+dy)
  }

  //Answer for question 03
  def distance(that:Point): Double ={

    var ans = scala.math.sqrt(scala.math.pow(that.x - this.x, 2) + scala.math.pow(that.y - this.y, 2) * 1.0);
    return BigDecimal(ans).setScale(3, BigDecimal.RoundingMode.HALF_UP).toDouble;

  }


  //Answer for question 04
  def invert()={
    Point(this.y,this.x);
  }

}
