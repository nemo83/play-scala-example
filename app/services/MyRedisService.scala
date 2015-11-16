package services

import com.example.driver.RedisClient
import com.google.inject.Inject
import com.google.inject.name.Named

class MyRedisService @Inject()(@Named("myDbOne") redisClientOne: RedisClient, @Named("myDbTwo") redisClientTwo: RedisClient) {

  def doSomething = {
    redisClientOne.doSomething
    redisClientTwo.doSomething
  }

}
