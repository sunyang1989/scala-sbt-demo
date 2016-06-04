package oop

/**
  * package object：包对象
  *
  * @user sun 
  * @date 2016/6/4
  */

//包对象
package object people {
  val defaultName = "sunshine"
}
package people {

  /** 包里面的类成员可以直接访问包对象里面方法 **/
  class People {
    var name = defaultName
  }

}
