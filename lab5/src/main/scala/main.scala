object Main {
  def main(args: Array[String])={
    println(Typeclasses.testReversableString("ialokin"))
    println(Typeclasses.testSmashInt(14,88))
    println(Typeclasses.testSmashDouble(2.3,2.2))
    println(Typeclasses.testSmashString("Nik","olai"))
  }
}