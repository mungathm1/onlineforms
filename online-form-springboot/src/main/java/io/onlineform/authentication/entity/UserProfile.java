package io.onlineform.authentication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_profile", schema = "onlineform")
public class UserProfile extends AuditModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Integer user_id;
	@Column(name = "first_nm")
	private String firstNm;
	@Column(name = "last_nm")
	private String lastNm;
	@Column(name = "email")
	private String email;
	@Column(name = "phone_nr")
	private String phoneNr;
	@Column(name = "user_type")
	private String userType;
	@Column(name = "establishment_nm")
	private String establishmentNm;
	@Column(name = "user_role")
	private String userRole;
	@Column(name = "status")
	private String status;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "updated_by")
	private String updatedBy;
	
	@OneToMany(targetEntity = UserPasswords.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = false, updatable = false, insertable = true)
	private List<UserPasswords> userPasswords;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getFirstNm() {
		return firstNm;
	}

	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	public String getLastNm() {
		return lastNm;
	}

	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNr() {
		return phoneNr;
	}

	public void setPhoneNr(String phoneNr) {
		this.phoneNr = phoneNr;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEstablishmentNm() {
		return establishmentNm;
	}

	public void setEstablishmentNm(String establishmentNm) {
		this.establishmentNm = establishmentNm;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public List<UserPasswords> getUserPasswords() {
		return userPasswords;
	}

	public void setUserPasswords(List<UserPasswords> userPasswords) {
		this.userPasswords = userPasswords;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((establishmentNm == null) ? 0 : establishmentNm.hashCode());
		result = prime * result + ((firstNm == null) ? 0 : firstNm.hashCode());
		result = prime * result + ((lastNm == null) ? 0 : lastNm.hashCode());
		result = prime * result + ((phoneNr == null) ? 0 : phoneNr.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((updatedBy == null) ? 0 : updatedBy.hashCode());
		result = prime * result + ((userRole == null) ? 0 : userRole.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserProfile other = (UserProfile) obj;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (establishmentNm == null) {
			if (other.establishmentNm != null)
				return false;
		} else if (!establishmentNm.equals(other.establishmentNm))
			return false;
		if (firstNm == null) {
			if (other.firstNm != null)
				return false;
		} else if (!firstNm.equals(other.firstNm))
			return false;
		if (lastNm == null) {
			if (other.lastNm != null)
				return false;
		} else if (!lastNm.equals(other.lastNm))
			return false;
		if (phoneNr == null) {
			if (other.phoneNr != null)
				return false;
		} else if (!phoneNr.equals(other.phoneNr))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (updatedBy == null) {
			if (other.updatedBy != null)
				return false;
		} else if (!updatedBy.equals(other.updatedBy))
			return false;
		if (userRole == null) {
			if (other.userRole != null)
				return false;
		} else if (!userRole.equals(other.userRole))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		return true;
	}

}
