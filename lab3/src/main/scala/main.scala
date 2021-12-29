object main {
  def main(args: Array[String]):Unit = {
    println(Compositions.testCompose((a:Int)=> a*2)((b:Int)=>b*5)((c:Int)=>Math.sqrt(c)*100)(10))
    println(Compositions.testCompose((a: Int) => a * 1)((b: Int) => b * 2)((c: Int) => c * 3)(2))
    println(RecursiveFunctions.testReverse(Cons(5,Cons(2,Cons(1, Nil())))))
    println(RecursiveFunctions.testMap(Cons(5,Cons(2,Cons(1, Nil()))),(a:Int)=>a+2))
    println(RecursiveFunctions.testFlatMap(Cons(5,Cons(2,Cons(1, Nil()))),(a:Int)=>Cons(a+2,Nil())))
    println(RecursiveData.testListIntEmpty(Cons(1,Nil())))
    println(RecursiveData.testListIntHead(Cons(1,Nil())))
  }
}