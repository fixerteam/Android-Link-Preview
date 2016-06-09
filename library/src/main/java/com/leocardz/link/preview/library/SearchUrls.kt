package com.leocardz.link.preview.library

import java.net.URL
import java.util.*

object SearchUrls {

  val ALL = 0
  val FIRST = 1

  @JvmOverloads fun matches(text: String, results: Int = ALL): ArrayList<String> {
    val urls = ArrayList<String>()

    val splitString = text.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
    for (string in splitString) {

			val item = URL(string)
			urls.add(item.toString())
      if (results == FIRST && urls.size > 0) break
    }
    return urls
  }
}