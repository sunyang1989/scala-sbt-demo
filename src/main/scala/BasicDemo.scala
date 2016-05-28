/**
  * object 里面的都是静态代码块，没有主动调用也会执行
  *
  * @author sun
  * @date 2016/5/28
  */
object BasicDemo {

  /**
    * 代码块声明
    */
  var line = ""
  do {
    println("静态代码块，主动执行！")
    line = readLine()
    println("Read：" + line)
  } while (!line.isEmpty)

  /**
    * 方法声明
    *
    * @param x 参数x
    * @param y 参数y
    * @return long
    */
  def doWhile(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  /**
    * 程序入口
    */
  def main(args: Array[String]) {
    println("123")

    //for 循环
    for (i <- 1.to(10)) {
      print(i + " ")
    }

    println()
    println(doWhile(100, 298))

    /**
      * 异常声明
      */
    try {
      val half = if (99 % 2 == 0) 0 else throw new RuntimeException("number must be event")
      println(half)
    } catch {
      case e: Exception => println("获取异常! " + e.getMessage)
    } finally {
      println("已经捕获异常")
    }
  }
}
