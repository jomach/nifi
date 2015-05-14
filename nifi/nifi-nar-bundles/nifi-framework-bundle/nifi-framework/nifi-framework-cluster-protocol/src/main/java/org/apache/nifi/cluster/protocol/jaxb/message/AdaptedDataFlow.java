/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.cluster.protocol.jaxb.message;

/**
 */
public class AdaptedDataFlow {

    private byte[] flow;
    private byte[] templates;
    private byte[] snippets;

    private boolean autoStartProcessors;

    public AdaptedDataFlow() {
    }

    public byte[] getFlow() {
        return flow;
    }

    public void setFlow(byte[] flow) {
        this.flow = flow;
    }

    public byte[] getTemplates() {
        return templates;
    }

    public void setTemplates(byte[] templates) {
        this.templates = templates;
    }

    public byte[] getSnippets() {
        return snippets;
    }

    public void setSnippets(byte[] snippets) {
        this.snippets = snippets;
    }

    public boolean isAutoStartProcessors() {
        return autoStartProcessors;
    }

    public void setAutoStartProcessors(boolean runningAllProcessors) {
        this.autoStartProcessors = runningAllProcessors;
    }

}
