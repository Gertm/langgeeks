import scala.collection.mutable.ArrayBuffer

class Board {
    val squares = Array(Array(Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty),
                        Array(Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty),
                        Array(Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty),
                        Array(Square.Empty, Square.Empty, Square.Empty, Square.Black, Square.White, Square.Empty, Square.Empty, Square.Empty),
                        Array(Square.Empty, Square.Empty, Square.Empty, Square.White, Square.Black, Square.Empty, Square.Empty, Square.Empty),
                        Array(Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty),
                        Array(Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty),
                        Array(Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty, Square.Empty))

    def createRow(row:String):Array[Square.Value] = {
        val reply = new ArrayBuffer[Square.Value]()
        for (cell <- row) {
            if (cell == '.')
                reply += Square.Empty
        }
        reply.toArray
    }

}
