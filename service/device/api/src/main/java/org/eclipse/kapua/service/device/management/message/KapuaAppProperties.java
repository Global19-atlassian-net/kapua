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

import org.eclipse.kapua.service.device.management.message.xml.KapuaAppPropertiesXmlAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Kapua application property definition.
 *
 * @since 1.0
 */
@XmlJavaTypeAdapter(KapuaAppPropertiesXmlAdapter.class)
public interface KapuaAppProperties {

    /**
     * Get the property value
     *
     * @return
     */
    String getValue();
}
