package implicits

import java.io.File

import scala.io.Source

/**
  * 隐式转换 内幕
  *
  * @user sun 
  * @date 2016/6/19
  */
class RicherFile(val file: File) {
  def read = Source.fromFile(file.getPath()).mkString
}

class File_Implicits(path: String) extends File(path)

object File_Implicits {
  implicit def file2RicherFile(file: File) = new RicherFile(file) //File -> RicherFile
}

object Implicits_Internals {
  def main(args: Array[String]) {
    //通过自定义类，在伴生对象中声明隐式转换，不需要手动import
    println(new File_Implicits("F:\\logs\\scala-1.txt").read)
  }
}
