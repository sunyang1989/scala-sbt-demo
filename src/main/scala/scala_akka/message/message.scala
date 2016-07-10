package scala_akka.message

import java.util

/**
  * @user sun 
  * @date 2016/7/10
  */
class Word(val word: String, val count: Integer)

case class Result()

class MapDataResult(val dataList: util.ArrayList[Word])

class ReduceDataResult(val reduceMap: util.HashMap[String, Integer])

