/*
 * Copyright 2014 CyberVision, Inc.
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

/**
 * Copyright 2014 CyberVision, Inc.
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
package org.kaaproject.kaa.examples.robotrun.controller.events;

import java.util.Map;

import org.kaaproject.kaa.examples.robotrun.labyrinth.Cell;
import org.kaaproject.kaa.examples.robotrun.labyrinth.RobotPosition;

public interface EventManager {

    void init();
    
    void resetEndpoints();
    
    void startRun();
    
    int getRobotCount();

    Map<String, RobotPosition> getRobotPositions();

    void requestMove(Cell cell, MoveEventListener moveListener);
    
    void reportLocation(Cell cell);
    
    void exitFound(Cell cell);

    boolean addListener(EventListener listener);

    boolean removeListener(EventListener listener);
    
    void reset();
}