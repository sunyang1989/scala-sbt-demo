import java.io.{File, PrintWriter}

import scala.io.Source

/**
  * 文件
  *
  * @user sun 
  * @date 2016/5/28
  */
object FileDemo {
  def main(args: Array[String]) {

    /** 文件遍历 **/
    val files = new File(".").listFiles()
    for (file <- files) {
      println(file.getAbsolutePath)
    }
    /** 读文件 **/
    val source = Source.fromFile("F:\\logs\\scala-log.txt")
    for(line <- source.getLines()){
      println(line)
    }
    source.close()

    /** 读取url内容 **/
    val web = Source.fromURL("http://www.baidu.com")
    web.foreach(print)
    web.close()

    /** 写文件 **/
    val writer = new PrintWriter(new File("F:\\logs\\scala-1.txt"))
    for (i <- 1 to 100) writer.println(i)
    writer.close()

  }
}
