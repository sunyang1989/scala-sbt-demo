package dataset

/**
  * List 初级应用
  *
  * @user sun 
  * @date 2016/6/10
  */
object List_FirstOrder_Ops {
  def main(args: Array[String]) {

    /** :::(拼接list对象) **/
    println(List(1, 2, 3, 4) ::: List(4, 5, 6, 7, 8) ::: List(10, 11))
    println(List(1, 2, 3, 4) ::: (List(4, 5, 6, 7, 8) ::: List(10, 11)))
    println(List(1, 2, 3, 4).length)

    val bigData = List("Hadoop", "Spark", "Kaffka")
    println(bigData.last) //最后一个元素
    println(bigData.init) //除去最后一个元素之外的其他元素
    println(bigData.reverse) //反转
    println(bigData)
    println(bigData take 2) //取出2个元素
    println(bigData drop 1) //删除1个元素
    println(bigData splitAt 2) //在index=2的位置split
    println(bigData apply 2) //取出index=2的元素
    println(bigData(2))

    val data = List('a', 'b', 'c', 'd', 'e', 'f')
    println(data.indices) //元素的index
    println(data.indices zip data) //拉链操作
    println(data.zipWithIndex)
    println(data.toString)
    println(data.mkString("[", ",,", "]"))
    println(data.mkString("******"))
    println(data mkString)

    val buffer = new StringBuilder
    data.addString(buffer, "(", ";;", ")") //将data按照固定格式操作后放入buffer
    println(buffer)
    println(data)

    val array = data.toArray //转数组
    println(array.toList) //转list

    val new_Array = new Array[Char](10)
    data.copyToArray(new_Array, 3) //复制元素到Array，3：跳过前面3个元素
    new_Array.foreach(print)
    println

    val iterator = data.toIterator //迭代
    println(iterator.next)
    println(iterator.next)
  }
}
