package hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {
  private Logger log = LoggerFactory.getLogger(getClass());

  @RequestMapping("/hello-basic")
  public String helloBasic() {
    log.info("helloBasic");
    return "ok";
  }

  @GetMapping("/mapping-get-v2")
  public String mappingGet() {
    log.info("helloBasic");
    return "ok";
  }

  @GetMapping("/mapping/{userId}")
  public String mappingPath(@PathVariable String userId) {
    log.info("mappingPath userId={}", userId);
    return "ok";
  }

  @GetMapping("mapping/users/{userId}/orders/{orderId}")
  public String mappingPath1(@PathVariable String userId, @PathVariable String orderId) {
    log.info("userId={}, orderId={}", userId, orderId);
    return "ok";
  }

  @GetMapping(value = "mapping-param", params = "mode=debug")
  public String mappingParam() {
    log.info("mappingParam");
    return "ok";
  }

  @PostMapping(value = "/mapping-consume", consumes = "application/json")
  public String MappingConsumes() {
    log.info("mappingConsumes");
    return "ok";
  }

  @PostMapping(value = "/mapping-consume", produces = "text/html")
  public String MappingConsumesProduces() {
    log.info("mappingProduces");
    return "ok";
  }
}