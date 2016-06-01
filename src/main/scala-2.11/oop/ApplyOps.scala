package oop

/**
  * apply：方法，在伴生对象中实现伴生类的apply方法
  *
  * @user sun 
  * @date 2016/6/1
  */
class ApplyDemo {
  //伴生类
  def print() = println("普通方法")

  def apply() = println("伴生类的apply方法") //伴生类中apply方法可有可无
}

object ApplyDemo {
  //伴生对象
  def apply(): ApplyDemo = {
    //实现apply方法，返回一个伴生类的实例
    println("执行半生对象的apply方法")
    new ApplyDemo
  }
}

object ApplyOps {
  def main(args: Array[String]) {
    val b = new ApplyDemo() //new 一个实例
    b() //直接调用伴生类里面的apply方法

    val a = ApplyDemo() //直接获得一个实例,不需要new，实际调用伴生对象里面的apply方法
    a.print()
  }
}
