package implicits

import java.io.File

import scala.io.Source

/**
  * 隐式转换 (一般在伴生对象object中声明隐式转换函数)
  *
  * @user sun 
  * @date 2016/6/19
  */
class RichFile(val file: File) {
  def read = Source.fromFile(file.getPath()).mkString
}

object Context {
  implicit def file2RichFile(file: File) = new RichFile(file) //File -> RichFile
}

object Hello_Implicit_Conversions {

  def main(args: Array[String]) {
    /** 必须在作用域内导入隐式转换函数 **/
    import Context.file2RichFile
    println(new File("F:\\logs\\scala-1.txt").read)
  }
}