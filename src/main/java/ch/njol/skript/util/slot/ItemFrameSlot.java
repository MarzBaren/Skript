/*
 *   This file is part of Skript.
 *
 *  Skript is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Skript is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Skript.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * 
 * Copyright 2011-2016 Peter Güttinger and contributors
 * 
 */

package ch.njol.skript.util.slot;

import java.util.Locale;

import org.bukkit.entity.ItemFrame;
import org.bukkit.inventory.ItemStack;
import org.eclipse.jdt.annotation.Nullable;

import ch.njol.skript.registrations.Classes;

/**
 * Represents contents of an item frame.
 */
public class ItemFrameSlot extends Slot {
	
	private ItemFrame frame;
	
	public ItemFrameSlot(ItemFrame frame) {
		this.frame = frame;
	}

	@Override
	@Nullable
	public ItemStack getItem() {
		return frame.getItem();
	}

	@Override
	public void setItem(@Nullable ItemStack item) {
		frame.setItem(item);
	}

	@Override
	protected String toString_i() {
		return "frame slot of " + Classes.toString(frame);
	}

	@Override
	public boolean isSameSlot(Slot o) {
		if (o instanceof ItemFrameSlot) // Same item frame
			return ((ItemFrameSlot) o).frame.equals(frame);
		return false;
	}
	
}
