/**
  * regex：正则表达式
  *
  * @user sun 
  * @date 2016/6/4
  */
object RegexDemo {
  def main(args: Array[String]) {
    //声明一个regex，三个"代表原声，不转义
    val regex =
      """([0-9]+) ([a-z]+)""".r
    //声明一个regex，一个"代表会转义
    val numPattern = "[0-9]+".r

    val str = "9935 scala .> < 2 23 spark"
    for (matchStr <- numPattern.findAllIn(str)) println(matchStr)
    println(numPattern.findFirstIn(str))

    /** 模式匹配 **/
    val line = "9999 scala"
    line match {
      case regex(num, context) => println(num + " " + context)
      case _ => println("other...")
    }
  }
}
