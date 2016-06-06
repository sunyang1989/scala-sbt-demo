package pattern_match

/**
  * @user sun 
  * @date 2016/6/6
  */
abstract class Item

case class Book(description: String, price: Double) extends Item

//items：可变参数
case class Bundle(description: String, price: Double, items: Item*) extends Item

object Pattern_Match_Case_Class_Nested {
  def main(args: Array[String]) {
    def caseclass_nested(item: Item) = item match {
      //_*：匹配其他参数
      //case Bundle(_, _, Book(descr, _), _*) => println("The first description is :" + descr)
      //book：给Book(_, _)命名
      case Bundle(_, _, book@Book(_, _), other@_*) => println(book.description + " : " + book.price)

      case _ => println("Oops!")
    }
    caseclass_nested(Bundle("1111 Special's", 30.0,
      Book("Scala for the Spark Developer", 69.95),
      Bundle("Hadoop", 40.0,
        Book("Hive", 79.95),
        Book("HBase", 32.95)
      )
    ))
    caseclass_nested(Bundle("1212 Special's", 35.0,
      Book("Spark for the Impatient", 39.95)
    ))
  }
}
