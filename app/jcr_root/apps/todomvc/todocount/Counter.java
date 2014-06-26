/*
 * Copyright (c) 2014 Adobe Systems Incorporated. All rights reserved.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Please note that some portions of this project are written by third parties
 * under different license terms. Your use of those portions are governed by
 * the license terms contained in the corresponding files. 
 */

package apps.todomvc.todocount;

import com.adobe.cq.sightly.WCMUse;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;

import java.util.Iterator;

public class Counter extends WCMUse {
	int counter=0;

    public void activate() throws Exception {
		Iterator<Resource> todos = getResource().getChild("../main/listitems/todos").listChildren();

        while(todos.hasNext()){ 
            Resource res = todos.next();
			ValueMap properties = res.adaptTo(ValueMap.class);
            String completed = properties.get("completed", String.class);
            if(!"completed".equals(completed)){
                this.counter++;
            }
        }
    }

    public int getSize() {
        return counter;
    }
}