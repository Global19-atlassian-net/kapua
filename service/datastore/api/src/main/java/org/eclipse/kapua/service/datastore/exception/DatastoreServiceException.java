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
package org.eclipse.kapua.service.datastore.exception;

import org.eclipse.kapua.KapuaException;

/**
 * Base for datastore {@link KapuaException}s
 *
 * @since 1.3.0
 */
public class DatastoreServiceException extends KapuaException {

    private static final String DATASTORE_ERROR_MESSAGES = "datastore-service-error-messages";

    /**
     * Construct the exception with the provided error code
     *
     * @param code The {@link DatastoreServiceErrorCodes}
     * @since 1.3.0
     */
    public DatastoreServiceException(DatastoreServiceErrorCodes code) {
        super(code);
    }

    /**
     * Constructor.
     *
     * @param code      The {@link DatastoreServiceErrorCodes}
     * @param arguments Additional argument associated with the {@link DatastoreServiceException}.
     * @since 1.3.0
     */
    public DatastoreServiceException(DatastoreServiceErrorCodes code, Object... arguments) {
        super(code, arguments);
    }

    /**
     * Constructor.
     *
     * @param code      The {@link DatastoreServiceErrorCodes}
     * @param cause     The root {@link Throwable} of this {@link DatastoreServiceException}.
     * @param arguments Additional argument associated with the {@link DatastoreServiceException}.
     * @since 1.3.0
     */
    public DatastoreServiceException(DatastoreServiceErrorCodes code, Throwable cause, Object... arguments) {
        super(code, cause, arguments);
    }


    /**
     * Construct the exception with the provided code, {@link Throwable} and message
     *
     * @param code  The {@link DatastoreServiceErrorCodes}
     * @param cause The root {@link Throwable} of this {@link DatastoreServiceException}.
     * @since 1.3.0
     */
    public DatastoreServiceException(DatastoreServiceErrorCodes code, Throwable cause) {
        super(code, cause);
    }

    @Override
    protected String getKapuaErrorMessagesBundle() {
        return DATASTORE_ERROR_MESSAGES;
    }
}