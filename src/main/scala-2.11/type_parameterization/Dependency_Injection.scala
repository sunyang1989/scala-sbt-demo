package type_parameterization

/**
  * 依赖注入
  *
  * @user sun 
  * @date 2016/6/19
  */
trait Logger {
  def log(msg: String)
}

trait Auth {
  //self_type auth类型必须是Logger类型
  auth: Logger =>
  def act(msg: String) {
    log(msg)
  }
}

object DI extends Auth with Logger {
  override def log(msg: String) = println(msg)
}

object Dependency_Injection {

  def main(args: Array[String]) {
    DI.act("I hope you'll like it")
  }

}
