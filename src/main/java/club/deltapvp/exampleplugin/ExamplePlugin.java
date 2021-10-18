package club.deltapvp.exampleplugin;

import club.deltapvp.deltacore.api.DeltaPlugin;
import club.deltapvp.exampleplugin.messages.FileLocale;
import lombok.Getter;
import lombok.Setter;

public final class ExamplePlugin extends DeltaPlugin {

    /*
    This example uses Lombok, a library that reduces and minimizes boilerplate code
    -- you can find the repo and dependency in pom.xml.
    Most of this plugin will use lombok, some things may be different in your plugin if you
    with to not use lombok.

    In this example, all aspects of the DeltaAPI will be covered for reference and documentation.
     */

    @Getter
    @Setter
    private static ExamplePlugin instance;

    @Override
    public void onEnable() {
        setInstance(this);

        /*
        Messages
         */

        // File
        FileLocale.init(); // This is required to load the messages into their files


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
