package type_parameterization

/**
  * 自身类型
  *
  * @user sun 
  * @date 2016/6/19
  */

class Self {
  /** 设置this指针的别名为self **/
  self =>
  val tmp = "Scala"

  def foo = self.tmp + this.tmp
}

trait S1

/** this:S1 (S2实例化的时候，必须是S1类型的，自身类型有约束，子类也必须实现约束，如S3) **/
class S2 {
  this: S1 =>
}

class S3 extends S2 with S1

trait T {
  this: S1 =>
}

object S4 extends T with S1

object Self_Types {

  def main(args: Array[String]) {
    class Outer {
      outer =>
      val v1 = "Spark"

      class Inner {
        println(outer.v1)
      }

    }
    val c = new S2 with S1
  }

}
