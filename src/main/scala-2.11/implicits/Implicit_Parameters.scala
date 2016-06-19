package implicits

/**
  * 隐式参数
  *
  * @user sun 
  * @date 2016/6/19
  */
object Context_Implicits {
  implicit val default: String = "Flink"
}

object Param {
  def print(content: String)(implicit language: String) {
    println(language + ":" + content)
  }
}

object Implicit_Parameters {

  def main(args: Array[String]) {

    Param.print("Spark")("Scala")

    import Context_Implicits._
    //导入隐式参数
    Param.print("Hadoop")
  }
}
