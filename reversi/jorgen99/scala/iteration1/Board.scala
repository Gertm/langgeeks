import scala.collection.mutable.ArrayBuffer
import Square._

class Board {
  def startGame(): Array[Array[Square.Value]] = {
    Array(
      createRow("........"),
      createRow("........"),
      createRow("........"),
      createRow("...BW..."),
      createRow("...WB..."),
      createRow("........"),
      createRow("........"),
      createRow("........"))
  }

  def createRow(row: String): Array[Square.Value] = {
    row.map { Square.parse(_) }.toArray
  }

  def evaluate(row: Array[Square.Value]): Array[Square.Value] = {
    createRow("..OWB...")
  }

  def indexOfFirstNonEmptySquare(row: Array[Square.Value]): Int = {
    indexOfFirstNonEmptySquare(row, 0)
  }

  private def indexOfFirstNonEmptySquare(row: Array[Square.Value], startIndex:Int): Int = {
    if (row.size == startIndex)
      return -1
    if (row(startIndex) != Empty)
      return startIndex
    else
      return indexOfFirstNonEmptySquare(row, startIndex + 1)
  }

}
