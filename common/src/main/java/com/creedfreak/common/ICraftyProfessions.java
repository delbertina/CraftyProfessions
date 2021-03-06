package com.creedfreak.common;

import com.creedfreak.common.database.databaseConn.Database;
import com.creedfreak.common.exceptions.NoLoggerFoundException;

import java.io.File;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is the main Abstraction layer for ICraftyProfessions
 * in which we can use multiple plugin architecture. For example
 * there is going to be a Spigot Version of ICraftyProfessions and
 * a Sponge Version of ICraftyProfessions. This will allow for
 * very minimal changes within the code when dealing with
 * different servers.
 *
 * Planned Server Implementations: Spigot and Sponge
 *
 * This interface outlines all of the common functionality
 * between both Spigot and Sponge implementations that
 * ICraftyProfessions will need to use throughout the
 * project.
 */
public interface ICraftyProfessions
{
    /**
     * This method outlines the economy hook setup
     */
    boolean cpSetupEconomy ();

    /**
     * Get the Configuration of the Plugin
     */
    AbsConfigController cpGetConfigController ();

    AbsCmdController cpGetCmdController ();

    /**
     * Register the plugins listeners.
     */
    void cpSetupListeners ();

    /**
     * Grab the database
     */
    Database cpGetDatabase ();

    void cpSetupDatabase ();

    InputStream cpGetResource (String resource);

    File cpGetResourceFile ();
}
