/*
 * Copyright (c) 2004 - 2007, Tranql project contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.tranql.connector;

import javax.resource.spi.ConnectionRequestInfo;
import javax.resource.spi.LocalTransaction;
import javax.resource.spi.ManagedConnection;
import javax.resource.spi.ResourceAdapterInternalException;
import javax.resource.spi.ManagedConnectionFactory;
import javax.security.auth.Subject;

/**
 *
 *
 * @version $Revision: 1.1 $ $Date: 2008/11/13 03:25:10 $
 */
public interface ManagedConnectionHandle extends ManagedConnection {
    Object getPhysicalConnection();

    void connectionClosed(Object handle);

    void connectionError(Exception e);

    boolean matches(ManagedConnectionFactory mcf, Subject subject, ConnectionRequestInfo connectionRequestInfo) throws ResourceAdapterInternalException;

    LocalTransaction getClientLocalTransaction();
}