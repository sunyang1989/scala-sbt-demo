package type_parameterization

import scala.reflect.ClassTag

/**
  * Manifest：一般声明数组必须定义该数组的类型。声明泛型数组时使用，在运行时会定义该泛型类的实际类型(Manifest存储实际类型，隐式转换)
  * classManifest：不常用
  * ClassTag：泛型时使用，在运行时告诉jvm该实际类型，编译时不需要知道实际类型，ClassTag会存储该类的实际类型，运行时告诉jvm
  * TypeTag：包含更多的静态信息，不常用。ClassTag足够使用
  *
  * @user sun 
  * @date 2016/6/13
  */
class A[T]

object Manifest_ClassTag {
  def main(args: Array[String]) {

    /** 不推荐这种写法 **/
    def manif[T](x: List[T])(implicit m: Manifest[T]) = {
      if (m <:< manifest[String])
        println("List strings")
      else
        println("Some other type")
    }
    /** 推荐这种写法 **/
    def arrayMake[T: Manifest](first: T, second: T) = {
      val r = new Array[T](2);
      r(0) = first;
      r(1) = second;
      r
    }
    arrayMake(1, 2).foreach(println)

    def mkArray[T: ClassTag](elems: T*) = Array[T](elems: _*)
    mkArray(42, 13).foreach(println)
    mkArray("Japan", "Brazil", "Germany").foreach(println)

    manif(List("Spark", "Hadoop"))
    manif(List(1, 2))
    manif(List("Scala", 3))

    val m = manifest[A[String]]
    println(m)
    val cm = classManifest[A[String]]
    println(cm)
  }
}
