package com.mycommunity;

import com.mycommunity.config.MyCommunityConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyCommunityApplication extends Application<MyCommunityConfiguration>{
    public static final Logger LOGGER = LoggerFactory.getLogger(MyCommunityApplication.class);

    public static void main(final String[] args) throws Exception {
        new MyCommunityApplication().run(args);
    }

    @Override
    public void run(final MyCommunityConfiguration configuration, final Environment environment)
            throws Exception {

        LOGGER.info("Application name: {}", configuration.getAppName());
    }
}
