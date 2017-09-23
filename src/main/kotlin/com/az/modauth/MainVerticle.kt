
package com.az.modauth

import io.vertx.core.AbstractVerticle

class MainVerticle : AbstractVerticle() {

  override fun start() {
    vertx.createHttpServer()
      .requestHandler { req -> req.response().end("Hello Vert.x! from kotlin") }
      .listen(8080)
  }

}
