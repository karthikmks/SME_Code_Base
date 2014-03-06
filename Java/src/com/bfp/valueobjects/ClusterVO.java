package com.bfp.valueobjects;

/**
 * @author tiruppathir
 *
 */
public class ClusterVO {

	private String clusterId;
	public String getClusterId() {
		return clusterId;
	}
	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}
	public String getClusterName() {
		return clusterName;
	}
	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}
	public String getClusterInCharge() {
		return clusterInCharge;
	}
	public void setClusterInCharge(String clusterInCharge) {
		this.clusterInCharge = clusterInCharge;
	}
	public String getClusterinChargeContactDetails() {
		return clusterinChargeContactDetails;
	}
	public void setClusterinChargeContactDetails(
			String clusterinChargeContactDetails) {
		this.clusterinChargeContactDetails = clusterinChargeContactDetails;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	private String clusterName;
	private String clusterInCharge;
	private String clusterinChargeContactDetails;
	private String notes;
	
}
