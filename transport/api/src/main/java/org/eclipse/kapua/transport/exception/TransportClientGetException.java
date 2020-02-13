/*******************************************************************************
 * Copyright (c) 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.transport.exception;

import javax.validation.constraints.NotNull;

/**
 * The {@link Exception} to throw when is not possible to get an instance of the {@link org.eclipse.kapua.transport.TransportFacades}
 *
 * @since 1.2.0
 */
public class TransportClientGetException extends TransportException {

    private final String serverIp;

    /**
     * Constructor.
     *
     * @param serverIp The serverIp to which connect the {@link org.eclipse.kapua.transport.TransportFacade}
     * @since 1.2.0
     */
    public TransportClientGetException(@NotNull String serverIp) {
        this(null, serverIp);
    }

    /**
     * Constructor.
     *
     * @param cause    the root cause of the {@link Exception}.
     * @param serverIp The serverIp to which connect the {@link org.eclipse.kapua.transport.TransportFacade}
     * @since 1.2.0
     */
    public TransportClientGetException(@NotNull Throwable cause, @NotNull String serverIp) {
        super(TransportErrorCodes.CLIENT_GET, cause, serverIp);

        this.serverIp = serverIp;
    }

    /**
     * Gets the IP to which we wanted unsuccessfully to connect.
     *
     * @return The IP to which we wanted unsuccessfully to connect.
     * @since 1.2.0
     */
    public String getRequestMessage() {
        return serverIp;
    }
}
