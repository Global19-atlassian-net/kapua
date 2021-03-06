/*******************************************************************************
 * Copyright (c) 2016, 2021 Eurotech and/or its affiliates and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.device.management.message;

/**
 * Kapua application message channel definition.<br>
 * This object defines the common channel behavior for a Kapua request or response message.<br>
 * The request message is used to perform interactive operations with the device (e.g. to send command to the device, to ask configurations...)
 *
 * @since 1.0
 */
public interface KapuaAppChannel extends KapuaControlChannel {

    /**
     * Get the application name
     *
     * @return
     */
    KapuaAppProperties getAppName();

    /**
     * Set the application name
     *
     * @param app
     */
    void setAppName(KapuaAppProperties app);

    /**
     * Get the application version
     *
     * @return
     */
    KapuaAppProperties getVersion();

    /**
     * Set the application version
     *
     * @param version
     */
    void setVersion(KapuaAppProperties version);
}
