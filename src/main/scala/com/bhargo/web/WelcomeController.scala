package com.bhargo.web

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

/**
  * Created by bhargo on 16/3/17.
  */
@RestController()
@RequestMapping(Array("/welcome"))
class WelcomeController {

  @RequestMapping(Array("/greet"))
  def greet:String = "This response is from a scala class";
}
