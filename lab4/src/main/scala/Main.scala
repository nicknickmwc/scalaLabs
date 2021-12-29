object Main {
  def main(args:Array[String]):Unit = {
    println(Adts.testGetNth(List(1,2,3,4,5,6),2))
    println(Adts.testDouble(Some(5)))
    println( Adts.testIsEven(9))
    println(Adts.testSafeDivide(10,0))
    println( Adts.testGoodOldJava(_.toInt, "123"))
    println(Maps.testGroupUsers(Seq(Maps.User("User1", 35) , Maps.User("User2", 54), Maps.User("User3", 28), Maps.User("User4", 10))))
    println(Maps.testNumberFrodos {Map("First User" -> Maps.User("User1", 35), "Second User" -> Maps.User("User2", 54), "Third User" -> Maps.User("User3", 28), "Fourth User" -> Maps.User("User4", 10))})
    println(Maps.testUnderaged {Map("First User" -> Maps.User("User1", 35), "Second User" -> Maps.User("User2", 54), "Third User" -> Maps.User("User3", 28), "Fourth User" -> Maps.User("User4", 10))})
    println(Sequence.testLastElement(Seq(1,2,3,4,5,6)))
    println(Sequence.testZip(Seq(1,2), Seq(3,4,5,6)))
    println(Sequence.testForAll(Seq(1,2,3,4,5,6))( _ >= 3))
    println(Sequence.testPalindrom(Seq(1,2,3,2,1)))
    println(Sequence.testFlatMap(Seq(1,2,3,4,5,6))(value => Seq(value * 2)))
    println(Strings.testUppercase("hello"))
    println(Strings.testInterpolations("Nikolai", 19))
    println(Strings.testComputation(2,28))
    println(Strings.testTakeTwo("hello"))
  }
}