object ceaserCipher extends App {

  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def Encryption=(c:Char,key:Int,str:String)=>{
    str((str.indexOf(c.toUpper)+key%str.size));
  }

  def Decryption=(c:Char,key:Int,str:String)=>{
    str((str.indexOf(c.toUpper)-key%str.size));
  }

  def cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,str:String)=>s.map(algo(_,key,str))

  val s="Hello"
  val ct=cipher(Encryption,s,5,alphabet)
  printf("Encrypted Code: "+ct);

  val at=cipher(Decryption,ct,5,alphabet)
  printf("\nDecrypted Code: "+at);

}

