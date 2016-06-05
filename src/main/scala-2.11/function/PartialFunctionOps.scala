package function

/**
  * 偏函数 定义：偏函数是只对函数定义域的一个子集进行定义的函数。
  * 当函数有多个参数，而在使用该函数时不想提供所有参数（比如函数有3个参数），只提供0~2个参数，此时得到的函数便是偏函数。
  *
  * @user sun 
  * @date 2016/6/5
  */
object PartialFunctionOps {

  def main(args: Array[String]) {
    val data = List(1, 2, 3, 4, 5, 6)
    data.foreach(println _)
    data.foreach(x => println(x))

    def sum(a: Int, b: Int, c: Int) = a + b + c
    println(sum(1, 2, 3))

    val fp_a = sum _
    println(fp_a(1, 2, 3))
    println(fp_a.apply(1, 2, 3))
    val fp_b = sum(1, _: Int, 3)
    println(fp_b(2))
    println(fp_b(10))

    data.foreach(println(_))
    data.foreach(println)
  }
}
