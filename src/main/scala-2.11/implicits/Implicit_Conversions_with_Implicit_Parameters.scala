package implicits

/**
  * 隐式参数 隐式转换
  *
  * @user sun 
  * @date 2016/6/19
  */
object Implicit_Conversions_with_Implicit_Parameters {
  def main(args: Array[String]) {
    //ordered 隐式参数
    //a b 都是Ordered类型，隐式转换
    def bigger[T](a: T, b: T)(implicit ordered: T => Ordered[T])
    = if (a > b) a else b
    println(bigger(4, 3))
    println(bigger(4.2, 3))
    println(bigger("Spark", "Hadoop"))
  }
}
