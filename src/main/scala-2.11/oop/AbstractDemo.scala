package oop

/**
  * 抽象类
  *
  * @user sun 
  * @date 2016/6/2
  */
class AbstractOps {
  var id: Int = _ //非抽象属性必须赋值（包括使用占位符）
}

//抽象类
abstract class Teacher {
  var name: String = _
  //非抽象字段，必须赋值
  var id: Int

  //抽象字段，没有赋值
  def teach //抽象方法
}

class MathTeacher extends Teacher {
  override var id: Int = _

  override def teach: Unit = {
    println("teacher...")
  }
}

object AbstractDemo {
  def main(args: Array[String]) {
    val teacher = new MathTeacher
    teacher.teach
  }
}
