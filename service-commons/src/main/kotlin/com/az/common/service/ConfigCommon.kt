package com.az.common.service


import io.vertx.config.ConfigRetrieverOptions
import io.vertx.core.logging.LoggerFactory

import io.vertx.rxjava.config.ConfigRetriever

object ConfigRetrieveHelper {

  private val logger = LoggerFactory.getLogger(ConfigRetrieveHelper.javaClass)

  private var configRetriever: ConfigRetriever? = null
  private val options = ConfigRetrieverOptions()

  fun usingScanPeriod(i:Long):ConfigRetrieveHelper{
    options.scanPeriod =i
    return this
  }

}

