/*
 *  Copyright 2016-2024 Qameta Software Inc
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
 */
package io.qameta.allure.context;

import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JacksonContextTest {

    @Test
    void shouldCreateJacksonContext() {
        final JacksonContext context = new JacksonContext();
        assertThat(context.getValue())
                .isNotNull();
    }

    @Test
    void shouldUseMinified() {
        final JacksonContext context = new JacksonContext();
        final SerializationConfig config = context.getValue().getSerializationConfig();
        assertThat(config.isEnabled(SerializationFeature.INDENT_OUTPUT))
                .isFalse();
    }
}
