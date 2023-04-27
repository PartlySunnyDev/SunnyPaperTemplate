package me.partlysunny.sunnypapertemplate;

import me.partlysunny.commandeer.CommandManager;
import me.partlysunny.commons.paper.SunnyPlugin;
import me.partlysunny.configurate.Configurate;
import me.partlysunny.configurate.impl.SpigotConfig;
import org.jetbrains.annotations.NotNull;

public final class MyPlugin extends SunnyPlugin {

    public MyPlugin() {
        super("MyPlugin");
    }

    @Override
    public void registerCommands(@NotNull CommandManager commandManager) {

    }

    @Override
    public void registerConfigurations() {
        Configurate.instance().configManager().addConfig("config", new SpigotConfig("config.yml"));
    }

    @Override
    public void registerGuis() {

    }

    @Override
    public void registerListeners() {

    }
}
