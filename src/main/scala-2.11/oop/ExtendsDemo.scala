package oop

/**
  * extends：继承
  *
  * @user sun 
  * @date 2016/6/1
  */
class Person(val name: String, var age: Int) {
  //val、var声明了2个Person的成员属性
  println("父类主构造器")
  val school = "hope school"

  def sleep = "8 hours"

  override def toString = "I am a Person!"
}

class Worker(name: String, age: Int, val sex: String) extends Person(name, age) {
  //val、var声明了2个Person的成员属性
  println("子类主构造器")
  override val school = "hope school"

  override def toString = "I am a Worker! " + super.sleep
}

object ExtendsDemo {
  def main(args: Array[String]) {
    val worker = new Worker("sun", 10, "boy")
    println(worker.toString)
  }
}
