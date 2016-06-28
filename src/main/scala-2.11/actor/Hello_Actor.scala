package actor

//2.11之前的版本，之后的版本和akka合并
//import scala.actors.Actor

/**
  * 线程 继承基本线程类Actor
  *
  * @user sun 
  * @date 2016/6/21
  */
object First_Actor extends Actor {
  def act() {
    println(Thread.currentThread().getName())
    for (i <- 1 to 10) {
      println("Step : " + i)

      Thread.sleep(2000)
    }

  }
}

object Second_Actor extends Actor {
  def act() {
    println(Thread.currentThread().getName())
    for (i <- 1 to 10) {
      println("Step Further : " + i)
      Thread.sleep(2000)
    }

  }
}

object Hello_Actor {

  def main(args: Array[String]) {
    First_Actor.start
    Second_Actor.start
  }

}
