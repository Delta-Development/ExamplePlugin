package club.deltapvp.exampleplugin.commands;

import club.deltapvp.deltacore.api.commands.Command;
import club.deltapvp.deltacore.api.commands.SubCommand;
import club.deltapvp.deltacore.api.commands.annotation.CommandInfo;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static club.deltapvp.exampleplugin.messages.FileLocale.HELP;
import static club.deltapvp.exampleplugin.messages.FileLocale.NO_PERMS;

@CommandInfo(name = "help", aliases = {"examplecommand"})
public class CommandHelp extends Command {

    @Override
    public void onCommand(CommandSender sender, String[] args) {
        if (!(sender instanceof Player)) {
            NO_PERMS.send(sender);
            return;
        }
        HELP.send(sender);
    }
}

// write docs here about how this will be "args[0]" if done with switch statements inside of one main Command class
@CommandInfo(name = "subcommand")
class ExampleSubCommand extends SubCommand {

    @Override
    public void runCommand(CommandSender sender, String[] args) {

    }
}
