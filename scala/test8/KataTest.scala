import org.scalatest.FunSuite

class KataTest extends FunSuite {

  test("Sample") {
    assert(Kata.printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz") === "3/56")
  }
}