package com.knoldus

class Operations {

  def sum(func: (Int, Int) => Int, first: Int, second: Int): Int = {
    func(first, second)
  }

  def sumSquare(first: Int, second: Int): Int = {
    first * first + second * second
  }

  def sumCube(first: Int, second: Int): Int = {
    first * first * first + second * second * second
  }

  def sumInts(first: Int, second: Int): Int = {
    first + second
  }

  def operateList(list: List[Int], operation: String, f: (List[Int], String) => Int): Int = {
    f(list, operation)
  }

  def common(list: List[Int], operation: String): Int = {

    def commonInner(element: Int, list: List[Int]): Int = {
      list match {
        case Nil => -1
        case head :: Nil if operation == "sum" => element + head
        case head :: Nil if operation == "product" => element * head
        case head :: Nil => head
        case head :: tail if operation == "sum" => commonInner(head + element, tail)
        case head :: tail if operation == "product" => commonInner(head * element, tail)
        case head :: head1 :: tail => if (head > head1) commonInner(0, head :: tail) else commonInner(0, head1 :: tail)
      }
    }

    operation match {
      case "sum" | "max" => commonInner(0, list)
      case "product" => commonInner(1, list)
      case _ => throw new NoSuchElementException
    }
  }

  def pascalTri(col: Int, row: Int): Int = {

    def fact(num: Int): Int = {

      def pascalInner(element: Int, num: Int): Int = {
        if (num == 0) {
          element
        }
        else {
          pascalInner(element * num, num - 1)
        }

      }

      pascalInner(1, num)
    }

    fact(row) / fact(col) * fact(row - col)
  }

}
