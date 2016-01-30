package tutorial.webapp

import scala.scalajs.js.JSApp

import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {
  def main(): Unit = {
    println("Hello world!")
    val s = Seq("u","tamales","a","b","c","d")
    s filter { _ != "b" } map println
    val (a,b) = s match {
      case Seq(a,b, rest @ _*) =>
        (a,b)
      case _ =>
          ("0","0")
    }
    println(a,b)
    val head :: _ :: tail = 1 :: 2 :: 3 :: Nil
    println(head,tail)
    val shead :: _ :: _ :: stail = s
    println(shead,stail)
    //jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello World</p>")
  }

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the clickety clicky button!</p>")
  }
}
