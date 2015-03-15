/*
 * Copyright 2015 Real Logic Ltd.
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
 */
package uk.co.real_logic.agrona.collections;

/**
 * This is a (long,long) primitive specialisation of a BiConsumer
 */
@FunctionalInterface
public interface LongLongConsumer
{
    /**
     * Accept a key and value that comes as a tuple of longs.
     *
     * @param key   for the tuple.
     * @param value for the tuple.
     */
    void accept(long key, long value);
}
