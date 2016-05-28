/**
  * Tuple、Array、Map 声明
  * @author sun
  * @date 2016/5/28
  */
object CollectionDemo {

  def main(args: Array[String]) {

    /**
      * 声明Tuple(元组)
      */
    val tuple = ("sun","java","scala")
    println(tuple._1)//元素下标从1开始

    /**
      * 声明Array
      */
    val array = Array(0,"java","scala")

    for(i <- array.indices){//遍历数组下标
      print("%s ".format(array(i)))
    }
    for(i <- array){//遍历数组
      print("%s ".format(i))
    }
    println()

    /**
      * 声明Map
      */
    val map = Map("java" -> true, "scala" -> false)
    for((key,value) <- map){
      println("Key is " + key + ",value is " + value)
    }
  }
}
