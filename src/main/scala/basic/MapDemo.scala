package basic

/**
  * Map
  *
  * @user sun 
  * @date 2016/5/30
  */
object MapDemo {
  def main(args: Array[String]) {
    /**
      * 声明Map 不可变Map immutable
      */
    val map = Map("name" -> 20, "age" -> 10)
    for ((key, value) <- map) {
      println("Key is " + key + ",value is " + value)
    }
    //yield 新生成一个map，组装
    for ((key, value) <- map) yield (key, value * 0.9)

    //可变Map mutable
    val scores = scala.collection.mutable.Map("scala" -> 0, "spark" -> 1, "hadoop" -> 2)
    val hadoopScore = scores.getOrElse("hadoop", 0)
    println("hadoopScore = " + hadoopScore)
    scores += ("storm" -> 3) //添加
    scores -= "hadoop" //删除

    //按照key排序
    val sortedScore = scala.collection.immutable.SortedMap(3 -> "scala", 1 -> "spark", 2 -> "hadoop")
    println(1)

  }
}
