package funsets

object Main extends App {
  import FunSets._



  println(contains( union(x => x == 2 || x == 3, x => x == 4 || x == 3), 7))
  println(contains( intersect(x => x == 2 || x == 3, x => x == 4 || x == 3), 2))


  println( diff(x => x == 2 || x == 3, x => x == 4 || x == 3))

  println( forall(x => x == 2 || x == 3, x => x == 4 || x == 3 ))

}
