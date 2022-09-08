package tacos.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class AppStartCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
      log.info("---> CommandlineRunner");
    }
}
