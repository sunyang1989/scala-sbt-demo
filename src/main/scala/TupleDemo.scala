/**
  * Tuple 元组:下标从1开始
  *
  * @user sun 
  * @date 2016/5/30
  */
object TupleDemo {

  /**
    * 声明Tuple(元组)
    */
  val tuple = ("sun", "java", "scala", 1, 3)
  println(tuple._1)
  //元素下标从1开始

  //全部结束
  val (first, second, third, fourth, fifth) = tuple
  //无用的参数可以用_代替
  val (f, s, _, _, _) = tuple

  //判断，符合条件的一组，不符合条件的一组
  //返回一个tuple(String,String)
  "sun yang".partition(_.isUpper)

  val s1 = Array("[", "-", "]")
  val counts = Array(2, 5, 2)
  //zip 拉链操作，pairs类型：Array[(String,Int)]
  val pairs = s1.zip(counts)
  for ((x, y) <- pairs) Console.print(x * y)

  //输出 [[-----]]

  def main(args: Array[String]) {

  }
}
