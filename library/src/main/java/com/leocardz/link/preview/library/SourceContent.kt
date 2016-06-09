package com.leocardz.link.preview.library

import java.util.*

class SourceContent {
  var success = false
  var htmlCode = ""
  var raw = ""
  var title = ""
  var description = ""
  var url = ""
  var finalUrl = ""
  var canonicalUrl = ""
  var metaTags = HashMap<String, String>()

  var images = ArrayList<String>()
  var urlData = arrayOfNulls<String>(2)
}