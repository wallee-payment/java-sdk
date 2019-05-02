/**
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
 * @author   customweb GmbH (www.customweb.com)
 */
package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.Label;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * DebtCollectionCaseDocument
 */
public class DebtCollectionCaseDocument {

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("debtCollectionCase")
	private Long debtCollectionCase = null;

	@SerializedName("fileName")
	private String fileName = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("labels")
	private List<Label> labels = new ArrayList<Label>();

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("mimeType")
	private String mimeType = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("storageId")
	private String storageId = null;

	@SerializedName("uniqueId")
	private String uniqueId = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The created on date indicates the date on which the entity was stored into the database.
	 *
	 * @return The created on date indicates the date on which the entity was stored into the database.
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * debtCollectionCase
	 *
	 * @return debtCollectionCase
	 */
	public Long getDebtCollectionCase() {
		return debtCollectionCase;
	}

	/**
	 * fileName
	 *
	 * @return fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * labels
	 *
	 * @return labels
	 */
	public List<Label> getLabels() {
		return labels;
	}

	/**
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * mimeType
	 *
	 * @return mimeType
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	public OffsetDateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * storageId
	 *
	 * @return storageId
	 */
	public String getStorageId() {
		return storageId;
	}

	/**
	 * uniqueId
	 *
	 * @return uniqueId
	 */
	public String getUniqueId() {
		return uniqueId;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	public Integer getVersion() {
		return version;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DebtCollectionCaseDocument debtCollectionCaseDocument = (DebtCollectionCaseDocument) o;
		return Objects.equals(this.createdOn, debtCollectionCaseDocument.createdOn) &&
				Objects.equals(this.debtCollectionCase, debtCollectionCaseDocument.debtCollectionCase) &&
				Objects.equals(this.fileName, debtCollectionCaseDocument.fileName) &&
				Objects.equals(this.id, debtCollectionCaseDocument.id) &&
				Objects.equals(this.labels, debtCollectionCaseDocument.labels) &&
				Objects.equals(this.linkedSpaceId, debtCollectionCaseDocument.linkedSpaceId) &&
				Objects.equals(this.mimeType, debtCollectionCaseDocument.mimeType) &&
				Objects.equals(this.plannedPurgeDate, debtCollectionCaseDocument.plannedPurgeDate) &&
				Objects.equals(this.storageId, debtCollectionCaseDocument.storageId) &&
				Objects.equals(this.uniqueId, debtCollectionCaseDocument.uniqueId) &&
				Objects.equals(this.version, debtCollectionCaseDocument.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, debtCollectionCase, fileName, id, labels, linkedSpaceId, mimeType, plannedPurgeDate, storageId, uniqueId, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DebtCollectionCaseDocument {\n");
		
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		debtCollectionCase: ").append(toIndentedString(debtCollectionCase)).append("\n");
		sb.append("		fileName: ").append(toIndentedString(fileName)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		storageId: ").append(toIndentedString(storageId)).append("\n");
		sb.append("		uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n		");
	}

}

