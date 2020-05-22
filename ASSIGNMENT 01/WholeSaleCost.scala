object WholeSaleCost extends App {
  //Whole sale cost
  def coverCost(noOfCopies:Int): Double ={
    val coverPrice:Double=noOfCopies*24.95;
    return coverPrice;
  }:Double

  def discount(amount:Int):Double={
    val afterDiscount: Double=0.4*amount;
    return afterDiscount;
  }:Double

  def totalShipping(noOfCopies:Int): Double={
    var totalShipping:Double=0.0;
    if(noOfCopies>50)
      {
        totalShipping=50*3+(noOfCopies-50)*0.75;
        return totalShipping;
      }:Double
    else
      {
        totalShipping=noOfCopies*3;
        return totalShipping;
      }:Double
  }:Double

  println("Whole sale cost of books: "+(coverCost(60)-discount(60)+totalShipping(60)));

}
