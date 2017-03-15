package com.bhargo

import com.bhargo.service.UtilService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.{CommandLineRunner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
  * Created by barya on 3/14/2017.
  */

@SpringBootApplication
class ScalaMain @Autowired() (util:UtilService) extends CommandLineRunner{

  override def run(args: String*): Unit = {
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    util.sayHello
  }
}
object ScalaMain {
    def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[ScalaMain], args:_*);
  }
}