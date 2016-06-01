package oop

/**
  * 内部类
  *
  * @user sun 
  * @date 2016/6/1
  */
class Outer(val name: String) {
  /**
    * outer 定义一个外部类的名称，内部类中可以引用
    * 内部类属于对象私有的，不是类
    */
  outer =>

  class Inner(val name: String) {
    def foo(b: Inner) = println("Outer: " + outer.name + ", Inner: " + b.name)
  }

}

object InnerDemo {
  def main(args: Array[String]) {
    val outer1 = new Outer("outer1")
    val outer2 = new Outer("outer2")
    val inner1 = new outer1.Inner("inner1")
    val inner2 = new outer2.Inner("inner2")
    inner1.foo(inner1)
    //inner1.foo(inner2)//Error 内部类属于对象私有的，不是类
  }
}
