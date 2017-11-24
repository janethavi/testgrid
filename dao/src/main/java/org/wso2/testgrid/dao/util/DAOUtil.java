/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.testgrid.dao.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Utility class to handle DAO related common operations.
 *
 * @since 1.0.0
 */
public class DAOUtil {

    private static final String TESTGRID_PERSISTENT_UNIT = "eclipse_link_jpa";

    /**
     * Returns the entity manager factory for the test grid persistent unit.
     *
     * @return entity manager factory for the test grid persistent unit
     */
    public static EntityManagerFactory getEntityManagerFactory() {
        return Persistence.createEntityManagerFactory(TESTGRID_PERSISTENT_UNIT);
    }
}