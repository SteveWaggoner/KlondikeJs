package klondike.cards


import utest._

object HelloTests extends TestSuite{
  val tests = Tests{
    test("test1"){

      println("hell from test1")

      throw new Exception("test1")
    }
    test("test2"){
      1
    }
    test("test3"){
      val a = List[Byte](1, 2)
      a(10)
    }
  }
}