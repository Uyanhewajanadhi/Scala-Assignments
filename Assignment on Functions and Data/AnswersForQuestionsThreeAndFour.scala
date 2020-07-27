object AnswersForQuestionsThreeAndFour extends App {

  class Account(id: String, n: Int, d: Double) {
    val NIC: String = id;
    val acNumber: Int = n;
    var balance: Double = d;

    def withdraw(a: Double) = {
      this.balance = this.balance - a;
    }

    def deposit(a: Double) = {
      this.balance = this.balance + a;
    }

    def transfer(a: Account, m: Double) = {
      this.withdraw(m);
      a.deposit(m);
    }
    override def toString: String = "AccNo: "+this.acNumber + " And Balance: "+ this.balance

    val find = (n: String, b: List[Account]) =>
      b.filter(x => x.NIC.equals(n))
  }


  var ac1=new Account("987290293V",10060,12000.00);
  var ac2=new Account("681383819V",10239,111.00);
  var ac3=new Account("913445393V",10060,0.00);
  var ac4=new Account("681314519V",10239,30000.00);
  var ac5=new Account("652290293V",10060,-120.00);
  var ac6=new Account("981316724V",10239,8000.00);
  var bank: List[Account]=List(ac1,ac2,ac3,ac4,ac5,ac6);

  val overdraft=(b: List[Account])=>b.filter(x=>x.balance<0);
  //val balance= (b: List[Account]) => b.reduce(_+_)

  val calInterest=(b: List[Account])=>b.map(x=>if(x.balance>0) x.balance+x.balance*0.05 else x.balance+x.balance*0.1)

  printf("\nAccount balance of ac1 before transfering is: "+ac1.balance);
  printf("\nAccount balance of ac2 before transfering is: "+ac2.balance);

  ac1.transfer(ac2,500.00);

  printf("\nAccount balance of ac1 after transfering is: "+ac1.balance);
  printf("\nAccount balance of ac2 after transfering is: "+ac2.balance);



  println("\nAccounts with negative balances: " + overdraft(bank));
  //println("\nSum of all accounts: " + balance(bank));



  println("Account balances after adding the interest: " + calInterest(bank));


}