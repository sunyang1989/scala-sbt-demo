package oop

/**
  * 构造器
  *
  * @user sun 
  * @date 2016/5/31
  */
class ConstructorDemo1 {
  //类名后面的()省略，默认有空的主构造器
  private val age = 27
  //类私有(其他对象也能访问)，get、set方法也私有
  private[this] val sex = "boy"
  //对象私有(类其他对象不能访问)
  var name: String = _ //_：占位符

  def this(name: String) {
    this //必须有，默认的构造器，()省略
    this.name = name
  }

  def sayHello(): Unit = {
    println(this.name + ", " + this.age + ", " + this.sex)
  }
}

/**
  * 私有构造器
  * 构造器的参数有val、var声明，里面的参数相当于成员变量，可以访问
  * 如果没有val、var声明，则不能访问
  */
class ConstructorDemo2 private(val name: String, val age: Int) {
  //私有主构造器
  println("this is a private constructor")
  var sex: String = _

  def this(name: String, age: Int, sex: String) {
    this(name, age) //调用私有主构造器
    this.sex = sex
  }
}

object ConstructorDemo {
  def main(args: Array[String]) {
    val demo = new ConstructorDemo1("sun")
    demo.sayHello()

    val demo1 = new ConstructorDemo2("sun", 27, "boy")
    println(demo1.age)
  }
}
