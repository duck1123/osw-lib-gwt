/*
 *  Copyright 2010 Vodafone Group Services Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *    
 */
package org.onesocialweb.gwt.model;

import org.onesocialweb.model.relation.DefaultRelationFactory;
import org.onesocialweb.model.relation.RelationFactory;
import org.onesocialweb.xml.dom.AclDomReader;
import org.onesocialweb.xml.dom.RelationDomReader;

public class GwtRelationDomReader extends RelationDomReader {

	@Override
	protected AclDomReader getAclDomReader() {
		return new GwtAclDomReader();
	}

	@Override
	protected RelationFactory getRelationFactory() {
		return new DefaultRelationFactory();
	}

}
