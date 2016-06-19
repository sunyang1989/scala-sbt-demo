package implicits

import java.io.File

import scala.io.Source

/**
  * 隐式类
  *
  * @user sun 
  * @date 2016/6/19
  */

object Context_Helper {

  implicit class FileEnhancer(file: File) {
    def read = Source.fromFile(file.getPath).mkString
  }

  implicit class Op(x: Int) {
    def addSAP(second: Int) = x + second
  }

}

object Implicits_Class {
  def main(args: Array[String]) {
    import Context_Helper._
    //编译器自动去导入的类中，匹配相应的隐式转换方法
    println(1.addSAP(2))
    println(new File("E:\\WangJialin.txt").read)
  }
}
