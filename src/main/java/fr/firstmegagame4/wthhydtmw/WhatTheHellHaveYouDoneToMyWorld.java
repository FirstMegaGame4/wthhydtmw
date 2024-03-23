package fr.firstmegagame4.wthhydtmw;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhatTheHellHaveYouDoneToMyWorld implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("wthhydtmw");

	@Override
	public void onInitialize() {
		WhatTheHellHaveYouDoneToMyWorld.LOGGER.info("What the hell have you done to my world!?");
	}
}
