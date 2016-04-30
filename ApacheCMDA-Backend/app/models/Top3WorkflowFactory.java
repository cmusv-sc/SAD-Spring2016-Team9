/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package models;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Modifier;
import javax.persistence.*;
import java.util.Set;
import java.util.HashMap;
import java.util.List;

public class Top3WorkflowFactory {
	private static final HashMap<List<Workflow>, String> top3WorkflowMap = new HashMap<>();

	public static String getTop3Workflow(List<Workflow> topWorkflow) {
		String result = top3WorkflowMap.get(topWorkflow);

		if (result == null) {
			result = new GsonBuilder().excludeFieldsWithModifiers(Modifier.PROTECTED).create().toJson(topWorkflow);
			top3WorkflowMap.put(topWorkflow, result);
			System.out.println("maintain map for topworkflow");
		}
		return result;
	}
}