package com.az.common.service

import io.vertx.core.AbstractVerticle

class MainVerticleServiceCommons : AbstractVerticle() {
  override fun start() {
    println("hello from common")
  }
}
