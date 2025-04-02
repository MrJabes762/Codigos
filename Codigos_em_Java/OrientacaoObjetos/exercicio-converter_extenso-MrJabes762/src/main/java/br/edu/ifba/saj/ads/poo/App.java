/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package br.edu.ifba.saj.ads.poo;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    

    public static void main(String[] args) {
        LOGGER.info("Running the main method");
        if (args.length > 0) {
            LOGGER.info("List of arguments: {}", Arrays.toString(args));
        }
    }
}
