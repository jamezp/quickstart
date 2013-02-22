package org.jboss.as.quickstarts.kitchensink.util;

import org.jboss.logging.BasicLogger;
import org.jboss.logging.MessageLogger;
import org.jboss.logging.cdi.InjectableMessageLogger;

/**
 * @author <a href="mailto:jperkins@redhat.com">James R. Perkins</a>
 */
@MessageLogger(projectCode = "")
@InjectableMessageLogger
public interface KitchensinkLogger extends BasicLogger {
}
