import org.scalatest._

class KataTest extends FlatSpec with Matchers {

  val tests = List(
    (("aretheyhere", "yestheyarehere"), "aehrsty"),
    (("loopingisfunbutdangerous", "lessdangerousthancoding"), "abcdefghilnoprstu"),
    (("inmanylanguages", "theresapairoffunctions"), "acefghilmnoprstuy")
  )

  tests.foreach {
    case ((s1, s2), expected) =>
      s"longest($s1, $s2)" should s"return $expected" in {
        Kata.longest(s1, s2) should be (expected)
      }
  }
}