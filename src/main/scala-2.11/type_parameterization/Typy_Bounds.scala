package type_parameterization

/**
  * 上界限定，下界限定
  * T <: Comparable[T]：T必须是Comparable的子类
  * T >: Comparable[T]：T必须是Comparable的父类
  *
  * @user sun 
  * @date 2016/6/13
  */

//class Pair[T](val first : T, val second : T)
class Pair[T <: Comparable[T]](val first: T, val second: T) {
  def bigger = if (first.compareTo(second) > 0) first else second
}

class Pair_Lower_Bound[T](val first: T, val second: T) {
  def replaceFirst[R >: T](newFirst: R) = new Pair_Lower_Bound[R](newFirst, second)
}

object Typy_Bounds {
  def main(args: Array[String]) {
    val pair = new Pair("Spark", "Hadoop")
    println(pair.bigger)
  }
}
