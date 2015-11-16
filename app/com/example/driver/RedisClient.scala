package com.example.driver

import akka.actor.ActorSystem
import play.api.Logger

class RedisClient(host: String, port: Int)(actorSystem: ActorSystem) {

  def doSomething = {
    Logger.info(s"host: $host, port: $port: - actorSystem: $actorSystem")
  }

}
