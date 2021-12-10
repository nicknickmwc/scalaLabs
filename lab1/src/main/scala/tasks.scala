import java.util.Scanner
import scala.{:+, ::}
import scala.collection.immutable
import scala.collection.immutable.Nil.:::

object tasks {

  def signum(n:Double):Int={
    if (n<0) return -1
    else if (n==0) return 0
    else return 1
  }

  def countdown(n:Int)= {
    if (signum(n) == 1) {
      for (i <- (n+1) to 0 by -1) {
      println(i)
    }
    }
    else {
      for (i<-n to 0){
        println(i)
      }
    }
  }
  def product(s:String): Int ={
    var n=1
    s.foreach(n *= _.toInt)
    return n
  }
  def product1(s:String):Int={
    if (s.length()>1) return s.take(1).charAt(0).toInt*product(s.drop(1))
    else return s.charAt(0)
  }
  def xn(n:Int)(x:Int)(y:Int): Int = n > 0 match {
    case true => n%2 match {
      case 0 => y*2
      case _ => x*x*n-1
    }
    case false => n==0 match {
      case true => 0
      case false => 1/x-n
    }
  }

  def main(args: Array[String]):Unit={
    //1.
    println("1. Переменные res – это значения val")
    //2.
    println("2. crazy*3 = "+"crazy"*3)
    //3.
    print("3. Метод max определяет наибольшее число. Определен в классе RichInt. 10 max 2 = ")
    println(10 max 2)
    //4.
    println("4. 2^1024 = "+BigInt(2).pow(1024))
    //5.
    import scala.util.Random
    import scala.math.BigInt.probablePrime
    println("5. "+probablePrime(100, new Random()))
    //6.
    println("6. "+probablePrime(100, new Random()).toString(36))
    //7.
    val sv = "scala"
    val first1 = sv.take(1)
    val first2 = sv.head
    val tail2 = sv.takeRight(1)
    println("7. ")
    println("   Первый символ способ 1 - "+first1)
    println("   Первый символ способ 2 - "+first2)
    println("   Последний символ - "+tail2)
    //8.
    println("8. ")
    //println(s.substring(1,4))
    println("Преимущество take, takeRight состоит в том, что, не зная длину строки, можно взять первый или последний ее" +
      "символ. Преимущество drop и dropRight аналогично, только первый или последний символ вырезаются" +
      "Преимущество substring в том, что этот метод позволяет получить определенную подстроку по ее первому и конечному индексу")
    //9.
    println("9. "+signum(-6))
    //10.
    def f()={}
    println("10. "+"Блок {} возвращает "+f()+" тип Unit")
    //11.
    println("11. ")
    for (i<-10 to 1 by -1) {
      print(i+" ")
    }
    println()
    //12.
    println("12.")
    countdown(-6)
    //13.
    println("13. Введите строку")
    val sc = new Scanner(System.in);
    val str = sc.nextLine();
    var n=1
    for (i<-str) {
      n=n*i.toInt
    }
    println(n)
    //14.
    n=1
    str.foreach(n *= _.toInt)
    println("14. "+n)
    //15.
    println("15. "+product(str))
    //16.
    println("16. "+product1(str))
    //17.
    println("17. "+xn(5)(1)(3))
    //18.
    def diffNums(num:Int):Boolean = {
      var list:List[Int]=List()
      num.toString.foreach{x=>list=list:+x}
      for (i<-0 to list.length-1) {
        for (y<-i+1 to list.length-1){
          if(list(i)==list(y)) return false
        }
      }
      return true
    }
    def function18(m:Int,n:Int):Int={
      var numbs:List[Int]=List()
      return Range(m,n).filter(x=> diffNums(x)==true).sum
    }
    println("18 "+function18(1,11))
    //19.
    val listEx = List(1,2,List(3,4)::Nil)
    var newList:List[Int]=List()
    def toIntList(list: List[Any]): List[Int] = {
      list.foreach{
        case n: List[Int]=>toIntList(n)
        case n: Int => newList=newList:+n
      }
      return newList
    }
    println("19 "+toIntList(listEx))
    //20.
    def maxDelit(n:Int): Int={
      for (i<-n-1 to 2 by-1){
        if(n%i==0) return i
      }
      return 1
    }
    def numbsSum(n:Int):Int={
      var sum=0
      var nn=n
      while (nn!=0){
        sum+=(nn%10).intValue()
        nn=(nn/10).intValue()
      }
      return sum
    }
    //println(maxDelit(26))
    println("20 "+numbsSum(maxDelit(26)))
    //21
    def newList21(list:List[Any],n:Int): List[Any]={
      var list2:List[Any]=List()
      list.foreach(item=>Range(0,n).foreach((_)=>list2=list2:+item))
      return list2
    }
    println("21 "+newList21(List(1,2,3),2))
    //22
    def minDelit(n1:Int,n2:Int):Int={
      var i=2
      while ((i!=n1)||(i!=n2)) {
        if ((n1%i==0)&&(n2%i==0)) {return i}
        i+=1
      }
      return 1
    }
    println("22. "+minDelit(260,39))
    //23
    def newList23(list:List[Any],n:Int): List[Any]={
      var list2:List[Any]=List()
      var q=0
      for (s<-list){
        q+=1
        if(q%n!=0){
          list2=list2:+s
        }
      }
      return list2
    }
    println(newList23(List(7,4,3,9),2))
    //24
    def fact(n:Int):Int={
      if (n==1) return 1
      return n*fact(n-1)
    }
    def function24(n:Int,k:Int):Double={
      return fact(n)/fact(n-k)
    }
    println("24. "+function24(4,2))
    //25
    def newList25(list:List[Any],n:Int): List[Any]={
      var list2:List[Any]=List()
      if(n==0) return list2
      else if(n>0) {
        for(i<-n to list.length-1) {
          list2=list2:+list(i)
        }
        for(i<-0 to n-1) {
          list2=list2:+list(i)
        }
      }
      else if(n<0) {
        var z = -n
        for(i<-list.length-z to list.length-1) {
          list2=list2:+list(i)
        }
        for(i<-0 to list.length-z-1) {
          list2=list2:+list(i)
        }
      }
      return list2
    }
    println("25 "+newList25(List(1,2,3,4,5),-2))
    //26
    def perfectNum(n:Int):Int={
      return Range(1,n).filter(i=>i==Range(1,i).filter(i2=>i%i2==0).sum).max
    }
    println("26 "+perfectNum(7))
    //27
    def newList27(list:List[Any],s:String): List[Any]={
      var list2:List[Any]=List()
      if (s=="Четные") {
        for (i <- 0 to list.length - 1) {
          if (i%2==0) {
            list2=list2:+list(i)
          }
        }
      }
      else {
        for (i <- 0 to list.length - 1) {
          if (i%2!=0) {
            list2=list2:+list(i)
          }
        }
      }
      return list2
    }
    println("27. ")
    println("Список элементов с четными индексами"+newList27(List(3,256,78,321,55,5),"Четные"))
    println("Список элементов с нечетными индексами"+newList27(List(3,256,78,321,55,5),"Нечетные"))
    //28
    def function28(n:Int):Int={
      var z=0
      var result=0
      for (i<-2 to n) {
        if (numbsSum(i) != 1) {
          z = 0
          while (Math.pow(numbsSum(i), z) <= n) {
            if ((Math.pow(numbsSum(i), z) == n)&&(i>result)) result = i
            z += 1
          }
        }
      }
      return result
    }
    println("28. "+function28(121))
    //29
    var listInt:List[Int]=List()
    var listString:List[String]=List()
    def function29(list: List[Tuple2[Int,String]]):Unit={
      list.foreach{s=>
        listInt=listInt:+s._1
        listString=listString:+s._2
      }
    }
    function29(List((1,"a"),(2,"b")))
    println("29.")
    println(listInt)
    println(listString)
  }
}
