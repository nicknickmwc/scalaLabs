import Functions.{testCircle, testRectangleCurried, testRectangleUc}
import HigherOrder.{plus, testAnonymousNTimes, testNTimes}
import PatternMatching.{Bird, Mammal, Paper, Rock, testExtractMammalWeight, testIntToString, testIsEven, testIsMaxAndMoritz, testUpdateFood, testWinsA}

object App {
  def main(args: Array[String])= {
    println("Classes:");
    println("Parrot: : " + Animal.apply("parrot"))
    println("Cat eats meat: " + Animal.cat.eats(Meat()))
    println("Known animal Barsik: " + Animal.knownAnimal("Barsik"))
    println("Has meat: " + Food.apply("meat"))
    print("\n")
    println("Functions: ");
    println("testCircle: " + testCircle(1))
    println("testRectangleCurried: " + testRectangleCurried(5, 6))
    println("testRectangleUc: " +  testRectangleUc(5, 6))
    print("\n")
    println("HiOrder: ")
    println("testNTimes: " + testNTimes(plus, 10, 5, 2))
    println("testNTimes: " + testAnonymousNTimes(10, 5, 2))
    print("\n")
    println("Patterns: ")
    println("testIntToString: " + testIntToString(3))
    println("testIsMaxAndMoritz: " + testIsMaxAndMoritz("max"))
    println("testIsEven: " + testIsEven(2))
    println("rock scissors paper testWinsA: " + testWinsA(Paper, Rock))
    val humman = Mammal("Me", PatternMatching.Meat, 20)
    val bird = Bird("Man", PatternMatching.Vegetables)
    println("testExtractMammalWeight: " + testExtractMammalWeight(humman))
    println("testUpdateFood: " + testUpdateFood(bird))
  }
}
