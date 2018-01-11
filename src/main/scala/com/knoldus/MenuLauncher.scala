package com.knoldus

import com.sun.istack.internal.logging.Logger

object MenuLauncher {
  def main(args: Array[String]): Unit = {
    val log = Logger.getLogger(this.getClass)
    val obj = new Operations
    val val1 = 2
    val val2 = 3
    val val3 = -1
    val col = 2
    val row = 1
    val list = List(val1, val2, val3)
    log.info("sum of squares")
    log.info(obj.sum(obj.sumSquare, val1, val2).toString)
    log.info("sum of cube")
    log.info(obj.sum(obj.sumCube, val1, val2).toString)
    log.info("sum of Integers")
    log.info(obj.sum(obj.sumInts, val1, val2).toString)
    log.info("maximum from list")
    log.info(obj.operateList(list, "max", obj.common).toString)
    log.info("sum of list")
    log.info(obj.operateList(list, "sum", obj.common).toString)
    log.info("product of list")
    log.info(obj.operateList(list, "product", obj.common).toString)
    log.info("pascal traiangle")
    log.info(obj.pascalTri(col, row).toString)
  }
}
