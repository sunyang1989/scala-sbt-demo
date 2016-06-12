package dataset

/**
  * List 的object提供的方法
  *
  * @user sun 
  * @date 2016/6/10
  */
object List_Object_Ops {
  def main(args: Array[String]) {
    println(List.apply(1, 2, 3))
    println(List.range(1, 5))
    println(List.range(9, 1, -3))

    val zipped = "abcde".toList.zip(List(1, 2, 3, 4, 5))
    println(zipped)
    println(zipped.unzip)

    println(List(List('a', 'b'), List('c'), List('d', 'e')).flatten)
    println(List.concat(List(), List('b'), List('c')))

  }
}
