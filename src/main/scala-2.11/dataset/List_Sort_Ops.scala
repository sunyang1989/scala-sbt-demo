package dataset

/**
  * 对List排序
  *
  * @user sun
  * @date 2016/6/10
  */
object List_Sort_Ops {
  def main(args: Array[String]) {
    println(mergedsort((x: Int, y: Int) => x < y)(List(3, 7, 9, 5)))
    val reversed_mergedsort = mergedsort((x: Int, y: Int) => x > y) _
    println(reversed_mergedsort(List(3, 7, 9, 5)))
  }

  def mergedsort[T](less: (T, T) => Boolean)(input: List[T]): List[T] = {
    def merge(xList: List[T], yList: List[T]): List[T] = {
      (xList, yList) match {
        case (Nil, _) => yList
        case (_, Nil) => xList
        case (x :: xtail, y :: ytail) =>
          if (less(x, y)) x :: merge(xtail, yList)
          else y :: merge(xList, ytail)
      }
    }
    val n = input.length / 2
    if (n == 0) input
    else {
      val (x, y) = input splitAt n //把要排序的列表input平均分成两个列表
      merge(mergedsort(less)(x), mergedsort(less)(y)) //先对分后的两个列表归并排序，再对排好的有序表进行归并
    }
  }


}
