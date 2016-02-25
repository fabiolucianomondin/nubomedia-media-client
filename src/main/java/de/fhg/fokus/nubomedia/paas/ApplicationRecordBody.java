/*******************************************************************************
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * @author Alice Cheambe <alice.cheambe[at]fokus.fraunhofer.de>
 *******************************************************************************/
package de.fhg.fokus.nubomedia.paas;

public class ApplicationRecordBody {
	private int points;
	private String extAppId;
	
	// Getters and setters are not required for this example.
    // GSON sets the fields directly using reflection.

    public ApplicationRecordBody(String string, int i) {
		points = i;
		extAppId = string;
	}

	@Override
    public String toString() {
        return points + " - " + extAppId;
    }
}
