package oop

/**
  * 多继承：从左往右加载，已经加载的类或者接口不再加载
  *
  * @user sun 
  * @date 2016/6/2
  */
class Human {
  println("Human")
}

trait TTeacher extends Human {
  println("TTeacher")

  def say
}

trait Player extends Human {
  println("Player")

  def play = println("i am a player")
}

class PlayerTTeacher extends Human with TTeacher with Player {
  override def say = println("i am an A")
}

object TraitOps {
  def main(args: Array[String]) {
    /**
      * 分别构造Human，TTeacher，Player
      * TTeacher，Player 不再构造Human
      */
    val pl = new PlayerTTeacher
    pl.say
    pl.play

    /** 和上面结果一致 **/
    val pla = new Human with TTeacher with Player {
      override def say = println("i am an A")
    }
    pla.say
    pla.play
  }
}
