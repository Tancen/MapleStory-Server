package client.command.commands.gm3;

import client.Character;
import client.Client;
import client.command.Command;
import client.inventory.InventoryType;
import client.inventory.Item;
import tools.DatabaseConnection;
import tools.Pair;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static server.CashShop.NX_CREDIT;

public class GiveNxCreditCommand extends Command {
    {
        setDescription("Give NxCredit to a player.");
    }

    @Override
    public void execute(Client client, String[] params) {
        Character player = client.getPlayer();
        if (params.length < 2) {
            player.yellowMessage("Syntax: !givenxcredit <player name> <value>");
            return;
        }

        int value = Integer.parseInt(params[1]);
        if (value <= 0)
        {
            player.yellowMessage("The value of param 2 must greater than 0.");
            return;
        }
        Character victim = client.getWorldServer().getPlayerStorage().getCharacterByName(params[0]);
        if (victim != null) {
            victim.getCashShop().gainCash(NX_CREDIT, value);
            player.message("NxCredit given. Player " + params[0] + " gained NxCredit " + value );
        } else {
            player.message("Player '" + params[0] + "' could not be found.");
        }
    }
}
