package dataset

/**
  * List基本操作
  *
  * @user sun 
  * @date 2016/6/10
  */
object List_Basic_Ops {
  def main(args: Array[String]) {

    val bigData = List("Hadoop", "Spark")
    val data = List(1, 2, 3)

    val bigData_Core = "Hadoop" :: ("Spark" :: Nil)

    /** ::（拼接成List） **/
    val data_Int = 1 :: 2 :: 3 :: Nil

    println(data.isEmpty)
    println(data.head)
    println(data.tail.head)

    val List(a, b) = bigData
    println("a : " + a + " === " + " b: " + b)
    val x :: y :: rest = data
    println("x : " + x + " === " + " y: " + y + " === " + rest)

    val shuffledData = List(6, 3, 5, 6, 2, 9, 1)
    println(sortList(shuffledData))

    /** 简单递归排序 **/
    def sortList(list: List[Int]): List[Int] = list match {
      case List() => List()
      case head :: tail => compute(head, sortList(tail))
    }

    def compute(data: Int, dataSet: List[Int]): List[Int] = dataSet match {
      case List() => List(data)
      case head :: tail => if (data <= head) data :: dataSet
      else head :: compute(data, tail)
    }

  }
}
