package oop

/**
  * 访问控制权限
  *
  * @user sun 
  * @date 2016/6/4
  */
package spark {
  package navigation {

    private[spark] class Navigator {
      private[this] var speed = 200

      protected[navigation] def useStarChart() {}

      class LegOfJourney {
        private[Navigator] val distance = 100
      }

    }

  }

  package launch {

    import oop.spark.navigation._

    object Vehicle {
      private[launch] val guide = new Navigator

    }

  }

}

/** 伴生类访问伴生对象的所有属性 **/
class PackageOps_Advanced {

  import PackageOps_Advanced.power

  private def canMakeItTrue = power > 10001
}

/** 伴生对象访问伴生类的所有属性 **/
object PackageOps_Advanced {
  def makeItTrue(p: PackageOps_Advanced): Boolean = {
    val result = p.canMakeItTrue
    result
  }

  private def power = 10000
}
