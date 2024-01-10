package pfe_broker.quickfix_server;

import io.micronaut.runtime.Micronaut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

  private static final Logger LOG = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    LOG.info("Starting QuickFIX/J server");
    Micronaut.run(Application.class, args);
  }
}
