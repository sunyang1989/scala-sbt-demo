package type_parameterization

/**
  * this.type = this  链式表达式
  *
  * @user sun 
  * @date 2016/6/16
  */
class Animal {
  def breathe: this.type = this
}

class Cat extends Animal {
  def eat: this.type = this
}

object Chain_Types {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    //cat.breathe时，this.type = this 此时获得一个Cat对象，可以直接调用eat方法
    cat.breathe.eat

  }
}
