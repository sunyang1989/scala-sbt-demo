import scala.io.Source

/**
  * Lazy：第一次使用的时候才加载
  *
  * @user sun 
  * @date 2016/5/29
  */
object LazyDemo {
  def main(args: Array[String]) {
    //lazy：没有则抛出FileNotFoundException
    lazy val file = Source.fromFile("F:\\noExist.txt")
    println(123)
  }
}
