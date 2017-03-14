package com.bhargo.bootstrap

import com.bhargo.service.UtilService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.{CommandLineRunner, SpringApplication}

/**
  * Created by barya on 3/14/2017.
  */

@SpringBootApplication
class ScalaMain extends CommandLineRunner{

  override def run(args: String*): Unit = println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
}
object ScalaMain {
  def apply: ScalaMain = new ScalaMain()

  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[ScalaMain]);
  }
}