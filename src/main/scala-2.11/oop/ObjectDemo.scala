package oop

/**
  * scala 类：默认public级别
  *
  * @user sun 
  * @date 2016/5/31
  */
class ObjectDemo2 {

  //默认private级别，默认生成public级别的get，set方法
  //val定义常量，因此name 是 final 类型的，没有set方法
  val name = "sun"
  //默认private级别，默认生成public级别的get方法
  //get 方法名称：age
  //set 方法名称：age_
  var age = 0
  private var sex = 0 //私有属性必须赋值，默认生成private级别的get，set方法
}

/**
  * protected：子类才能访问
  * private：本类才能访问
  * public：其他都是public
  * private[this]：对象私有，不能访问 该类其他对象 的私有属性
  * private[package]：package私有
  */
package society {

  import oop.society.professional.ObjectDemo1
  package professional {

    //ObjectDemo1 类是society包私有的
    private[society] class ObjectDemo1 {
      private[this] val secrets = null
      private[professional] var workDetails = null
      private[society] var friends = null

      def help(another: ObjectDemo1) {
        println(another.workDetails)
        //println(another.secrets) //ERROR
      }
      }
  }

  class DemoSun {
    val demo1 = new ObjectDemo1
    demo1.friends //可以访问，包私有，在包里面就可以访问
    //demo1.workDetails //Error
  }
}

object ObjectDemo {
  def main(args: Array[String]): Unit = {
    val student = new ObjectDemo2()
    //println(student.sex)//Error
    println(student.name)
  }
}
