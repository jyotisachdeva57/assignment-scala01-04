package com.knoldus

class Operations {

  def sum(func: (Int, Int) => Int, first: Int, second: Int): Int = {
    func(first, second)
  }

  def sumSquare(first: Int, sec: Int): Int = {
    first * first + sec * sec
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

  def commonInner(operation: String, element: Int, list: List[Int]): Int = {
    list match {
      case head :: Nil if operation == "sum" => element + head
      case head :: Nil => if (operation == "product") element * head else head
      case head :: tail if operation == "sum" => commonInner(operation, head + element, tail)
      case head :: tail if operation == "product" => commonInner(operation, head * element, tail)
      case head :: head1 :: tail => if (head > head1) commonInner(operation, 0, head :: tail) else commonInner(operation, 0, head1 :: tail)
    }
  }


  def common(list: List[Int], operation: String): Int = {
    list match {
      case Nil => throw new Exception
      case head :: Nil => head
    }
    operation.toLowerCase match {
      case "sum"=> commonInner(operation, 0, list)
      case "max"=> commonInner(operation, 0, list)
      case "product" => commonInner(operation, 1, list)
      case _ => throw new NoSuchElementException
    }
  }

}



