package type_parameterization

/**
  * 多重限定
  * T <: A with B (T的上界限定必须是A或者B 类型)
  * T >: A with B (T的下界限定必须是A或者B 类型)
  * T >: A <: B (顺序位固定! T的下界限定是A 且 上界限定是B 且A一点是B的子类型)
  * T : A : B (声明A B 类型的隐式转换，T一定是A的类型且是B的类型)
  * T <% A <% B (T 一定是A的类型 且 是B的类型 隐式转换实现)
  *
  * @user sun
  * @date 2016/6/15
  */

class M_A[T]

class M_B[T]

object Multiple_Bounds {
  def main(args: Array[String]) {
    implicit val a = new M_A[Int]
    implicit val b = new M_B[Int]
    def foo[T: M_A : M_B](i: T) = println("OK")
    foo(2)

  }
}
