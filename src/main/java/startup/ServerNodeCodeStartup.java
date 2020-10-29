package startup;

import config.ServerConfigurationFactory;
import org.apache.ignite.Ignition;

/** This file was generated by Ignite Web Console (10/12/2020, 17:13) **/
public class ServerNodeCodeStartup {
    /**
     * Start up node with specified configuration.
     * 
     * @param args Command line arguments, none required.
     * @throws Exception If failed.
     **/
    public static void main(String[] args) throws Exception {
        Ignition.start(ServerConfigurationFactory.createConfiguration());
    }
}