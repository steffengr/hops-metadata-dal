/*
 * Copyright (C) 2015 hops.io.
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
package io.hops.metadata.yarn.entity.rmstatestore;

import java.nio.ByteBuffer;

public class ApplicationAttemptState {

  private final String applicationid;
  private final String applicationattemptid;
  private final byte[] applicationattemptstate;
  private final String host;
  private final int rpcPort;
  private final ByteBuffer appAttemptTokens;
  private final String url;

  public ApplicationAttemptState(String applicationid,
      String applicationattemptid) {
    this(applicationid, applicationattemptid, null, null, 0, null, null);
  }

  public ApplicationAttemptState(String applicationid,
      String applicationattemptid, byte[] applicationattemptstate, String host,
      int rpcPort, ByteBuffer appAttemptTokens, String url) {
    this.applicationid = applicationid;
    this.applicationattemptid = applicationattemptid;
    this.applicationattemptstate = applicationattemptstate;
    this.host = host;
    this.rpcPort = rpcPort;
    this.appAttemptTokens = appAttemptTokens;
    this.url = url;
  }

  public String getApplicationId() {
    return applicationid;
  }

  public String getApplicationattemptid() {
    return applicationattemptid;
  }

  public byte[] getApplicationattemptstate() {
    return applicationattemptstate;
  }

  public String getHost() {
    return host;
  }

  public int getRpcPort() {
    return rpcPort;
  }

  public ByteBuffer getAppAttemptTokens() {
    return appAttemptTokens;
  }

  public String getUrl() {
    return url;
  }

  @Override
  public String toString() {
    String str = "HopApplicationState{" + "applicationid=" + applicationid +
        ", applicationattemptid=" + applicationattemptid;
    if (applicationattemptstate != null) {
      str +=
          ", applicationattemptstate length=" + applicationattemptstate.length;
    }
    str += '}';
    return str;
  }
}
