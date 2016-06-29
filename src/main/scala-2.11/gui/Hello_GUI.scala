package gui

import scala.swing._

/**
  * GUI
  *
  * @user sun 
  * @date 2016/6/29
  */
object Hello_GUI extends SimpleSwingApplication {
  override def top = new MainFrame {
    title = "Hello GUI"
    contents = new Button {
      text = "Scala => Spark!!!"
    }
  }
}
