/*
 * The MIT License
 *
 * Copyright 2014 SBPrime.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.primesoft.asyncworldedit.worldedit.world;

import java.util.UUID;

/**
 *
 * @author SBPrime
 */
public abstract class BaseAsyncParams {
    private final boolean m_isAsync;
    private final int m_jobId;
    private final UUID m_player;
    private final boolean m_empty;

    
    public boolean isEmpty() {
        return m_empty;
    }
    
    public boolean isAsync() {
        return m_isAsync;
    }

    
    public int getJobId() {
        return m_jobId;
    }

    public UUID getPlayer() {
        return m_player;
    }
    
    public BaseAsyncParams(boolean isAsync, int jobId, boolean isEmpty, UUID player) {
        m_isAsync = isAsync;
        m_jobId = jobId;
        m_player = player;
        m_empty = isEmpty;
    }
    
}