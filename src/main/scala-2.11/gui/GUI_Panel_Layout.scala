package gui

import scala.swing._
import scala.swing.event.ButtonClicked

/**
  * Panel、Layout
  *
  * @user sun 
  * @date 2016/6/29
  */
object GUI_Panel_Layout extends SimpleSwingApplication {
  override def top: Frame = new MainFrame() {
    title = "Second GUI"
    val button = new Button {
      text = "Scala"
    }
    val label = new Label {
      text = "Here is Spark!!!"
    }
    contents = new BoxPanel(Orientation.Vertical) {
      //布局方式：垂直
      contents += button
      contents += label
      border = Swing.EmptyBorder(50, 50, 50, 50) //border边框
    }

    listenTo(button)
    //监听该按钮
    //deafTo(button)  //解除该按钮的监听事件
    var clicks = 0
    reactions += {
      //各种事件的具体处理
      case ButtonClicked(button) => {
        //具体哪个按钮的点击事件
        clicks += 1
        label.text = "Clicked " + clicks + " times"
      }
    }
  }
}
