package function

/**
  * 闭包
  *
  * @user sun 
  * @date 2016/6/5
  */
/**
  * 函数定义和函数表达式位于另一个函数的函数体内。
  * 而且，这些内部函数可以访问它们所在的外部函数中声明的所有局部变量、参数和声明的其他内部函数。
  * 当其中一个这样的内部函数在包含它们的外部函数之外被调用时，就会形成闭包。
  * 也就是说，内部函数会在外部函数返回后被执行。
  * 而当这个内部函数执行时，它仍然必需访问其外部函数的局部变量、参数以及其他内部函数。
  * 这些局部变量、参数和函数声明（最初时）的值是外部函数返回时的值，但也会受到内部函数的影响
  */
object ClosureOps {
  def main(args: Array[String]) {
    val data = List(1, 2, 3, 4, 5, 6)
    var sum = 0
    data.foreach(sum += _)
    println(sum)

    def add(more: Int) = (x: Int) => x + more
    val a = add(1)
    val b = add(9999)
    println(a(10))
    println(b(10))
  }
}
