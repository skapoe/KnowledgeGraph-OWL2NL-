/*
 * #%L
 * ASSESS
 * %%
 * Copyright (C) 2015 Agile Knowledge Engineering and Semantic Web (AKSW)
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/**
 * 
 */
package org.aksw.assessment.util;

import java.util.Comparator;

import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.sparql.util.NodeUtils;

/**
 * A comparator for RDFNode objects.
 * @author Lorenz Buehmann
 *
 */
public class RDFNodeComparator implements Comparator<RDFNode> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(RDFNode o1, RDFNode o2) {
		return NodeUtils.compareRDFTerms(o1.asNode(), o2.asNode());
	}

}
