package type_parameterization

/**
  * 类型约束
  * A =:= B  //表示A类型等同于B类型
  * A <:< B  //表示A类型是B类型的子类型，编译时就确定类型，更强制性
  * A <: B   //A的上界是B类型
  *
  * @user sun 
  * @date 2016/6/15
  */
object Type_Contraints {
  def main(args: Array[String]) {
    rocky("Spark")
    //rocky(100) //编译时报错
  }

  def rocky[T](i: T)(implicit ev: T <:< java.io.Serializable) {
    print("Life is short,you need spark!")
  }
}
