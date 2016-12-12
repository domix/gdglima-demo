package com.example

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.annotation.PostConstruct

/**
 * Created by domix on 12/11/16.
 */
@RestController
@RequestMapping('/version')
class DemoController {
  @Value('${instanceId}')
  String instanceId

  String version

  @PostConstruct
  void init() {
    version = DemoController.class.getPackage().getImplementationVersion()
  }

  @GetMapping
  ResponseEntity version() {

    Map<String, String> body = [
      instanceId: instanceId,
      version   : version
    ]

    ResponseEntity.ok(body)
  }
}
