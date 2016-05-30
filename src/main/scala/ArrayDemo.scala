import scala.collection.mutable.ArrayBuffer

/**
  * 数组 Array ArrayBuffer
  * 二位数组
  *
  * @user sun 
  * @date 2016/5/29
  */
object ArrayDemo {

  println("执行静态代码块！")

  /**
    * 数组定义
    */
  val array1 = new Array[Int](10)
  val array2 = Array("java", "scala")
  //数组值改变
  array2(0) = "one"
  for (elem <- array2) print(elem + " ")
  println()
  for (i <- array1.indices) {
    //遍历数组下标
    print("%s ".format(array1(i)))
  }

  /**
    * ArrayBuffer数组缓冲 操作
    */
  val arrayBuffer = ArrayBuffer[Int]()
  arrayBuffer += 1
  println(arrayBuffer.toString())
  arrayBuffer +=(1, 3, 2, 4, 5)
  println(arrayBuffer.toString())
  arrayBuffer ++= Array(6, 7, 8)
  println("++= Array = " + arrayBuffer.toString())
  arrayBuffer.trimEnd(5) //去除后面的5个元素
  println("trimEnd(5) = " + arrayBuffer.toString())
  arrayBuffer.insert(2, 1, 2, 3, 4) //从第三位开始插入几个元素
  println("insert(2,1,2,3,4) = " + arrayBuffer.toString())
  arrayBuffer.remove(2, 4) //去除元素，从第三位开始，一共去除4个元素
  println("remove(2,4) = " + arrayBuffer.toString())

  println("max = " + arrayBuffer.max)
  println("sum = " + arrayBuffer.sum)
  println("sorted = " + arrayBuffer.sorted)

  val array = arrayBuffer.toArray //转数组
  for (elem <- array) print(elem)
  println()

  /**
    * 操作Array
    */
  val ary = Array(2, 3, 5, 7, 8)
  //val result = for(elem <- ary if elem%2==0 ) yield 2*elem
  val result = ary.filter(_ % 2 == 0).map(2 * _)
  for (elem <- result) print(elem)
  println()

  val e = Array(1, 2, 5, 3)
  scala.util.Sorting.quickSort(e)
  val ss = e.mkString(" and ")
  println(ss)
  val sss = e.mkString("<", ",", ">")
  println(sss)

  /**
    * 二位数组(矩阵)
    */
  val jz = Array.ofDim[Double](3, 4)
  jz(2)(1) = 42
  println(jz)

  val tr = new Array[Array[Int]](3)
  for (i <- 0 until tr.length) {
    tr(i) = new Array[Int](i + 1)
  }
  println(tr)

  def main(args: Array[String]) {

  }
}
