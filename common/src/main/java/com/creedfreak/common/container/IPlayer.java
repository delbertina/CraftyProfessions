package com.creedfreak.common.container;

import java.math.BigDecimal;
import java.util.UUID;

public interface IPlayer
{
    /**
     * Returns the UUID of the current player.
     *
     * @return The players unique identifier
     */
    public UUID getUUID ();

    /**
     * Sends a message to the target player.
     *
     * @param message The message to send to the target player.
     */
    public void sendMessage (String message);

    /**
     * Checks the permission of the current player.
     *
     * @param perm The permission to test if the player currently has.
     *
     * @return True - If the player has the permission.
     *         False - If the player does not have that permission.
     */
    public boolean checkPerms (final String perm);

    /**
     * Payout the players value pool to their economy account
     * If there is no economy then only add points to the players account.
     */
    public float payoutPlayerPool ();

    /**
     * Displays the current professions the User currently have.
     */
    public void listProfessions ();

    /**
     * TODO: It may be the case where we will have to map into a large table of blocks and then check if they have the correct job.
     * This method is used to generate revenue based on what the user has broken.
     *
     * @param elementName - The name of the block that was broken.
     */
    public void doWork (String elementName);
}
