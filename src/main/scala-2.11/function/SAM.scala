package function

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.{JButton, JFrame}

/**
  * SAM
  *
  * @user sun 
  * @date 2016/6/5
  */
object SAM {
  def main(args: Array[String]) {

    var data = 0
    val frame = new JFrame("SAM Testing");
    val jButton = new JButton("Counter")
    //	jButton.addActionListener(new ActionListener {
    //	  override def actionPerformed(event: ActionEvent) {
    //	    data += 1
    //	    println(data)
    //	  }
    //	})

    /** 隐式转换 **/
    implicit def convertedAction(action: (ActionEvent) => Unit) =
      new ActionListener {
        override def actionPerformed(event: ActionEvent) {
          action(event)
        }
      }
    //
    jButton.addActionListener((event: ActionEvent) => {
      data += 1; println(data)
    })

    frame.setContentPane(jButton);
    frame.pack();
    frame.setVisible(true);
  }
}
