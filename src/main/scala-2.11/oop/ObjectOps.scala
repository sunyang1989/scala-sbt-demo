package oop

/**
  * object：静态类，属性、方法都是静态的
  *
  * @user sun 
  * @date 2016/6/1
  */
object ObjectOps {
  def main(args: Array[String]) {
    println(A.add) //1
    println(A.add) //2
    println(A.oa) //2
  }
}


/**
  * object A 是 class A 的伴生对象
  * class A 是 object A 的伴生类，可以访问伴生对象的所有属性和方法，包括private
  * 伴生对象可以访问伴生类的所有属性和方法
  */
class A {
  var ca = A.add
  var cb = A.ob
}

object A {
  private val ob = 0
  var oa = 0

  def add: Int = {
    oa += 1
    oa
  }
}
