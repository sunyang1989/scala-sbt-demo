package dataset

/**
  * foldLeft foldRight sortWith
  *
  * @user sun 
  * @date 2016/6/10
  */
object List_Fold_Sort_Ops {
  def main(args: Array[String]) {

    println((1 to 100).foldLeft(0)(_ + _)) //0+1+2+...+100
    println((0 /: (1 to 100)) (_ + _))

    println((1 to 5).foldRight(100)(_ - _)) //5-(4-(3-(2-(1-100))))
    println(((1 to 5) :\ 100) (_ - _))

    println(List(1, -3, 4, 2, 6) sortWith (_ < _))
    println(List(1, -3, 4, 2, 6) sortWith (_ > _))

  }
}
