package shop.taeheoki.https;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
public class Controller {

    @GetMapping("/")
    public String get(HttpServletRequest request) {
        String protocol = request.getProtocol();
        log.info("protocol={}", protocol);
        String scheme = request.getScheme();
        log.info("scheme={}", scheme);
        return scheme.equals("http") ? "http Server on" : "https Server on";
    }
}
