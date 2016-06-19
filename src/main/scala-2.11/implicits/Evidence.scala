package implicits

/**
  * @user sun 
  * @date 2016/6/19
  */
object Evidence {
  def main(args: Array[String]) {
    //隐式参数，<:< 定义T是Serializable的子类型，方便定义
    def evidence[T](i: T)(implicit ev: T <:< java.io.Serializable) {
      print("Spark!!!")
    }
    evidence("Spark")
  }
}
