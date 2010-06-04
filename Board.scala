import scala.collection.mutable.ArrayBuffer

class Board {
    def startGame():Array[Array[Square.Value]] = {
        Array(createRow("........"),
              createRow("........"),
              createRow("........"),
              createRow("...BW..."),
              createRow("...WB..."),
              createRow("........"),
              createRow("........"),
              createRow("........"))
    }

    def createRow(row:String):Array[Square.Value] = {
        val reply = new ArrayBuffer[Square.Value]()
        for (cell <- row)
            reply += Square.parse(cell)

        reply.toArray
    }

    def evaluate(row:Array[Square.Value]):Array[Square.Value] = {
        createRow("..OWB...")
    }
}
