/*******************************************************************************
 * Copyright (c) 2016, 2020 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.user.internal;

import org.eclipse.kapua.commons.model.query.AbstractKapuaQuery;
import org.eclipse.kapua.model.id.KapuaId;
import org.eclipse.kapua.service.user.UserQuery;

/**
 * User query implementation.
 *
 * @since 1.0
 */
public class UserQueryImpl extends AbstractKapuaQuery implements UserQuery {

    /**
     * Constructor
     */
    private UserQueryImpl() {
        super();
    }

    /**
     * Constructor
     *
     * @param scopeId
     */
    public UserQueryImpl(KapuaId scopeId) {
        this();
        setScopeId(scopeId);
    }

    @Override
    public <T> UserMatchPredicateImpl<T> matchPredicate(T matchTerm) {
        return new UserMatchPredicateImpl<>(matchTerm);
    }

}
