import scala.math

object AreaOfSphere extends App {
    //Volume of the sphere
    def volumeOfSphere(r:Double):Double=(4.0/3.0)*math.Pi*r*r*r;
    println("Volume of the sphere  with given radius is: "+volumeOfSphere(5)+"cubic centimeters.\n");
}
