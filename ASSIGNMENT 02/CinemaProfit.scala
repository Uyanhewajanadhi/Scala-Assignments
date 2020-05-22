object CinemaProfit extends App{
  //Calculating the profit of the cinema
  def attendees(price:Int):Int=120+(15-price)/5*20;

  def revenue(price:Int):Int=attendees(price)*price;

  def cost(price:Int):Int=500+attendees(price);

  def profit(price:Int):Int=revenue(price)-cost(price);

  println("Profit of 5rupee ticket is: "+profit(5));
  println("Profit of 10rupee ticket is: "+profit(10));
  println("Profit of 15rupee ticket is: "+profit(15));
  println("Profit of 20rupee ticket is: "+profit(20));
  println("Profit of 25rupee ticket is: "+profit(25));
  println("Profit of 30rupee ticket is: "+profit(30));
  println("Profit of 40rupee ticket is: "+profit(40));
}
