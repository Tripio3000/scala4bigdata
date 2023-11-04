import scala.util.Random

object Main extends App {
  val random = new Random()
  val numberOfRandomNumbers = 15

  val randomNumbers = List.fill(numberOfRandomNumbers)(random.nextInt(10))
  println(s"Случайные числа: ${randomNumbers.mkString(", ")}")

  val numberOccurrencesMap = randomNumbers.groupBy(identity)
  var result: List[Int] = List()
  numberOccurrencesMap.foreach((num, repeat) => {
    if (repeat.length > 1) {
      result = result :+ num
    }
  })
  println(s"Встречаются больше одного раза: ${result.mkString(", ")}")
}
