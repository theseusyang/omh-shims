/*
 * Copyright 2014 Open mHealth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openmhealth.schema.pojos.generic;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * @author Danilo Bonilla
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MassUnitValue {

    @JsonProperty(value = "value", required = true)
    private BigDecimal value;

    @JsonProperty(value = "unit", required = true)
    private MassUnit unit;

    public enum MassUnit {fg, pg, ng, micg, mg, g, kg, metric_ton, gr, oz, lb, ton}

    public MassUnitValue() {
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public MassUnit getUnit() {
        return unit;
    }

    public void setUnit(MassUnit unit) {
        this.unit = unit;
    }
}
