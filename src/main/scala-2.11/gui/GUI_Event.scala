package gui

import java.io.File

import scala.swing.{Label, _}
import scala.swing.event.ButtonClicked

/**
  * 事件
  *
  * @user sun 
  * @date 2016/6/29
  */
object GUI_Event extends SimpleSwingApplication {
  val fileChooser = new FileChooser(new File(".")) //文件选择器，默认当前目录
  fileChooser.title = "File Chooser"
  //弹出的文件选择器的title

  val button = new Button {
    text = "Choose a File from local"
  }
  val label = new Label {
    text = "No any file selected yet."
  }
  val mainPanel = new FlowPanel {
    contents += button
    contents += label
  }

  override def top = new MainFrame {
    title = "Scala GUI Programing advanced!!!"
    contents = mainPanel
    listenTo(button)
    reactions += {
      case ButtonClicked(b) => {
        val result = fileChooser.showOpenDialog(mainPanel)
        if (result == FileChooser.Result.Approve) {
          //选择了一个文件
          label.text = fileChooser.selectedFile.getPath()
        }
      }
    }
  }

}
