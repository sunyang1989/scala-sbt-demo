package oop

/**
  * package：包
  *
  * @user sun 
  * @date 2016/6/4
  */
//package：链式结构，支持嵌套
package hadoop.demo {

  abstract class Sun {
    def say
  }
  package test {
    //测试
  }

  package impl {

    //实现
    class Action extends Sun {
      override def say {
        println("hello")
      }
    }

  }

}

object PackageOps {
  def main(args: Array[String]): Unit = {
    val ac = new oop.hadoop.demo.impl.Action
    ac.say
  }
}

