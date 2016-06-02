package oop

/**
  * trait：接口
  *
  * @user sun 
  * @date 2016/6/2
  */
trait Logger {
  def log(msg: String): String //抽象方法
  /** 接口中可以有非抽象方法 **/
  def add = 1
}

/** extends with with... ：实现多个接口 **/
class LoggerClass extends Logger with Cloneable {
  def con() = {
    log("it's me ")
  }

  /** 重写 **/
  override def log(msg: String): String = {
    println(msg)
    msg + msg.hashCode
  }
}

object TraitDemo {
  def main(args: Array[String]) {
    /** 在对象中混入trait **/
    val cl = new LoggerClass with Cloneable
    cl.con
  }
}
