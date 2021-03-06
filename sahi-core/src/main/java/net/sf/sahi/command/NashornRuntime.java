/**
 * Sahi - Web Automation and Test Tool
 *
 * Copyright  2006  V Narayan Raman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.sahi.command;

import net.sf.sahi.playback.SahiScript;
import net.sf.sahi.request.HttpRequest;
import net.sf.sahi.response.HttpResponse;
import net.sf.sahi.response.NoCacheHttpResponse;
import net.sf.sahi.nashorn.NashornScriptRunner;
import net.sf.sahi.session.Session;
import org.apache.log4j.Logger;

public class NashornRuntime {
  private static final Logger logger = Logger.getLogger(NashornRuntime.class);

  public HttpResponse eval(final HttpRequest request) {
    Session session = request.session();
    String toEval = request.getParameter("toEval");
    logger.debug("Eval: " + toEval);
    NashornScriptRunner rsr = session.getScriptRunner();
    toEval = SahiScript.modifyFunctionNames(toEval);
    String result = rsr.eval(toEval);
    return new NoCacheHttpResponse(result);
  }
}
