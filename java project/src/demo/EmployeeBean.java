package demo;

import java.io.Serializable;

/**
 * @author LADDU
 *
 */
public class EmployeeBean implements Serializable {
	private String employeeId;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String gender;
	private String dob;
	private String emailId;
	private long mobileNumber;
	private long alternateMobileNumber;
	private long aadharNo;
	private String panNumber;
	private String passportNumber;
	private String permanentAddress;
	private String localAddress;

	private String schoolName;
	private int tenthPassedOut;
	private String intermediateCollegeName;
	private int interPassedOut;
	private String graduationDetails;
	private int graduationPassedOut;
	private String branch;
	private String university;

	private String companyName;
	private String role;
	private int noticePeriod;
	private String location;
	
	private String experience;
	private double currentCTC;
	private double expectedCTC;
	private String manager;
	
	private String bankname;
	private long bankAccNo;
	private String ifscCode;
	
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public long getBankAccNo() {
		return bankAccNo;
	}
	public void setBankAccNo(long bankAccNo) {
		this.bankAccNo = bankAccNo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifcsCode) {
		this.ifscCode = ifcsCode;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getLocalAddress() {
		return localAddress;
	}
	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getTenthPassedOut() {
		return tenthPassedOut;
	}
	public void setTenthPassedOut(int tenthPassedOut) {
		this.tenthPassedOut = tenthPassedOut;
	}
	public String getIntermediateCollegeName() {
		return intermediateCollegeName;
	}
	public void setIntermediateCollegeName(String intermediateCollegeName) {
		this.intermediateCollegeName = intermediateCollegeName;
	}
	public int getInterPassedOut() {
		return interPassedOut;
	}
	public void setInterPassedOut(int interPassedOut) {
		this.interPassedOut = interPassedOut;
	}
	public String getGraduationDetails() {
		return graduationDetails;
	}
	public void setGraduationDetails(String graduationDetails) {
		this.graduationDetails = graduationDetails;
	}
	public int getGraduationPassedOut() {
		return graduationPassedOut;
	}
	public void setGraduationPassedOut(int graduationPassedOut) {
		this.graduationPassedOut = graduationPassedOut;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public int getNoticePeriod() {
		return noticePeriod;
	}
	public void setNoticePeriod(int noticePeriod) {
		this.noticePeriod = noticePeriod;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public double getCurrentCTC() {
		return currentCTC;
	}
	public void setCurrentCTC(double currentCTC) {
		this.currentCTC = currentCTC;
	}
	public double getExpectedCTC() {
		return expectedCTC;
	}
	public void setExpectedCTC(double expectedCTC) {
		this.expectedCTC = expectedCTC;
	}
	public long getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	public void setAlternateMobileNumber(long alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	
}