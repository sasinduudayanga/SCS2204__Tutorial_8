case class Point(var x: Int, var y: Int) {

  def add(a:Point) = new Point(this.x + a.x, this.y + a.y)    //(6+4 , 3+10)

  def move(x:Int, y:Int):Unit = {
    this.x = this.x + x         // 4+1 = 5
    this.y = this.y + y         // 10+ -1 = 9
  }

  def distance(a:Point) : Double = {
    var xDist:Int = this.x - a.x                  // 6-5 = 1
    var yDist:Int = this.y - a.y                  // 3-9 = -6
    var dist: Int = xDist*xDist + yDist*yDist     // 1*1 + -6*-6  = 1+36 = 37
    scala.math.sqrt(dist)                         //sqrt(37) = 6.08276253029822
  }

  def invert() :Unit = {
    var tmp = this.x              // tmp = 6
    this.x = this.y               // x = 3
    this.y = tmp                  // y = 6
  }

}


object Point extends App {

  var a = Point(6,3)
  var b = Point(4,10)

  println(a.add(b))         //(6+4,3+10) = (10,13)

  b.move(x = 1, y = -1)
  println(b)                // b= (5,9)

  println(a.distance(b))    // sqrt(x^2 + y^2)

  a.invert()
  println(a)                // a= (3,6)

}
