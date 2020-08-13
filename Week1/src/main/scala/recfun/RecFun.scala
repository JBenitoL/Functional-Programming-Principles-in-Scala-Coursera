package recfun

object RecFun extends RecFunInterface {

  def main(args: Array[String]): Unit = {

    println("Second")
    println(balance("".toList))

    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(s"${pascal(col, row)} ")

      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c==0 || c==r) 1 else pascal(c-1, r-1) + pascal(c, r-1)

  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    if (chars.isEmpty) throw new NoSuchElementException("empty list motherfucker")

    def checkParenthesis(char: Char, n:Integer): Integer ={
      if (char=='(') n+1  else if (char==')') n-1 else n
    }


    def balanceIter(chars: List[Char], n: Integer): Boolean = {

      if (checkParenthesis(chars.head,n)<0) false else {
        if (chars.tail.isEmpty) true else balanceIter(chars.tail, checkParenthesis(chars.head,n))
      }
    }

    balanceIter(chars, 0)
  }


  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def ChangeIter( money:Int, coins: List[Int]): Int = {

      if (money<0 || coins.isEmpty) 0 else if (money ==0) 1 else{
        ChangeIter(money, coins.tail) + ChangeIter(money-coins.head, coins)
      }
    }
    ChangeIter(money, coins)
  }






}
