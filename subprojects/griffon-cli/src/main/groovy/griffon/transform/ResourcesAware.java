/*
 * Copyright 2009-2012 the original author or authors.
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
 */

package griffon.transform;

import org.codehaus.groovy.transform.GroovyASTTransformationClass;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Annotates a class.</p>
 *
 * <p>When annotating a class it indicates that it will be able to locate
 * resozrces using Griffon's standard resource loading mechanism.</p>
 *
 * The following methods will be added to classes annotated with &#064;ResourcesAware
 * <ul>
 * <li><code>public URL getResourceAsURL(java.lang.String)</code><br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;returns the resource URL if found</li>
 *  <li><code>public URL getResourceAsStream(java.lang.String)</code><br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;opens a stream to the resource if found</li>
 *  <li><code>public List&gt;URL&lt; getResources(java.lang.String)</code><br/>
 * &nbsp;&nbsp;&nbsp;&nbsp;returns all matching resources for the specified name</li>
 * <p/>
 * </ul>
 *
 * @author Andres Almiray
 * @see org.codehaus.griffon.ast.ResourcesAwareASTTransformation
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@GroovyASTTransformationClass("org.codehaus.griffon.ast.ResourcesAwareASTTransformation")
public @interface ResourcesAware {
}
