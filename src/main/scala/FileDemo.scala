import java.io.File

import scala.io.Source

/**
  * 文件
  * @user sun 
  * @date 2016/5/28
  */
object FileDemo {
  def main(args: Array[String]) {

    //文件遍历
    val files = new File(".").listFiles()
    for (file <- files) {
      println(file.getAbsolutePath)
    }

    val source = Source.fromFile("F:\\logs\\scala-log.txt")
    for(line <- source.getLines()){
      println(line)
    }

  }
}
