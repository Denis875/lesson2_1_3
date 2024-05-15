package app.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private static final Logger logger = LogManager.getLogger(AnimalsCage.class);

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        logger.info("Say:" + animal.toString() + "At:");
        logger.info(timer.getTime());
        logger.info("________________________");
    }

    public Timer getTimer() {
        return timer;
    }

}
