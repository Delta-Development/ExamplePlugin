package club.deltapvp.exampleplugin;

import club.deltapvp.deltacore.api.DeltaPlugin;

public final class ExamplePlugin extends DeltaPlugin {

    /*
    This example uses Lombok, a library that reduces and minimizes boilerplate code
    -- you can find the repo and dependency in pom.xml.
    Most of this plugin will use lombok, some things may be different in your plugin if you
    with to not use lombok.

    In this example, all aspects of the DeltaAPI will be covered for reference and documentation.
     */

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
