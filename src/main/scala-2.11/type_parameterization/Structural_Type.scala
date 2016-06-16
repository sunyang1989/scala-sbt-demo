package type_parameterization

/**
  * 结构类型(类型具有某种结构)
  *
  * @user sun 
  * @date 2016/6/16
  */
class Structural {
  def open() = print("A class instance Opened")
}

object Structural_Type {

  def main(args: Array[String]) {

    /** new 一个匿名类型，具有open方法 **/
    init(new {
      def open() = println("Opened")
    })

    /** X是匿名类型，具有open方法 **/
    type X = {def open(): Unit}
    def init(res: X) = res.open
    init(new {
      def open() = println("Opened again")
    })

    /** object类型 **/
    object A {
      def open() {
        println("A single object Opened")
      }
    }
    init(A)

    //对象
    val structural = new Structural
    init(structural)

  }

  /** res是一个对象，该对象没有指明类型，只声明了要具有open方法 **/
  def init(res: {def open(): Unit}) {
    res.open
  }
}
