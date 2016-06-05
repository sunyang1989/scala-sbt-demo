package function

/**
  * 柯里化：可以用于参数类型推断 etc
  *
  * @user sun 
  * @date 2016/6/5
  */
object Curring {
  def main(args: Array[String]) {
    def multiple(x: Int, y: Int) = x * y
    def multipleOne(x: Int) = (y: Int) => x * y
    println(multipleOne(6)(7))

    def curring(x: Int)(y: Int) = x * y

    println(curring(10)(10))

    val a = Array("Hello", "Spark")
    val b = Array("hello", "spark")

    /** 使用柯里化，参数类型推断 **/
    println(a.corresponds(b)(_.equalsIgnoreCase(_)))

  }
}
