package org.ops4j.junit5;

import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

public class FailsafeTest {

    @Test
    public void shouldLog() {
        LoggerFactory.getLogger("slf4j").info("logging from slf4j");
        LogFactory.getLog("jcl").info("logging from commons-logging");
    }
}
