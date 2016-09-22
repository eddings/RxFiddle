/*
 * RxFiddle - Rx debugger
 * Copyright (C) 2016 Herman Banken
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package nl.hermanbanken.rxfiddle.data;

public class InvokeResult implements RxFiddleEvent {
  public final Invoke invoke;
  public final Object result;

  public InvokeResult(Invoke invoke, Object result) {
    this.invoke = invoke;
    this.result = result;
  }

  @Override
  public String toString() {
    return String.format(
        "%s => %s", invoke == null ? "null" : invoke.toString(), Utils.objectToString(result));
  }
}
