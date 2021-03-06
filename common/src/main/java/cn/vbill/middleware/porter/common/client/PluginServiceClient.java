/*
 * Copyright ©2018 vbill.cn.
 * <p>
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
 * </p>
 */

package cn.vbill.middleware.porter.common.client;


import org.apache.commons.lang3.StringUtils;

/**
 * 插件服务客户端接口
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年04月25日 10:28
 * @version: V1.0
 * @review: zkevin/2018年04月25日 10:28
 */
public interface PluginServiceClient {
    /**
     * 用于插件服务客户端加载匹配
     * @param clientName
     * @return
     */
    default boolean isMatch(String clientName) {
        return StringUtils.trimToEmpty(getClientName()).equals(StringUtils.trimToEmpty(clientName));
    }

    /**
     * 获取客户端名称
     * @return
     */
    String getClientName();
}
