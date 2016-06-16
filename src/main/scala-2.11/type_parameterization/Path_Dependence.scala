package type_parameterization

/**
  * 路径依赖
  *
  * @user sun 
  * @date 2016/6/16
  */
class Outer {
  private val x = 10

  class Inner {

    /** 内部类可以访问外部类的private **/
    private val y = x + 10
  }

}

object Path_Dependence {
  def main(args: Array[String]) {

    val outer = new Outer

    /** 和java不同，scala中Inner是属于Outer的具体某一个对象的 **/
    val inner = new outer.Inner
    /** 路径依赖 **/
    val inner2: outer.Inner = new outer.Inner

    val o1 = new Outer
    val o2 = new Outer

    //编译错误，o1.Inner只属于o1对象，不能赋值给o2对象
    //val i:o2.Inner = new o1.Inner

    /** # 类型投影 **/
    val i: Outer#Inner = new o1.Inner
  }
}
