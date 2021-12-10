class Animal(val nameOfA: String,val speciesForA: String, val foodForA: String) {
  private var nameOfAnimal: String = nameOfA
  private var speciesOfAnimal: String = speciesForA
  private var foodForAnimal: String = foodForA
  def spec() {
    return this.speciesForA
  }
  object Animal{
    def main(args: Array[String]): Unit = {
      val cat = new Animal("cat","mammal","meat")
      val parrot = new Animal("parrot","bird","vegetables")
      val goldfish = new Animal("goldfish","fish","plants")
      println(cat.spec())
    }
  }
}