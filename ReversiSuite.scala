import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Before
import org.junit.Assert._

class ReversiSuite extends AssertionsForJUnit {
 
  var board:Board = _

  @Before
  def setup() {
      board = new Board()
  }

  @Test
  def startBoardIsSetupCorrectly() {
     assertEquals(Square.Black, board.squares(3)(3))
     assertEquals(Square.White, board.squares(3)(4))
     assertEquals(Square.White, board.squares(4)(3))
     assertEquals(Square.Black, board.squares(4)(4))
  }

  @Test
  def oneLineOfDotsIsEightEmptySquares() {
      val row:Array[Square.Value] = board.createRow("........")
      val emptyRow = Array(Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty)
      assertEquals(emptyRow.size, row.size)
      for (square <- row)
           assertEquals(Square.Empty, square)
  }

  @Test
  def oneLineWithAllTypesOfSquares() {
      val row:Array[Square.Value] = board.createRow(".WBO")
      val expected = Array(Square.Empty, Square.White, Square.Black, Square.Possible)
      assertEquals(Square.Empty, row(0))
      assertEquals(Square.White, row(1))
      assertEquals(Square.Black, row(2))
      assertEquals(Square.Possible, row(3))
  }

}

