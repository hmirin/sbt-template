package logistic

import processing.core._
import PConstants._
import PApplet._
import scala.annotation.tailrec

class Main extends PApplet {
  
  override def setup {
    size(600, 600)
    colorMode(HSB, 100)
    frameRate(999)
    background(0)
    noLoop
  }

  override def draw {
    val genfunc:((Double,Double) => Double) = { (lambda:Double,x:Double) => {
      lambda*x*(1-x)
    }}

    val init = 0.3
    val cycle = 300
    val dump = 100 //dump data for 100 times 
    def plot(lambda:Double, lambdamax:Double){
      val cal = new Calculator(genfunc(lambda,_))
      val list = cal.start(init,cycle).slice(dump-1,cycle)
      println(list)
      @tailrec
      def rec(left:List[Double],lambda:Double){
        if(left.isEmpty) true
        else {
          stroke(((1-left.head)*100).asInstanceOf[Float],100, 100);
          point((lambda/lambdamax*width).asInstanceOf[Float],(-left.head*height+height).asInstanceOf[Float]);
          rec(left.tail,lambda)}
      }
      rec(list,lambda)
    }
    val maxlambda = 4.0
    val minlambda = 0.0
    for (i <- Range(0,width+1)) {
      plot((maxlambda-minlambda)*(i*1./width)+minlambda,maxlambda)
    }
  }
}

object Main {
  def main(args:Array[String]) {
    PApplet.main(Array("logistic.Main"))
  }
}
