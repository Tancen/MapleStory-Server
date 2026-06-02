package client.command.commands.gm3;

import client.Character;
import client.Client;
import client.command.Command;

public class GiveExpCommand extends Command {
    {
        setDescription("Give EXP to a player.");
    }

    @Override
    public void execute(Client client, String[] params) {
        Character player = client.getPlayer();
        if (params.length < 2) {
            player.yellowMessage("Syntax: !giveexp <playername> <value>");
            return;
        }

        int value = Integer.parseInt(params[1]);
        Character victim = client.getWorldServer().getPlayerStorage().getCharacterByName(params[0]);
        if (victim != null) {
            victim.gainExp(value);
            player.message("Exp given. Player " + params[0] + " gained exp " + value );
        } else {
            player.message("Player '" + params[0] + "' could not be found.");
        }
    }
}
