package edu.uncc.parsets.parsets;

import java.awt.FontMetrics;

import javax.media.opengl.GL;

import com.sun.opengl.util.j2d.TextRenderer;

import edu.uncc.parsets.data.CategoryTree;
import edu.uncc.parsets.data.DimensionHandle;
import edu.uncc.parsets.util.AnimatableProperty;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\
 * Copyright (c) 2009, Robert Kosara, Caroline Ziemkiewicz,
 *                     and others (see Authors.txt for full list)
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of UNC Charlotte nor the names of its contributors
 *      may be used to endorse or promote products derived from this software
 *      without specific prior written permission.
 *      
 * THIS SOFTWARE IS PROVIDED BY ITS AUTHORS ''AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
\* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

public abstract class VisualAxis {

	protected AnimatableProperty barY;

	public void setBarY(float barY) {
		this.barY.setValue(barY);
	}

	public abstract void display(GL gl, TextRenderer dimFont, FontMetrics dimFontMetrics,
			TextRenderer catFont, FontMetrics catFontMetrics);

	public abstract void layout(int y, int xOffset, int width, int gap, int barHeight, CategoryTree dataTree);
		
	public abstract void setTopLevel(boolean isTopLevel);
	
	public abstract DimensionHandle getDimension();

	public float getBarY() {
		return barY.getValue();
	}
	
	public abstract CategoryBar findBar(int x, int y);

	public abstract boolean containsY(int y);
}
