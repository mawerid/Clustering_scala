import functions.distance._
import functions.randomCenters._

import scala.util.Random

object testingCode extends App{

  val p1: List[Double] = List(1D, 1D, 1D, 1D, 1D) // example point
  val p2: List[Double] = List(4D, 5D, 3D, 3D, 5D) // example point

  println(euclidean(p1, p2))
  println(manhattan(p1, p2))

  val cluster: List[List[Double]] = List(List(1D, 2D, 1D), List(2D, 6D, 1D), List(3D, 7D, 1D)) // example cluster
  val numOfClusters = 2

}
