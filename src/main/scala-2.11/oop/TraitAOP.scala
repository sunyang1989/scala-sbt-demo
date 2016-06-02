package oop

/**
  * trait实现AOP
  *
  * @user sun 
  * @date 2016/6/2
  */
trait Action {
  def doAction
}

trait TBeforeAfter extends Action {
  /** super.doAction 没有实现，因此必须使用 abstract override 声明 **/
  abstract override def doAction {
    println("before")
    super.doAction
    println("after")
  }
}

class Work extends Action {
  override def doAction {
    println("working")
  }
}

object TraitAOP {
  def main(args: Array[String]) {
    val worker = new Work with TBeforeAfter
    worker.doAction
  }
}
