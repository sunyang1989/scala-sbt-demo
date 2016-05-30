/**
  * 函数声明
  *
  * @user sun 
  * @date 2016/5/29
  */
object FunctionDemo {

  /**
    * 递归函数
    */
  def fac(n: Int): Int = {
    if (n <= 0) 1
    else n * fac(n - 1)
  }

  /**
    * 有默认值的函数
    */
  def combine(context: String, left: String = "[", right: String = "]"): String = {
    left + context + right
  }

  /**
    * 可变参数
    */
  def sun(args: Int*): Int = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  def main(args: Array[String]) {
    def addA(x: Int): Int = x + 100 //普通函数声明
    val add = (x: Int) => x + 200 //匿名函数声明

    println("result = " + addA(2))
    println("result = " + add(2))

    println(fac(5))

    println(combine("i love scala"))

    println(sun(1, 2, 3, 4, 5))
  }


}
