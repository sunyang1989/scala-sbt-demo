package basic

/**
  * for 循环
  *
  * @user sun 
  * @date 2016/5/29
  */
object ForDemo {
  def main(args: Array[String]) {
    /**
      * 普通for循环
      */
    for (i <- 1 to 2; j <- 1 to 2)
      print("%d ".format(100 * i + j))

    println

    /**
      * for循环中if条件
      */
    for (i <- 1 to 2; j <- 1 to 2; if i != j)
      print("%d ".format(100 * i + j))

    println
  }
}
