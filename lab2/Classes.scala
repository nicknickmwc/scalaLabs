package exercise1

/* 
 * 
 a) Создать класс Animal, который имеет следующие поля:
 *      - name: String (название)
 *      - species: String (вид)
 *      - food: String
 */
trait Animal{

  val nameOfAnimal: String
  val foodForAnimal: Food
  //val speciesOfAnimal: String

  /*
 *    Синтаксис: class MyClass(val publicField: Int, privateField: String) {
 *              // остальные поля и методы
 *            }
 *
 * b) Создайте объект-компаньон для класса Animal и добавьте следующие сущности как поля:
 *      - cat, mammal, meat
 *      - parrot, bird, vegetables
 *      - goldfish, fish, plants
 */
  object Animal{
//      val parrot = new Animal("parrot","bird","vegetables")
//      val goldfish = new Animal("goldfish","fish","plants")
    def knownAnimal(name:String):Boolean={
  return name=="cat"||name=="parrot"||name=="goldfish"
}
    def apply(name:String):Option[Animal]=new Some[Animal]()
  }
 /*    Синтаксис: object MyClass {
 *              // статические поля и методы
 *            }
 * 
 * c) Добавьте следующие метод в Animals:
 *      def eats(food: String): Boolean
 */
  def eats(food: Food): Boolean
}
 /*     который проверяет ест ли животное определенную пищу
 * 
 * d) Переопределите ваш класс Animal как трейт и создайте объекты класса-образца для Mammals, Birds и Fishs.
 *    Вам все еще нужно поле `species`?
 */
 case class Mammals(val nameOfA:String, val foodForA:Food) extends Animal {

    val nameOfAnimal: String = nameOfA
    val foodForAnimal: Food = foodForA

   override def toString: String = nameOfAnimal

   object Mammals{

   }

   override def eats(food: Food): Boolean = {
     return food==foodForAnimal
   }
 }
case class Birds(val nameOfA:String, val foodForA:Food) extends Animal {

   val nameOfAnimal: String = nameOfA
   val foodForAnimal: Food = foodForA

  object Birds{

  }

  override def eats(food: Food): Boolean = {
    return food==foodForAnimal
  }
}
case class Fish(val nameOfA:String, val foodForA:Food) extends Animal {

   val nameOfAnimal: String = nameOfA
   val foodForAnimal: Food = foodForA

  object Fish{

  }

  override def eats(food: Food): Boolean = {
    return food==foodForAnimal
  }
}

 /* e) Добавьте следующие функции в объект-компаньон Animal:
 *      def knownAnimal(name: String): Boolean  // true если это имя одного из трех животных из (b)
 *      def apply(name: String): Option[Animal] // возвращает одно из трех животных в соответствии с именем (Some) или ничего (None), см. ниже
 * 
 * f) Создайте трейт Food со следующими классами-образцами:
 *      - Meat
 *      - Vegetables
 *      - Plants
 */
 sealed trait Food
case object Meat       extends Food
case object Vegetables extends Food
case object Plants     extends Food
 /*   и добавьте это в определение Animal. Так же добавьте объект-компаньон с методом apply():
 *      def apply(food: String): Option[Food]
 */

sealed trait Option[A] {
 
  def isEmpty: Boolean
}
case class Some[A](a: A) extends Option[A] {
  val isEmpty = false
  val getName: String = a.toString
}
case class None[A]()     extends Option[A] {
  val isEmpty = true
}
