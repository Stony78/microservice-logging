package at.iteratec.calculator.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingResource {
    private Logger logger = LoggerFactory.getLogger(LoggingResource.class);

    @PostMapping("/api/log/{name}")
    public void log(@PathVariable String name, @RequestBody String expression) {
        logger.info(name + ": " + expression);
    }
}