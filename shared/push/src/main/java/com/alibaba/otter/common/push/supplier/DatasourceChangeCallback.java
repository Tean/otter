/*
 * Copyright (C) 2010-2101 Alibaba Group Holding Limited.
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

package com.alibaba.otter.common.push.supplier;

/**
 * callback 处理的时间请尽量短，如果时间太长，请使用异步
 * 
 * @author zebin.xuzb 2012-9-25 下午12:14:28
 * @version 4.1.0
 */
public interface DatasourceChangeCallback {

    void masterChanged(DatasourceInfo newMaster);

}
