/*
* Copyright 2004-2012 the original author or authors.
*
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
*/

/**
 * Gant script containing the Griffon build event system.
 *
 * @author Peter Ledbrook (Grails 1.1)
 */
// No point doing this stuff more than once.
if (getBinding().variables.containsKey("_args_parsing_called")) return
_args_parsing_called = true

target(name: 'parseArguments', description: "Parse the arguments passed on the command line", prehook: null, posthook: null) {
    // Do nothing, here for compatibility. This is now handled by the CommandLineParser class
}
