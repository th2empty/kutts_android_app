/*
 * Copyright (c) 2023 Denis <th2empty> Novikov
 *
 * This file is part of KUTTS.
 * KUTTS is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3, as published by the Free Software Foundation.
 * KUTTS is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License version 3 for more details.
 * You should have received a copy of the GNU General Public License version 3 along with KUTTS. If not, see <https://www.gnu.org/licenses/gpl-3.0.html>.
 *
 */

package su.th2empty.kutts.view.adapters

import su.th2empty.kutts.model.EducationalProgram
import su.th2empty.kutts.model.Location

interface RecyclerViewItemListener {

    /**
     * Handles the click event on the "Map" button.
     * @param location the location associated with the "Map" button click
     */
    fun onButtonClick(location: Location) {
        // Empty implementation. This method does not require mandatory
        // implementation in all RecyclerViews.
    }

    /**
     * Handles the click event on a RecyclerView child.
     * This method is empty as it does not require mandatory implementation in all RecyclerViews.
     */
    fun onClick() {
        // Empty implementation. This method does not require mandatory implementation in all RecyclerViews.
    }

    /**
     * Handles the click event on a RecyclerView child associated with an educational program.
     *
     * @param educationalProgram the educational program associated with the clicked child
     */
    fun onClick(educationalProgram: EducationalProgram) {
        // Implementation varies based on the context where this method is used.
        // Handles the click event on a RecyclerView child associated with an educational program.
    }
}