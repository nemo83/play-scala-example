package config

import akka.actor.ActorSystem
import com.example.driver.RedisClient
import com.google.inject.name.Named
import com.google.inject.{AbstractModule, Provides}

class Config extends AbstractModule {

  override def configure(): Unit = {
    // Just make compiler happy
  }

  @Provides
  @Named("myDbOne")
  def dbOneRedisClient(actorSystem: ActorSystem): RedisClient = {
    new RedisClient("localhost", 1234)(actorSystem)
  }

  @Provides
  @Named("myDbTwo")
  def dbTwoRedisClient(actorSystem: ActorSystem): RedisClient = {
    new RedisClient("localhost", 5678)(actorSystem)
  }

}
