package ravenetics.test

import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CycleDetectorTestScala extends AnyFunSuite {

  // klasa CycleDetector zawiera krótką specyfikację działania algorytmu
  test("#3 test CycleDetector") {
    val example = CycleDetector.findCycles("abab")
    //todo impl
    ???
  }

}
