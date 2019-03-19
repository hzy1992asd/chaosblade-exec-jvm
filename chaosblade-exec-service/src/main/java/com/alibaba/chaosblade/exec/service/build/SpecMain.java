/*
 * Copyright 1999-2019 Alibaba Group Holding Ltd.
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

package com.alibaba.chaosblade.exec.service.build;

/**
 * @author Changjun Xiao
 */
public class SpecMain {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new RuntimeException("less plugin path");
        }
        String pluginPath = args[0];
        String specFileName = "jvm.spec.yaml";
        if (args.length > 1) {
            specFileName = args[1];
        }
        BuildUtil.generatePluginSpec(pluginPath, specFileName);
    }
}
