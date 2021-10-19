package club.deltapvp.exampleplugin.messages;

import club.deltapvp.deltacore.api.utilities.message.file.Message;
import club.deltapvp.exampleplugin.ExamplePlugin;
import lombok.RequiredArgsConstructor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
public enum FileLocale {

    // Other
    HELP("help", Arrays.asList("&cHelp:" + "&7/example - &e Sends an example message")),
    NO_PERMS("no-perms", Collections.singletonList("&cNo perms!"));

    private final String id;
    private final List<String> defaultMessage;
    private Message message;

    public static void init() {
        ExamplePlugin plugin = ExamplePlugin.getInstance();
        for (FileLocale value : values()) {
            String[] messageArray = value.defaultMessage.toArray(new String[0]);
            value.message = new Message(plugin, value.id, messageArray);
        }
    }

    public void send(CommandSender sender) {
        message.send(sender);
    }

    public Message replace(String s1, String s2) {
        return message.replace(s1, s2);
    }

    public List<String> getMessage() {
        return message.getDefaultContent();
    }
}