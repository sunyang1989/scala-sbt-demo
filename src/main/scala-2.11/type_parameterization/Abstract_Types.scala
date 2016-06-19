package type_parameterization

import scala.io.{BufferedSource, Source}

/**
  * 抽象类型
  *
  * @user sun
  * @date 2016/6/19
  */
trait Reader {
  /** 接口中的type声明抽象类型，可以对抽象类型进行类型限制 **/
  type In <: java.io.Serializable
  type Contents

  def read(in: In): Contents
}

class FileReader extends Reader {
  type In = String
  type Contents = BufferedSource

  override def read(name: In) = Source.fromFile(name)
}

object Abstract_Types {

  def main(args: Array[String]) {
    val fileReader = new FileReader
    val content = fileReader.read("E:\\WangJialin.txt")
    for (line <- content.getLines) {
      println(line)
    }
  }

}
