package com.nivek.firstperson;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Client entrypoint for Nivek First Person. */
public final class NivekFirstPersonClient implements ClientModInitializer {
    public static final String MOD_ID = "nivek_first_person";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Nivek First Person inicializado. Versão inicial.");
    }
}
